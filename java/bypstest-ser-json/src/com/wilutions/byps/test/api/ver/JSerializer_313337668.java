﻿package com.wilutions.byps.test.api.ver;

/*
 * Serializer for com.wilutions.byps.test.api.ver.BRequest_EvolveIF_setClient
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
public class JSerializer_313337668 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_313337668();
	
	public JSerializer_313337668() {
		super(313337668);
	}
	
	public JSerializer_313337668(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_EvolveIF_setClient obj = (BRequest_EvolveIF_setClient)obj1;		
		bout.writeObj("partner",obj.partner, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_EvolveIF_setClient obj = (BRequest_EvolveIF_setClient)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_EvolveIF_setClient()));
		
		final BJsonObject js = bin.currentObject;
		obj.partner = (com.wilutions.byps.test.api.ver.EvolveIF)bin.readObj("partner", false, null);
		
		return obj;
	}
	
}
