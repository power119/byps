package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteListTypes_getBoolean1
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
public class JSerializer_2058662161 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_2058662161();
	
	public JSerializer_2058662161() {
		super(2058662161);
	}
	
	public JSerializer_2058662161(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteListTypes_getBoolean1 obj = (BRequest_RemoteListTypes_getBoolean1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteListTypes_getBoolean1()));
		
		return obj;
	}
	
}
