﻿package com.wilutions.byps.test.api.inherit;

/*
 * Serializer for com.wilutions.byps.test.api.inherit.BStub_LemonService
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class JSerializer_617356599 extends JSerializer_16 {
	
	public final static BSerializer instance = new JSerializer_617356599();
	
	public JSerializer_617356599() {
		super(617356599);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_LemonService(transport);
	}
	
}
