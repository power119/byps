package byps.test.api;

/*
 * Serializer for java.util.List<java.util.List<int[][][][]>>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerListJson DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_1865834185 extends BSerializer {
	
	public final static BSerializer instance = new JSerializer_1865834185();
	
	public JSerializer_1865834185() {
		super(1865834185);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BBufferJson bbuf = bin.bbuf;
		final int n = bin.currentObject.size();
		final ArrayList<List<int[][][][]>> arr = new ArrayList<List<int[][][][]>>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.util.List<int[][][][]> obj = (java.util.List<int[][][][]>)bin.readObj(i0, false, byps.test.api.JSerializer_1088217157.instance);
			arr.add(obj);
		}
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputJson bout = (BOutputJson)bout1;
		BBufferJson bbuf = bout.bbuf;
		java.util.List<java.util.List<int[][][][]>> arr = (java.util.List<java.util.List<int[][][][]>>)obj1;
		int n = arr.size();
		bbuf.beginArray();
		for (java.util.List<int[][][][]> obj : arr) {
			// checkpoint byps.gen.j.PrintContext:313
			bout.writeObj(null, obj, false, byps.test.api.JSerializer_1088217157.instance);
		}
		bbuf.endArray();
	}
	
}
