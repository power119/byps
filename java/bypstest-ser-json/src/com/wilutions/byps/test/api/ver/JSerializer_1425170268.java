﻿package com.wilutions.byps.test.api.ver;

/*
 * Serializer for com.wilutions.byps.test.api.ver.BRequest_EvolveIF_sendEvolveToClient
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=0

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_1425170268 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1425170268();
	
	public JSerializer_1425170268() {
		super(1425170268);
	}
	
	public JSerializer_1425170268(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_EvolveIF_sendEvolveToClient obj = (BRequest_EvolveIF_sendEvolveToClient)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_EvolveIF_sendEvolveToClient()));
		
		return obj;
	}
	
}
