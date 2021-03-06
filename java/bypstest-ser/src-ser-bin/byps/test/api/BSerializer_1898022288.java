package byps.test.api;

/*
 * Serializer for java.util.Set<java.lang.Float>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerList DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1898022288 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1898022288();
	
	public BSerializer_1898022288() {
		super(1898022288);
	}
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final int n = bbuf.getLength();
		final HashSet<java.lang.Float> arr = new HashSet<java.lang.Float>();
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Float obj = bbuf.getFloat();
			arr.add(obj);
		}
		return arr;
	}
	
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		java.util.Set<java.lang.Float> arr = (java.util.Set<java.lang.Float>)obj1;
		int n = arr.size();
		bbuf.putLength(n);
		for (java.lang.Float obj : arr) {
			// checkpoint byps.gen.j.PrintContext:332
			bbuf.putFloat(obj != null ? (Float)obj : 0.0f);
		}
	}
	
}
