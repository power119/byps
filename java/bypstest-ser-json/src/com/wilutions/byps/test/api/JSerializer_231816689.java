package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_769021986
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
public class JSerializer_231816689 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_231816689();
	
	public JSerializer_231816689() {
		super(231816689);
	}
	
	public JSerializer_231816689(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_769021986 obj = (BResult_769021986)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_769021986.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_769021986 obj = (BResult_769021986)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_769021986()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (char[][][][])bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_769021986.instance);
		
		return obj;
	}
	
}
