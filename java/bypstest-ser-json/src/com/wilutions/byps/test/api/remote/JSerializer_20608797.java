package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteWithAuthentication_setReloginCount
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_20608797 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_20608797();
	
	public JSerializer_20608797() {
		super(20608797);
	}
	
	public JSerializer_20608797(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteWithAuthentication_setReloginCount obj = (BRequest_RemoteWithAuthentication_setReloginCount)obj1;		
		bbuf.putInt("count", obj.count);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteWithAuthentication_setReloginCount obj = (BRequest_RemoteWithAuthentication_setReloginCount)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteWithAuthentication_setReloginCount()));
		
		final BJsonObject js = bin.currentObject;
		obj.count = js.getInt("count");
		
		return obj;
	}
	
}
