﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_487702928
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
public class JSerializer_1490187962 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1490187962();
	
	
	public JSerializer_1490187962() {
		super(1490187962);
	}
	
	public JSerializer_1490187962(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_487702928 obj = (BResult_487702928)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_487702928.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_487702928 obj = (BResult_487702928)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_487702928()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (com.wilutions.byps.test.api.inl.Point2D[][][][])bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_487702928.instance);
		
		return obj;
	}
	
}