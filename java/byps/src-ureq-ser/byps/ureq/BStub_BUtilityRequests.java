package byps.ureq;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteStub:164
public class BStub_BUtilityRequests extends BStub implements BUtilityRequestsAsync, java.io.Serializable {
	
	// checkpoint byps.gen.j.GenRemoteStub:145
	public final static long serialVersionUID = 174367442L;
	
	public BStub_BUtilityRequests(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void cancelMessage(long messageId) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		cancelMessage(messageId, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void cancelMessage(long messageId, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_BUtilityRequests_cancelMessage req = new BRequest_BUtilityRequests_cancelMessage();		
		req.messageId = messageId;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.Map<java.lang.String,java.lang.String> testAdapter(java.lang.String functionName, java.util.Map<java.lang.String,java.lang.String> params) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Map<java.lang.String,java.lang.String>> asyncResult = new BSyncResult<java.util.Map<java.lang.String,java.lang.String>>();		
		testAdapter(functionName, params, asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void testAdapter(java.lang.String functionName, java.util.Map<java.lang.String,java.lang.String> params, final BAsyncResult<java.util.Map<java.lang.String,java.lang.String>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_BUtilityRequests_testAdapter req = new BRequest_BUtilityRequests_testAdapter();		
		req.functionName = functionName;
		req.params = params;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.Map<java.lang.String,java.lang.String> execute(java.lang.String functionName, java.util.Map<java.lang.String,java.lang.String> params) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Map<java.lang.String,java.lang.String>> asyncResult = new BSyncResult<java.util.Map<java.lang.String,java.lang.String>>();		
		execute(functionName, params, asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void execute(java.lang.String functionName, java.util.Map<java.lang.String,java.lang.String> params, final BAsyncResult<java.util.Map<java.lang.String,java.lang.String>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_BUtilityRequests_execute req = new BRequest_BUtilityRequests_execute();		
		req.functionName = functionName;
		req.params = params;
		transport.sendMethod(req, asyncResult);
	}
	
	
}