package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemotePrimitiveTypes_setFloat
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
public class JSerializer_1023819749 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1023819749();
	
	public JSerializer_1023819749() {
		super(1023819749);
	}
	
	public JSerializer_1023819749(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemotePrimitiveTypes_setFloat obj = (BRequest_RemotePrimitiveTypes_setFloat)obj1;		
		bbuf.putFloat("v", obj.v);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemotePrimitiveTypes_setFloat obj = (BRequest_RemotePrimitiveTypes_setFloat)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemotePrimitiveTypes_setFloat()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = js.getFloat("v");
		
		return obj;
	}
	
}