package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemotePrimitiveTypes_setByte
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
public class JSerializer_243961705 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_243961705();
	
	public JSerializer_243961705() {
		super(243961705);
	}
	
	public JSerializer_243961705(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemotePrimitiveTypes_setByte obj = (BRequest_RemotePrimitiveTypes_setByte)obj1;		
		bbuf.putByte("v", obj.v);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemotePrimitiveTypes_setByte obj = (BRequest_RemotePrimitiveTypes_setByte)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemotePrimitiveTypes_setByte()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = js.getByte("v");
		
		return obj;
	}
	
}
