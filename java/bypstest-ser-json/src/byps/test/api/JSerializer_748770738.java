package byps.test.api;

/*
 * Serializer for byps.test.api.BResult_184101377
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_748770738 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_748770738();
	
	public JSerializer_748770738() {
		super(748770738);
	}
	
	public JSerializer_748770738(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_184101377 obj = (BResult_184101377)obj1;		
		bout.writeObj("result",obj.result, false, byps.test.api.JSerializer_184101377.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_184101377 obj = (BResult_184101377)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_184101377()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (byps.test.api.inl.Point2D[])bin.readObj("result", false, byps.test.api.JSerializer_184101377.instance);
		
		return obj;
	}
	
}
