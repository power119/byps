package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_5
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_148544158 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_148544158();
	
	public BSerializer_148544158() {
		super(148544158);
	}
	
	public BSerializer_148544158(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BResult_5 obj = (BResult_5)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putInt(obj.result);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BResult_5 obj = (BResult_5)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_5()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.result = bbuf.getInt();
		
		return obj;
	}
	
}
