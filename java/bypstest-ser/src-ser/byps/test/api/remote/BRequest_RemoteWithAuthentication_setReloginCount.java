package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_RemoteWithAuthentication_setReloginCount extends BMethodRequest implements Serializable {

	public int count;
	
	public final static long serialVersionUID = 802968058L;
	
	public int getRemoteId() { return 1983670399; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteWithAuthenticationAsync __byps__remoteT = (RemoteWithAuthenticationAsync)__byps__remote;			
			BAsyncResultSendMethod<Object> __byps__outerResult = new BAsyncResultSendMethod<Object>(__byps__asyncResult, new byps.test.api.BResult_19());			
			__byps__remoteT.setReloginCount(count, __byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemoteWithAuthentication.setReloginCount(");
		s.append(count);
		s.append(")]");
		return s.toString();
	}
	
}
