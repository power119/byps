package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteStreams_getImages
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=0

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_1911998634 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1911998634();
	
	public BSerializer_1911998634() {
		super(1911998634);
	}
	
	public BSerializer_1911998634(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteStreams_getImages obj = (BRequest_RemoteStreams_getImages)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteStreams_getImages()));
		
		return obj;
	}
	
}