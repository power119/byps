﻿package com.wilutions.byps.test.api.cons;

/*
 * Serializer for com.wilutions.byps.test.api.cons.AllTypesZ
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=14

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_142458 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_142458();
	
	public BSerializer_142458() {
		super(142458);
	}
	
	public BSerializer_142458(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final AllTypesZ obj = (AllTypesZ)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putBoolean(obj.isBool1());
		bbuf.putByte(obj.getByte1());
		bbuf.putChar(obj.getChar1());
		bbuf.putDouble(obj.getDouble1());
		bbuf.putFloat(obj.getFloat1());
		bbuf.putInt(obj.getInt1());
		bbuf.putLong(obj.getLong1());
		bbuf.putShort(obj.getShort1());
		bbuf.putString(obj.getString1());
		bout.writeObj(obj.getByte2(), false, com.wilutions.byps.test.api.BSerializer_1374008726.instance);
		bout.writeObj(obj.getHebrew1(), false, null);
		bout.writeObj(obj.getHebrew2(), false, com.wilutions.byps.test.api.BSerializer_2092671091.instance);
		bout.writeObj(obj.getInt2(), false, com.wilutions.byps.test.api.BSerializer_100361105.instance);
		bout.writeObj(obj.getString2(), true, com.wilutions.byps.test.api.BSerializer_1888107655.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final AllTypesZ obj = (AllTypesZ)(obj1 != null ? obj1 : bin.onObjectCreated(new AllTypesZ()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.setBool1(bbuf.getBoolean());
		obj.setByte1(bbuf.getByte());
		obj.setChar1(bbuf.getChar());
		obj.setDouble1(bbuf.getDouble());
		obj.setFloat1(bbuf.getFloat());
		obj.setInt1(bbuf.getInt());
		obj.setLong1(bbuf.getLong());
		obj.setShort1(bbuf.getShort());
		obj.setString1(bbuf.getString());
		obj.setByte2((byte[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1374008726.instance));
		obj.setHebrew1((com.wilutions.byps.test.api.cons.HebrewZ)bin.readObj(false, null));
		obj.setHebrew2((com.wilutions.byps.test.api.cons.HebrewZ[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_2092671091.instance));
		obj.setInt2((int[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_100361105.instance));
		obj.setString2((java.lang.String[])bin.readObj(true, com.wilutions.byps.test.api.BSerializer_1888107655.instance));
		
		return obj;
	}
	
}
