﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setLong
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_588955655 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_588955655();
	
	public BSerializer_588955655() {
		super(588955655);
	}
	
	public BSerializer_588955655(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteArrayTypes1dim_setLong obj = (BRequest_RemoteArrayTypes1dim_setLong)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.v, false, com.wilutions.byps.test.api.BSerializer_1097129250.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteArrayTypes1dim_setLong obj = (BRequest_RemoteArrayTypes1dim_setLong)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes1dim_setLong()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.v = (long[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1097129250.instance);
		
		return obj;
	}
	
}
