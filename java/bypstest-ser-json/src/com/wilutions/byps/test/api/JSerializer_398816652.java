﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_2028443792
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
public class JSerializer_398816652 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_398816652();
	
	public JSerializer_398816652() {
		super(398816652);
	}
	
	public JSerializer_398816652(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_2028443792 obj = (BResult_2028443792)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_2028443792.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_2028443792 obj = (BResult_2028443792)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_2028443792()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (java.util.Set<java.lang.Short>)bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_2028443792.instance);
		
		return obj;
	}
	
}
