package byps.test.api;

/*
 * Serializer for byps.test.api.prim.PrimitiveTypes[][][][]
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerArrayJson DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class JSerializer_758319514 extends JSerializer_Array {
	
	public final static BSerializer instance = new JSerializer_758319514();
	
	public JSerializer_758319514() {
		super(758319514);
	}
	
	@Override
	public Object internalRead(final BInputJson bin) throws BException {
		final BJsonObject js3 = bin.currentObject;
		
		int n3 = 0, n2 = 0, n1 = 0, n0 = 0;
		n3 = js3 != null ? js3.size() : 0;
		if (n3 != 0) {
			final BJsonObject js2 = js3.getJsonObject(0);
			n2 = js2 != null ? js2.size() : 0;
			if (n2 != 0) {
				final BJsonObject js1 = js2.getJsonObject(0);
				n1 = js1 != null ? js1.size() : 0;
				if (n1 != 0) {
					final BJsonObject js0 = js1.getJsonObject(0);
					n0 = js0 != null ? js0.size() : 0;
				}
			}
		}
		
		final byps.test.api.prim.PrimitiveTypes[][][][] arr =  new byps.test.api.prim.PrimitiveTypes[n3][n2][n1][n0];
		bin.onObjectCreated(arr);
		
		// read
		final byps.test.api.prim.PrimitiveTypes[][][][] a3 = arr;
		for (int i3 = 0; i3 < n3; i3++) {
			final byps.test.api.prim.PrimitiveTypes[][][] a2 = a3[i3];
			final BJsonObject js2 = js3.getJsonObject(i3);
			for (int i2 = 0; i2 < n2; i2++) {
				final byps.test.api.prim.PrimitiveTypes[][] a1 = a2[i2];
				final BJsonObject js1 = js2.getJsonObject(i2);
				for (int i1 = 0; i1 < n1; i1++) {
					final byps.test.api.prim.PrimitiveTypes[] a0 = a1[i1];
					bin.currentObject = js1.getJsonObject(i1);
					for (int i0 = 0; i0 < n0; i0++) {
						a0[i0] = (byps.test.api.prim.PrimitiveTypes)bin.readObj(i0, false, null);
					}
				}
			}
		}
		return arr;
		
	}
	
	@Override
	public void internalWrite(Object obj1, final BOutputJson bout, BBufferJson bbuf) throws BException {
		final byps.test.api.prim.PrimitiveTypes[][][][] arr = (byps.test.api.prim.PrimitiveTypes[][][][])obj1;
		
		// lengths
		final int n3 = arr.length;
		final int n2 = n3!=0 ? arr[0].length : 0;
		final int n1 = n2!=0 ? arr[0][0].length : 0;
		final int n0 = n1!=0 ? arr[0][0][0].length : 0;
		
		// write
		final byps.test.api.prim.PrimitiveTypes[][][][] a3 = arr;
		bbuf.beginArray();
		for (int i3 = 0; i3 < n3; i3++) {
			final byps.test.api.prim.PrimitiveTypes[][][] a2 = a3[i3];
			bbuf.beginArray();
			for (int i2 = 0; i2 < n2; i2++) {
				final byps.test.api.prim.PrimitiveTypes[][] a1 = a2[i2];
				bbuf.beginArray();
				for (int i1 = 0; i1 < n1; i1++) {
					final byps.test.api.prim.PrimitiveTypes[] a0 = a1[i1];
					bbuf.beginArray();
					for (int i0 = 0; i0 < n0; i0++) {
						// checkpoint byps.gen.j.PrintContext:313
						bout.writeObj(null, a0[i0], false, null);
					}
					bbuf.endArray();
				}
				bbuf.endArray();
			}
			bbuf.endArray();
		}
		bbuf.endArray();
	}
	
}
