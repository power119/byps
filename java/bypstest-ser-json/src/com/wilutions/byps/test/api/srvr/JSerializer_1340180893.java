﻿package com.wilutions.byps.test.api.srvr;

/*
 * Serializer for com.wilutions.byps.test.api.srvr.BRequest_ServerIF_callClientParallel
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

@SuppressWarnings("all")
public class JSerializer_1340180893 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1340180893();
	
	
	public JSerializer_1340180893() {
		super(1340180893);
	}
	
	public JSerializer_1340180893(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_ServerIF_callClientParallel obj = (BRequest_ServerIF_callClientParallel)obj1;		
		bbuf.putInt("v", obj.v);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_ServerIF_callClientParallel obj = (BRequest_ServerIF_callClientParallel)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_ServerIF_callClientParallel()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = js.getInt("v");
		
		return obj;
	}
	
}
