﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_16
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
public class JSerializer_309901672 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_309901672();
	
	
	public JSerializer_309901672() {
		super(309901672);
	}
	
	public JSerializer_309901672(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_16 obj = (BResult_16)obj1;		
		bout.writeObj("result",obj.result, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_16 obj = (BResult_16)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_16()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (BRemote)bin.readObj("result", false, null);
		
		return obj;
	}
	
}