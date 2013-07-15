﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteServerCtrl_publishRemote
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=3

@SuppressWarnings("all")
public class BSerializer_1776814809 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1776814809();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: name */ + 4		
		       /* pos=4: remote */ + 4		
		       /* pos=8: fowardToOtherServers */ + 4		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_1776814809() {
		super(1776814809);
	}
	
	public BSerializer_1776814809(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final BRequest_RemoteServerCtrl_publishRemote obj = (BRequest_RemoteServerCtrl_publishRemote)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putBoolean(obj.fowardToOtherServers);
		bbuf.putString(obj.name);
		bout.writeObj(obj.remote, false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteServerCtrl_publishRemote obj = (BRequest_RemoteServerCtrl_publishRemote)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteServerCtrl_publishRemote()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.fowardToOtherServers = bbuf.getBoolean();
		obj.name = bbuf.getString();
		obj.remote = (BRemote)bin.readObj(false, null);
		
		return obj;
	}
	
}