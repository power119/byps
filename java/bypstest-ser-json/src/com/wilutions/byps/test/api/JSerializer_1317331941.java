﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_936607009
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
public class JSerializer_1317331941 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1317331941();
	
	
	public JSerializer_1317331941() {
		super(1317331941);
	}
	
	public JSerializer_1317331941(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_936607009 obj = (BResult_936607009)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_936607009.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_936607009 obj = (BResult_936607009)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_936607009()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (java.util.TreeSet<java.lang.Character>)bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_936607009.instance);
		
		return obj;
	}
	
}