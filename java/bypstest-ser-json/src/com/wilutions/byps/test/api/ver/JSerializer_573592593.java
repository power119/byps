﻿package com.wilutions.byps.test.api.ver;

/*
 * Serializer for com.wilutions.byps.test.api.ver.Evolve2
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=1

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_573592593 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_573592593();
	
	public JSerializer_573592593() {
		super(573592593);
	}
	
	public JSerializer_573592593(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final Evolve2 obj = (Evolve2)obj1;		
		bbuf.putInt("n1", obj.n1);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final Evolve2 obj = (Evolve2)(obj1 != null ? obj1 : bin.onObjectCreated(new Evolve2()));
		
		final BJsonObject js = bin.currentObject;
		obj.n1 = js.getInt("n1");
		
		return obj;
	}
	
}
