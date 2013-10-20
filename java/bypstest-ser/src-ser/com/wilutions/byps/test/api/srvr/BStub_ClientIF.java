package com.wilutions.byps.test.api.srvr;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:164
public class BStub_ClientIF extends BStub implements ClientIFAsync, java.io.Serializable {
	
	// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:145
	public final static long serialVersionUID = 1784257353L;
	
	public BStub_ClientIF(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:359
	public int incrementInt(int a) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<Integer> asyncResult = new BSyncResult<Integer>();		
		incrementInt(a, asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:403
	public void incrementInt(int a, final BAsyncResult<Integer> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_ClientIF_incrementInt req = new BRequest_ClientIF_incrementInt();		
		req.a = a;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:359
	public java.util.List<java.io.InputStream> getStreams(int ctrl) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.List<java.io.InputStream>> asyncResult = new BSyncResult<java.util.List<java.io.InputStream>>();		
		getStreams(ctrl, asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:403
	public void getStreams(int ctrl, final BAsyncResult<java.util.List<java.io.InputStream>> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_ClientIF_getStreams req = new BRequest_ClientIF_getStreams();		
		req.ctrl = ctrl;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:359
	public void putStreams(java.util.List<java.io.InputStream> strm, int ctrl) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		putStreams(strm, ctrl, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:403
	public void putStreams(java.util.List<java.io.InputStream> strm, int ctrl, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_ClientIF_putStreams req = new BRequest_ClientIF_putStreams();		
		req.strm = strm;
		req.ctrl = ctrl;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:359
	public ChatStructure sendChat(ChatStructure cs) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<ChatStructure> asyncResult = new BSyncResult<ChatStructure>();		
		sendChat(cs, asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:403
	public void sendChat(ChatStructure cs, final BAsyncResult<ChatStructure> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_ClientIF_sendChat req = new BRequest_ClientIF_sendChat();		
		req.cs = cs;
		transport.sendMethod(req, asyncResult);
	}
	
	
}
