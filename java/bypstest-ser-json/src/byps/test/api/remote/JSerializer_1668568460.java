package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setInt
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
public class JSerializer_1668568460 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1668568460();
	
	public JSerializer_1668568460() {
		super(1668568460);
	}
	
	public JSerializer_1668568460(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteArrayTypes4dim_setInt obj = (BRequest_RemoteArrayTypes4dim_setInt)obj1;		
		bout.writeObj("v",obj.v, false, byps.test.api.JSerializer_39910537.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteArrayTypes4dim_setInt obj = (BRequest_RemoteArrayTypes4dim_setInt)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes4dim_setInt()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = (int[][][][])bin.readObj("v", false, byps.test.api.JSerializer_39910537.instance);
		
		return obj;
	}
	
}
