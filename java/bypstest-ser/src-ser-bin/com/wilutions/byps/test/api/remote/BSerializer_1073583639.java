﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemotePrimitiveTypes_add
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=2

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_1073583639 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1073583639();
	
	public BSerializer_1073583639() {
		super(1073583639);
	}
	
	public BSerializer_1073583639(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemotePrimitiveTypes_add obj = (BRequest_RemotePrimitiveTypes_add)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putInt(obj.a);
		bbuf.putInt(obj.b);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemotePrimitiveTypes_add obj = (BRequest_RemotePrimitiveTypes_add)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemotePrimitiveTypes_add()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.a = bbuf.getInt();
		obj.b = bbuf.getInt();
		
		return obj;
	}
	
}
