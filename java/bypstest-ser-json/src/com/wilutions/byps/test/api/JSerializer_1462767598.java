﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_1000
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
public class JSerializer_1462767598 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1462767598();
	
	public JSerializer_1462767598() {
		super(1462767598);
	}
	
	public JSerializer_1462767598(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_1000 obj = (BResult_1000)obj1;		
		bout.writeObj("result",obj.result, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_1000 obj = (BResult_1000)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1000()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (com.wilutions.byps.test.api.prim.PrimitiveTypes)bin.readObj("result", false, null);
		
		return obj;
	}
	
}
