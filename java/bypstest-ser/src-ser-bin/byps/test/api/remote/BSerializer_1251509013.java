package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteWithAuthentication_doit
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=2

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_1251509013 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1251509013();
	
	public BSerializer_1251509013() {
		super(1251509013);
	}
	
	public BSerializer_1251509013(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteWithAuthentication_doit obj = (BRequest_RemoteWithAuthentication_doit)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putInt(obj.value);
		bout.writeObj(obj.sess, false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteWithAuthentication_doit obj = (BRequest_RemoteWithAuthentication_doit)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteWithAuthentication_doit()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.value = bbuf.getInt();
		obj.sess = (byps.test.api.auth.SessionInfo)bin.readObj(false, null);
		
		return obj;
	}
	
}