package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteListTypes_setInt2
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
public class JSerializer_136821227 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_136821227();
	
	public JSerializer_136821227() {
		super(136821227);
	}
	
	public JSerializer_136821227(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteListTypes_setInt2 obj = (BRequest_RemoteListTypes_setInt2)obj1;		
		bout.writeObj("int2",obj.int2, false, byps.test.api.JSerializer_1752158699.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteListTypes_setInt2 obj = (BRequest_RemoteListTypes_setInt2)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteListTypes_setInt2()));
		
		final BJsonObject js = bin.currentObject;
		obj.int2 = (java.util.List<int[]>)bin.readObj("int2", false, byps.test.api.JSerializer_1752158699.instance);
		
		return obj;
	}
	
}
