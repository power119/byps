﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.lang.String[][][]
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerArray DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class BSerializer_1889888075 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1889888075();
	
	public BSerializer_1889888075() {
		super(1889888075);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		
		// lengths
		final int n2 = bbuf.getLength();
		final int n1 = bbuf.getLength();
		final int n0 = bbuf.getLength();
		
		// create array
		final java.lang.String[][][] arr =  new java.lang.String[n2][n1][n0];
		bin.onObjectCreated(arr);
		
		// read
		final java.lang.String[][][] a2 = arr;
		for (int i2 = 0; i2 < n2; i2++) {
			final java.lang.String[][] a1 = a2[i2];
			for (int i1 = 0; i1 < n1; i1++) {
				final java.lang.String[] a0 = a1[i1];
				for (int i0 = 0; i0 < n0; i0++) {
					a0[i0] = bbuf.getString();
				}
			}
		}
		
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final long version) throws BException {
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		
		final java.lang.String[][][] arr = (java.lang.String[][][])obj1;
		
		// lengths
		final int n2 = arr.length;
		final int n1 = n2!=0 ? arr[0].length : 0;
		final int n0 = n1!=0 ? arr[0][0].length : 0;
		bbuf.putLength(n2);
		bbuf.putLength(n1);
		bbuf.putLength(n0);
		
		// write
		final java.lang.String[][][] a2 = arr;
		for (int i2 = 0; i2 < n2; i2++) {
			final java.lang.String[][] a1 = a2[i2];
			for (int i1 = 0; i1 < n1; i1++) {
				final java.lang.String[] a0 = a1[i1];
				for (int i0 = 0; i0 < n0; i0++) {
					bbuf.putString(a0[i0] != null ? (String)a0[i0] : "");
				}
			}
		}
	}
	
}
