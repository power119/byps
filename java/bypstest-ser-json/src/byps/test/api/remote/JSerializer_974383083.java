package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteMapTypes_setBoolean1
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
public class JSerializer_974383083 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_974383083();
	
	public JSerializer_974383083() {
		super(974383083);
	}
	
	public JSerializer_974383083(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteMapTypes_setBoolean1 obj = (BRequest_RemoteMapTypes_setBoolean1)obj1;		
		bout.writeObj("boolean1",obj.boolean1, false, byps.test.api.JSerializer_1279823631.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteMapTypes_setBoolean1 obj = (BRequest_RemoteMapTypes_setBoolean1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteMapTypes_setBoolean1()));
		
		final BJsonObject js = bin.currentObject;
		obj.boolean1 = (java.util.Map<java.lang.String,java.lang.Boolean>)bin.readObj("boolean1", false, byps.test.api.JSerializer_1279823631.instance);
		
		return obj;
	}
	
}