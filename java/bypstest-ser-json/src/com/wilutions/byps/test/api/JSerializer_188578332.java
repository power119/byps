﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_1516687588
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
public class JSerializer_188578332 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_188578332();
	
	
	public JSerializer_188578332() {
		super(188578332);
	}
	
	public JSerializer_188578332(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_1516687588 obj = (BResult_1516687588)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_1516687588.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_1516687588 obj = (BResult_1516687588)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1516687588()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (float[][][][])bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_1516687588.instance);
		
		return obj;
	}
	
}