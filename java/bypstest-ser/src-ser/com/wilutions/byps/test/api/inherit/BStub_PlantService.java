package com.wilutions.byps.test.api.inherit;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:164
public class BStub_PlantService extends BStub implements PlantServiceAuth, java.io.Serializable {
	
	// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:145
	public final static long serialVersionUID = 1117460801L;
	
	public BStub_PlantService(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:359
	public java.lang.String grow() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<String> asyncResult = new BSyncResult<String>();		
		grow(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:403
	public void grow(final BAsyncResult<String> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_PlantService_grow req = new BRequest_PlantService_grow();		
		transport.sendMethod(req, asyncResult);
	}
	
	
}
