package byps.http;
/* USE THIS FILE ACCORDING TO THE COPYRIGHT RULES IN LICENSE.TXT WHICH IS PART OF THE SOURCE CODE PACKAGE */
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import byps.BContentStream;
import byps.BException;
import byps.BExceptionC;

public class HIncomingStreamAsync extends BContentStream  {

	private static Log log = LogFactory.getLog(HIncomingStreamAsync.class);
	protected InputStream is;
	protected final HRequestContext rctxt;
	protected final File tempDir;
	protected final long streamId;
	
	protected long readPos = 0;
	protected long readMark = 0;
	
	private AtomicBoolean closed = new AtomicBoolean();

	HIncomingStreamAsync(String contentType, long contentLength, String contentDisposition, long streamId, long lifetimeMillis, File tempDir, HRequestContext rctxt) throws IOException {
		super(contentType, contentLength, lifetimeMillis);
		this.rctxt = rctxt;
		this.is = rctxt.getRequest().getInputStream();
		this.tempDir = tempDir;
		this.streamId = streamId;
		setContentDisposition(contentDisposition);
	}
	
	private final InputStream strm() throws IOException {
		if (closed.get()) {
			if (log.isDebugEnabled()) log.debug("Outgoing stream already closed, streamId=" + streamId);
			throw new IOException("Stream is closed");
		}
		return is;
	}

	@Override
	public int read() throws IOException {
		if (log.isDebugEnabled()) log.debug("read(");
		int b = strm().read();
		readPos++;
		if (log.isDebugEnabled()) log.debug(")read=" + b);
		return b;
	}

	@Override
	public int available() throws IOException {
		return strm().available();
	}
	
	@Override
	public void close() throws IOException {
		if (log.isDebugEnabled()) log.debug("close(streamId=" + streamId);
		
		boolean alreadyClosed = closed.getAndSet(true);
		if (log.isDebugEnabled()) log.debug("alreadyClosed=" + alreadyClosed);
		if (!alreadyClosed) {
		
			if (log.isDebugEnabled()) log.debug("complete AsyncContext of streamId=" + streamId + " with status=" + HttpServletResponse.SC_OK);
			
			// The stream data must be completely read.
			// Otherwise the data remains in the socket and 
			// disturbs the next request.
			int c = 0;
			while ((c = is.read()) != -1) {
				if (log.isDebugEnabled()) log.debug("read before close, " + (char)c);
			}
			is.close();
			
			HttpServletResponse response = (HttpServletResponse)rctxt.getResponse();
			response.getOutputStream().close();
			response.setStatus(HttpServletResponse.SC_OK);
			rctxt.complete();
		}
		if (log.isDebugEnabled()) log.debug(")close");
	}
	
	@Override
	public void mark(int readlimit) {
		readMark = readPos;
		is.mark(readlimit);
	}
	
	@Override
	public boolean markSupported() {
		return is.markSupported();
	}
	@Override
	public int read(byte[] b) throws IOException {
		return read(b, 0, b.length);
	}
	
	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		if (log.isDebugEnabled()) log.debug("read " + streamId + "(" + b + ", offs=" + off + ", len=" + len);
		try {
			int n = strm().read(b, off, len);
			if (n != -1) {
			  readPos += n;
			}
			if (log.isDebugEnabled()) log.debug(")read=" + n);
			return n;
		}
		catch (IOException e) {
			if (log.isDebugEnabled()) log.debug("exception: ", e);
			throw e;
		}
	}
	
	@Override
	public void reset() throws IOException {
		readPos = readMark;
		strm().reset();
	}
	
	@Override
	public long skip(long n) throws IOException {
		readPos += n;
		return strm().skip(n);
	}

	@Override
	public synchronized BContentStream cloneInputStream() throws BException {
		if (readPos != 0) throw new BException(BExceptionC.INTERNAL, "InputStream cannot be copied after bytes alread have been read.");
		HIncomingStreamSync istrm = null;
		try {
		  istrm = new HIncomingStreamSync(contentType, contentLength, getContentDisposition(), streamId, lifetimeMillis, tempDir);
			istrm.assignStream(strm());
		} catch (IOException e) {
			throw new BException(BExceptionC.IOERROR, "Failed to clone stream", e);
		}
		return istrm;
	}
	

}
