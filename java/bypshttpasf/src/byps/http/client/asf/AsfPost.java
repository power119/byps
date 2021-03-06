package byps.http.client.asf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.nio.ByteBuffer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;

import byps.BAsyncResult;
import byps.BBufferJson;
import byps.BException;
import byps.BExceptionC;
import byps.BMessageHeader;
import byps.BWire;

public class AsfPost extends AsfRequest {

  private static Log log = LogFactory.getLog(AsfPost.class);
  private final ByteBuffer buf;
  private final BAsyncResult<ByteBuffer> asyncResult;
  
  protected AsfPost(String url, ByteBuffer buf, BAsyncResult<ByteBuffer> asyncResult, CloseableHttpClient httpClient) {
    super(url, httpClient);
    this.buf = buf;
    this.asyncResult = asyncResult;
  }

  @Override
  public void run() {
    
    request = new HttpPost(url);
    applyTimeout();
    
    CloseableHttpResponse response = null; 
    InputStream is = null;
    ByteBuffer returnBuffer = null;
    Throwable returnException = null;
    int statusCode = BExceptionC.CONNECTION_TO_SERVER_FAILED;
    final boolean isJson = BMessageHeader.detectProtocol(buf) == BMessageHeader.MAGIC_JSON;
    final String contentType = isJson ? "application/json;charset=UTF-8" : "application/byps";

    try {

      request.setHeader("Accept", "application/json, application/byps");
      request.setHeader("Accept-Encoding", "gzip");
      request.setHeader("Content-Type", contentType);
      if (isJson) {
        request.setHeader("Content-Encoding", "gzip");
      }
      
      byte[] content = buf.array();
      if (isJson || buf.position() != 0) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        BWire.bufferToStream(buf, isJson, bos);
        content = bos.toByteArray();
      }
      
      ((HttpPost)request).setEntity(new ByteArrayEntity(content));
      
      response = httpClient.execute(request);

      statusCode = response.getStatusLine().getStatusCode();
      if (statusCode != HttpURLConnection.HTTP_OK) {
        throw new IOException("HTTP status " + statusCode);
      }

      HttpEntity entity = response.getEntity();

      boolean gzip = false;
      {
        Header header = entity.getContentEncoding();
        if (header != null) {
          String enc = header.getValue();
          gzip = enc != null && enc.equals("gzip");
        }
      }

      is = response.getEntity().getContent();

      if (log.isDebugEnabled()) log.debug("read stream");
      ByteBuffer obuf = BWire.bufferFromStream(is, gzip);
      if (log.isDebugEnabled()) {
        log.debug("received #bytes=" + obuf.remaining());
        obuf.mark();
        BBufferJson bbuf = new BBufferJson(obuf);
        log.debug(bbuf.toDetailString());
        obuf.reset();
      }

      is = null;
      returnBuffer = obuf;
    }
    catch (SocketException e) {
      if (log.isDebugEnabled()) log.debug("received exception=", e);
      returnException = new BException(BExceptionC.CONNECTION_TO_SERVER_FAILED, "Socket error", e);
    }
    catch (Throwable e) {
      if (log.isDebugEnabled()) log.debug("received exception=", e);
      returnException = new BException(statusCode, "Send message failed", e);
    }
    finally {
      if (is != null) {
        try {
          is.close();
        }
        catch (IOException ignored) {
        }
      }
      
      if (response != null) {
        try {
          response.close();
        }
        catch (IOException e) {
        }
      }
      
      asyncResult.setAsyncResult(returnBuffer, returnException);
      done();
    }
    
  }
  
}
