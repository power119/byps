package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteListTypes_setDate1
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
public class JSerializer_48506001 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_48506001();
	
	public JSerializer_48506001() {
		super(48506001);
	}
	
	public JSerializer_48506001(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteListTypes_setDate1 obj = (BRequest_RemoteListTypes_setDate1)obj1;		
		bout.writeObj("obj1",obj.obj1, false, byps.test.api.JSerializer_1504867122.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteListTypes_setDate1 obj = (BRequest_RemoteListTypes_setDate1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteListTypes_setDate1()));
		
		final BJsonObject js = bin.currentObject;
		obj.obj1 = (java.util.List<java.util.Date>)bin.readObj("obj1", false, byps.test.api.JSerializer_1504867122.instance);
		
		return obj;
	}
	
}