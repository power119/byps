package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteMapTypes_getInt1
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=0

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_827458594 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_827458594();
	
	public JSerializer_827458594() {
		super(827458594);
	}
	
	public JSerializer_827458594(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteMapTypes_getInt1 obj = (BRequest_RemoteMapTypes_getInt1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteMapTypes_getInt1()));
		
		return obj;
	}
	
}
