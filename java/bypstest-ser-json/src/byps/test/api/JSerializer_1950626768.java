package byps.test.api;

/*
 * Serializer for java.io.InputStream[]
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerArrayJson DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class JSerializer_1950626768 extends JSerializer_Array {
	
	public final static BSerializer instance = new JSerializer_1950626768();
	
	public JSerializer_1950626768() {
		super(1950626768);
	}
	
	@Override
	public Object internalRead(final BInputJson bin) throws BException {
		final BJsonObject js0 = bin.currentObject;
		
		int n0 = 0;
		n0 = js0 != null ? js0.size() : 0;
		
		final java.io.InputStream[] arr =  new java.io.InputStream[n0];
		bin.onObjectCreated(arr);
		
		// read
		final java.io.InputStream[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			a0[i0] = (java.io.InputStream)bin.readObj(i0, false, null);
		}
		return arr;
		
	}
	
	@Override
	public void internalWrite(Object obj1, final BOutputJson bout, BBufferJson bbuf) throws BException {
		final java.io.InputStream[] arr = (java.io.InputStream[])obj1;
		
		// lengths
		final int n0 = arr.length;
		
		// write
		final java.io.InputStream[] a0 = arr;
		bbuf.beginArray();
		for (int i0 = 0; i0 < n0; i0++) {
			// checkpoint byps.gen.j.PrintContext:313
			bout.writeObj(null, a0[i0], false, null);
		}
		bbuf.endArray();
	}
	
}
