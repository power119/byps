package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteSetTypes_getInt2
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
public class JSerializer_68372556 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_68372556();
	
	public JSerializer_68372556() {
		super(68372556);
	}
	
	public JSerializer_68372556(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteSetTypes_getInt2 obj = (BRequest_RemoteSetTypes_getInt2)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteSetTypes_getInt2()));
		
		return obj;
	}
	
}
