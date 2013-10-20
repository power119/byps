package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteWithAuthentication_login
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=3

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_839695851 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_839695851();
	
	public BSerializer_839695851() {
		super(839695851);
	}
	
	public BSerializer_839695851(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteWithAuthentication_login obj = (BRequest_RemoteWithAuthentication_login)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putString(obj.userName);
		bbuf.putString(obj.userPwd);
		bout.writeObj(obj.sess, false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteWithAuthentication_login obj = (BRequest_RemoteWithAuthentication_login)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteWithAuthentication_login()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.userName = bbuf.getString();
		obj.userPwd = bbuf.getString();
		obj.sess = (com.wilutions.byps.test.api.auth.SessionInfo)bin.readObj(false, null);
		
		return obj;
	}
	
}
