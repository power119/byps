package byps.test.api;

/*
 * Serializer for java.util.List<java.util.TreeSet<java.lang.Integer>>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerList DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_724129228 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_724129228();
	
	public BSerializer_724129228() {
		super(724129228);
	}
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final int n = bbuf.getLength();
		final ArrayList<TreeSet<java.lang.Integer>> arr = new ArrayList<TreeSet<java.lang.Integer>>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.util.TreeSet<java.lang.Integer> obj = (java.util.TreeSet<java.lang.Integer>)bin.readObj(false, byps.test.api.BSerializer_855786668.instance);
			arr.add(obj);
		}
		return arr;
	}
	
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		java.util.List<java.util.TreeSet<java.lang.Integer>> arr = (java.util.List<java.util.TreeSet<java.lang.Integer>>)obj1;
		int n = arr.size();
		bbuf.putLength(n);
		for (java.util.TreeSet<java.lang.Integer> obj : arr) {
			// checkpoint byps.gen.j.PrintContext:313
			bout.writeObj(obj, false, byps.test.api.BSerializer_855786668.instance);
		}
	}
	
}
