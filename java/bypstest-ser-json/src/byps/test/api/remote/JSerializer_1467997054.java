package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setObject
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
public class JSerializer_1467997054 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1467997054();
	
	public JSerializer_1467997054() {
		super(1467997054);
	}
	
	public JSerializer_1467997054(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteArrayTypes4dim_setObject obj = (BRequest_RemoteArrayTypes4dim_setObject)obj1;		
		bout.writeObj("v",obj.v, false, byps.test.api.JSerializer_124584219.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteArrayTypes4dim_setObject obj = (BRequest_RemoteArrayTypes4dim_setObject)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes4dim_setObject()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = (java.lang.Object[][][][])bin.readObj("v", false, byps.test.api.JSerializer_124584219.instance);
		
		return obj;
	}
	
}
