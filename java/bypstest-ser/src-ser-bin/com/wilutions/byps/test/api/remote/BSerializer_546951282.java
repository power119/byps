﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteInlineInstance_setPoint2DMap
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

@SuppressWarnings("all")
public class BSerializer_546951282 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_546951282();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: pointMap */ + 4		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_546951282() {
		super(546951282);
	}
	
	public BSerializer_546951282(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final BRequest_RemoteInlineInstance_setPoint2DMap obj = (BRequest_RemoteInlineInstance_setPoint2DMap)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.pointMap, false, com.wilutions.byps.test.api.BSerializer_1851881336.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteInlineInstance_setPoint2DMap obj = (BRequest_RemoteInlineInstance_setPoint2DMap)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteInlineInstance_setPoint2DMap()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.pointMap = (java.util.Map<java.lang.Integer,com.wilutions.byps.test.api.inl.Point2D>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1851881336.instance);
		
		return obj;
	}
	
}