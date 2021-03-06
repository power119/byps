package byps.http.client.asf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;

import byps.BAsyncResult;
import byps.BContentStream;
import byps.BException;
import byps.BExceptionC;

public class AsfPutStream extends AsfRequest {
  
  private static Log log = LogFactory.getLog(AsfPutStream.class);
  private final InputStream stream;
  private final BAsyncResult<ByteBuffer> asyncResult;
  private final static int CHUNK_SIZE = 10 * 1000;
  private final static int MAX_STREAM_PART_SIZE = 1000 * CHUNK_SIZE; // should be a multiple of CHUNK_SIZE

  protected AsfPutStream(String url, InputStream stream, BAsyncResult<ByteBuffer> asyncResult, CloseableHttpClient httpClient) {
    super(url, httpClient);
    this.stream = stream;
    this.asyncResult = asyncResult;
  }

  @Override
  public void run() {
    
    Throwable returnException = null;

    try {
      
      // Try to get content type and stream length
      String contentType = null;
      long totalLength = -1L;
      String contentDisposition = null;
      
      if (stream instanceof BContentStream) {
        BContentStream cstream = (BContentStream)stream;
        contentType = cstream.getContentType();
        totalLength = cstream.getContentLength();
        contentDisposition = cstream.getContentDisposition();
      }
      else if (stream instanceof ByteArrayInputStream) {
        contentType = BContentStream.DEFAULT_CONTENT_TYPE;
        totalLength = ((ByteArrayInputStream)stream).available();
      }

      if (contentType == null || contentType.length() == 0) {
        contentType = BContentStream.DEFAULT_CONTENT_TYPE;
      }
      if (log.isDebugEnabled()) log.debug("Content-Type=" + contentType);
        
      
      // Compute number of stream parts
      long nbOfParts = 1; 
      if (totalLength > 0) {
        nbOfParts = totalLength / MAX_STREAM_PART_SIZE;
        if ((totalLength % MAX_STREAM_PART_SIZE) != 0) {
          nbOfParts++;
        }
        if (log.isDebugEnabled()) log.debug("send stream in #parts=" + nbOfParts);
      }
      else if (totalLength < 0) {
        nbOfParts = Long.MAX_VALUE;
      }
      
      boolean lastPart = false;
      
      for (long partId = 0; partId < nbOfParts && !lastPart; partId++) {
        
        if (isCancelled()) {
          if (log.isDebugEnabled()) log.debug("request is cancelled.");
          break;
        }
        
        // Read the first chunk to find out, 
        // wether it is the last part to be sent.
        ByteBuffer bbuf = ByteBuffer.allocate(CHUNK_SIZE);
        ReadableByteChannel ch = Channels.newChannel(stream);
        bbuf.limit(CHUNK_SIZE);
        int len = ch.read(bbuf);
        
        if (totalLength >= 0) {
          lastPart = partId == nbOfParts-1;
        }
        else {
          lastPart = len < CHUNK_SIZE;
        }

        // Read part in memory.
        // This allows to obtain Content-Length header.
        while (len != -1 && bbuf.position() < MAX_STREAM_PART_SIZE) {

          // Need to enlarge buffer?
          if (bbuf.remaining() == 0) {
            
            // Allocate new buffer, capacity is 10x larger
            int cap = Math.min(MAX_STREAM_PART_SIZE, bbuf.capacity() * 10);
            ByteBuffer nbuf = ByteBuffer.allocate(cap);
            bbuf.flip();
            nbuf.put(bbuf);
            bbuf = nbuf;
          }
         
          // Check whether request was cancelled
          if (isCancelled()) throw new BException(BExceptionC.CANCELLED, "");

          // Read into buffer, reads up to bbuf.remaining() bytes and sets position.  
          len = ch.read(bbuf);
        }
        bbuf.flip();
        
        // Send request
        sendPart(partId, lastPart, totalLength, contentType, contentDisposition, bbuf);
        
      }        
    }
    catch (BException e) {
      // thrown in RequestToCancel.setConnection
      if (log.isDebugEnabled()) log.debug("received BException: " + e);
      returnException = e;
    }
    catch (Throwable e) {
      if (log.isDebugEnabled()) log.debug("received Throwable: " + e);
      if (isCancelled()) {
        BException bex = new BException(BExceptionC.CANCELLED, "");
        returnException = bex;
      }
      else {
        BException bex = new BException(BExceptionC.IOERROR, e.getMessage(), e);
        returnException = bex;
      }
    }
    finally {
      
      if (stream != null) {
        if (log.isDebugEnabled()) log.debug("close stream, url=" + url + ", stream=" + stream);
        try { stream.close(); } catch (IOException ignored) {}
      }
      
      asyncResult.setAsyncResult(null, returnException);
      done();
    }
    
  }

  /**
   * Send bytes to the server by HTTP PUT.
   * @param partId 
   * @param islastPart
   * @param totalLength
   * @param contentType
   * @param contentDisposition 
   * @param bbuf
   * @throws BException
   * @throws IOException
   * @throws ClientProtocolException
   */
  private void sendPart(long partId, boolean lastPart, long totalLength, String contentType, String contentDisposition, final ByteBuffer bbuf) throws BException, IOException, ClientProtocolException {
    
    StringBuilder destUrl = new StringBuilder();
    destUrl.append(url)
      .append("&partid=").append(partId)
      .append("&last=").append(lastPart ? 1 : 0)
      .append("&total=").append(totalLength);
    if (log.isDebugEnabled()) log.debug("open connection, url=" + destUrl);
      
    if (isCancelled()) {
      throw new BException(BExceptionC.CANCELLED, "");
    }
    
    CloseableHttpResponse response = null;
    
    try {

      request = new HttpPut(destUrl.toString());
      request.setHeader("Content-Type", contentType);
      
      if (contentDisposition != null && contentDisposition.length() != 0) {
        request.setHeader("Content-Disposition", contentDisposition);
      }

      applyTimeout();
      
      byte[] content = bbuf.array();
      ((HttpEntityEnclosingRequestBase)request).setEntity(new ByteArrayEntity(content, bbuf.position(), bbuf.remaining()));
      response = httpClient.execute(request);
      
      request = null;
 
      // Check status code.
      int statusCode = response.getStatusLine().getStatusCode();
      if (statusCode != HttpURLConnection.HTTP_OK) {
        throw new IOException("HTTP status " + statusCode);
      }
      
    }
    finally {
      if (response != null) {
        try {
          response.close();
        }
        catch (IOException e) {
        }
      }
    }
    
  }

}
