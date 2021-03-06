package byps.test.api;

/*
 * Serializer for java.util.Set<java.lang.String>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerList DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1888799711 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1888799711();
	
	public BSerializer_1888799711() {
		super(1888799711);
	}
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final int n = bbuf.getLength();
		final HashSet<java.lang.String> arr = new HashSet<java.lang.String>();
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.String obj = bbuf.getString();
			arr.add(obj);
		}
		return arr;
	}
	
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		java.util.Set<java.lang.String> arr = (java.util.Set<java.lang.String>)obj1;
		int n = arr.size();
		bbuf.putLength(n);
		for (java.lang.String obj : arr) {
			// checkpoint byps.gen.j.PrintContext:332
			bbuf.putString(obj != null ? (String)obj : "");
		}
	}
	
}
