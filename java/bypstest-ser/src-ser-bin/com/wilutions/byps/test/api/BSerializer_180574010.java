﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_1888799711
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
public class BSerializer_180574010 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_180574010();
	
	public BSerializer_180574010() {
		super(180574010);
	}
	
	public BSerializer_180574010(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BResult_1888799711 obj = (BResult_1888799711)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.result, false, com.wilutions.byps.test.api.BSerializer_1888799711.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BResult_1888799711 obj = (BResult_1888799711)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1888799711()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.result = (java.util.Set<java.lang.String>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1888799711.instance);
		
		return obj;
	}
	
}
