﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setFloat
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
public class JSerializer_1963594750 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1963594750();
	
	public JSerializer_1963594750() {
		super(1963594750);
	}
	
	public JSerializer_1963594750(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteArrayTypes4dim_setFloat obj = (BRequest_RemoteArrayTypes4dim_setFloat)obj1;		
		bout.writeObj("v",obj.v, false, com.wilutions.byps.test.api.JSerializer_1516687588.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteArrayTypes4dim_setFloat obj = (BRequest_RemoteArrayTypes4dim_setFloat)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes4dim_setFloat()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = (float[][][][])bin.readObj("v", false, com.wilutions.byps.test.api.JSerializer_1516687588.instance);
		
		return obj;
	}
	
}
