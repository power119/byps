package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.List<byte[]>
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerListJson DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_1174971318 extends BSerializer {
	
	public final static BSerializer instance = new JSerializer_1174971318();
	
	public JSerializer_1174971318() {
		super(1174971318);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BBufferJson bbuf = bin.bbuf;
		final int n = bin.currentObject.size();
		final ArrayList<byte[]> arr = new ArrayList<byte[]>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			byte[] obj = bin.currentObject.getArrayByte(i0);
			arr.add(obj);
		}
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputJson bout = (BOutputJson)bout1;
		BBufferJson bbuf = bout.bbuf;
		java.util.List<byte[]> arr = (java.util.List<byte[]>)obj1;
		int n = arr.size();
		bbuf.beginArray();
		for (byte[] obj : arr) {
			bbuf.putArrayByte((byte[])obj);
		}
		bbuf.endArray();
	}
	
}
