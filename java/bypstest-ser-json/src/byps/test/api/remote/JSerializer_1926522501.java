package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteSetTypes_setShort1
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
public class JSerializer_1926522501 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1926522501();
	
	public JSerializer_1926522501() {
		super(1926522501);
	}
	
	public JSerializer_1926522501(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteSetTypes_setShort1 obj = (BRequest_RemoteSetTypes_setShort1)obj1;		
		bout.writeObj("short1",obj.short1, false, byps.test.api.JSerializer_2028443792.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteSetTypes_setShort1 obj = (BRequest_RemoteSetTypes_setShort1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteSetTypes_setShort1()));
		
		final BJsonObject js = bin.currentObject;
		obj.short1 = (java.util.Set<java.lang.Short>)bin.readObj("short1", false, byps.test.api.JSerializer_2028443792.instance);
		
		return obj;
	}
	
}
