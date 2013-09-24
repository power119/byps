﻿package com.wilutions.byps.test.api;

/*
 * Serializer for long[]
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerArray DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class BSerializer_1097129250 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1097129250();
	
	public BSerializer_1097129250() {
		super(1097129250);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		
		// lengths
		final int n0 = bbuf.getLength();
		
		// create array
		final long[] arr =  new long[n0];
		bin.onObjectCreated(arr);
		
		// read
		final long[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			a0[i0] = bbuf.getLong();
		}
		
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final long version) throws BException {
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		
		final long[] arr = (long[])obj1;
		
		// lengths
		final int n0 = arr.length;
		bbuf.putLength(n0);
		
		// write
		final long[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			bbuf.putLong(a0[i0]);
		}
	}
	
}
