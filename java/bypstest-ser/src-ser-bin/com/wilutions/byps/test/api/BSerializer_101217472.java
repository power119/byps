﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_1859644668
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
public class BSerializer_101217472 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_101217472();
	
	public BSerializer_101217472() {
		super(101217472);
	}
	
	public BSerializer_101217472(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BResult_1859644668 obj = (BResult_1859644668)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.result, false, com.wilutions.byps.test.api.BSerializer_1859644668.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BResult_1859644668 obj = (BResult_1859644668)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1859644668()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.result = (short[][][][])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1859644668.instance);
		
		return obj;
	}
	
}
