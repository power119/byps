package byps.ureq;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_BUtilityRequests_execute extends BMethodRequest implements Serializable {

	public java.lang.String functionName;
	public java.util.Map<java.lang.String,java.lang.String> params;
	
	public final static long serialVersionUID = 2048473051L;
	
	public int getRemoteId() { return 174367442; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final BUtilityRequestsAsync __byps__remoteT = (BUtilityRequestsAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.Map<java.lang.String,java.lang.String>> __byps__outerResult = new BAsyncResultSendMethod<java.util.Map<java.lang.String,java.lang.String>>(__byps__asyncResult, new BResult_1710660846());			
			__byps__remoteT.execute(functionName, params, __byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[BUtilityRequests.execute(");
		s.append(functionName);
		s.append(",").append(params);
		s.append(")]");
		return s.toString();
	}
	
}
