﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_1365696060
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
public class JSerializer_1253977781 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1253977781();
	
	public JSerializer_1253977781() {
		super(1253977781);
	}
	
	public JSerializer_1253977781(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_1365696060 obj = (BResult_1365696060)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_1365696060.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_1365696060 obj = (BResult_1365696060)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1365696060()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (java.util.Set<java.lang.Boolean>)bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_1365696060.instance);
		
		return obj;
	}
	
}
