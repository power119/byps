﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_65775978
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
public class JSerializer_56089321 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_56089321();
	
	public JSerializer_56089321() {
		super(56089321);
	}
	
	public JSerializer_56089321(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_65775978 obj = (BResult_65775978)obj1;		
		bout.writeObj("result",obj.result, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_65775978 obj = (BResult_65775978)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_65775978()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (com.wilutions.byps.test.api.auth.SessionInfo)bin.readObj("result", false, null);
		
		return obj;
	}
	
}
