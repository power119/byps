﻿package com.wilutions.byps.test.api.cons;

/*
 * Serializer for com.wilutions.byps.test.api.cons.HebrewC
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=4

@SuppressWarnings("all")
public class JSerializer_691741677 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_691741677();
	
	
	public JSerializer_691741677() {
		super(691741677);
	}
	
	public JSerializer_691741677(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final HebrewC obj = (HebrewC)obj1;		
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final HebrewC obj = (HebrewC)(obj1 != null ? obj1 : bin.onObjectCreated(new HebrewC()));
		
		final BJsonObject js = bin.currentObject;
		
		return obj;
	}
	
}