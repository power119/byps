package com.wilutions.byps.test.api.ver;

/*
 * Serializer for com.wilutions.byps.test.api.ver.BRequest_EvolveIF_getEvolve
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=0

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_32041374 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_32041374();
	
	public BSerializer_32041374() {
		super(32041374);
	}
	
	public BSerializer_32041374(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_EvolveIF_getEvolve obj = (BRequest_EvolveIF_getEvolve)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_EvolveIF_getEvolve()));
		
		return obj;
	}
	
}
