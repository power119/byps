package com.wilutions.byps.test.api.inherit;

/*
 * Serializer for com.wilutions.byps.test.api.inherit.BRequest_FruitService_squeeze
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
public class JSerializer_656804784 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_656804784();
	
	public JSerializer_656804784() {
		super(656804784);
	}
	
	public JSerializer_656804784(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_FruitService_squeeze obj = (BRequest_FruitService_squeeze)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_FruitService_squeeze()));
		
		return obj;
	}
	
}
