package byps.test.api.srvr;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_ClientIF_getStreams extends BMethodRequest implements Serializable {

	public int ctrl;
	
	public final static long serialVersionUID = 1654980071L;
	
	public int getRemoteId() { return 2049072174; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final ClientIFAsync __byps__remoteT = (ClientIFAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.List<java.io.InputStream>> __byps__outerResult = new BAsyncResultSendMethod<java.util.List<java.io.InputStream>>(__byps__asyncResult, new byps.test.api.BResult_1218831438());			
			__byps__remoteT.getStreams(ctrl, __byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}