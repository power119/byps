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
public final class BRequest_RemoteInlineInstance_getPoint2DListList extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 1650554387L;
	
	public int getRemoteId() { return 567395951; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteInlineInstanceAsync __byps__remoteT = (RemoteInlineInstanceAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.List<java.util.List<byps.test.api.inl.Point2D>>> __byps__outerResult = new BAsyncResultSendMethod<java.util.List<java.util.List<byps.test.api.inl.Point2D>>>(__byps__asyncResult, new byps.test.api.BResult_1823330785());			
			__byps__remoteT.getPoint2DListList(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemoteInlineInstance.getPoint2DListList(");
		s.append(")]");
		return s.toString();
	}
	
}
