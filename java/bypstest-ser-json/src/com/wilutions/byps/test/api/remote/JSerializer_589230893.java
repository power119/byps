﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setChar
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
public class JSerializer_589230893 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_589230893();
	
	public JSerializer_589230893() {
		super(589230893);
	}
	
	public JSerializer_589230893(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteArrayTypes1dim_setChar obj = (BRequest_RemoteArrayTypes1dim_setChar)obj1;		
		bout.writeObj("v",obj.v, false, com.wilutions.byps.test.api.JSerializer_1361632968.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteArrayTypes1dim_setChar obj = (BRequest_RemoteArrayTypes1dim_setChar)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes1dim_setChar()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = (char[])bin.readObj("v", false, com.wilutions.byps.test.api.JSerializer_1361632968.instance);
		
		return obj;
	}
	
}
