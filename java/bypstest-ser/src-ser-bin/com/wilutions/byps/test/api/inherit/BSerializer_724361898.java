package com.wilutions.byps.test.api.inherit;

/*
 * Serializer for com.wilutions.byps.test.api.inherit.BRequest_BioFruitService_certify
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
public class BSerializer_724361898 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_724361898();
	
	public BSerializer_724361898() {
		super(724361898);
	}
	
	public BSerializer_724361898(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_BioFruitService_certify obj = (BRequest_BioFruitService_certify)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putString(obj.param);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_BioFruitService_certify obj = (BRequest_BioFruitService_certify)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_BioFruitService_certify()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.param = bbuf.getString();
		
		return obj;
	}
	
}
