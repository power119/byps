package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteSetTypes_setByte2
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_1462808284 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1462808284();
	
	public BSerializer_1462808284() {
		super(1462808284);
	}
	
	public BSerializer_1462808284(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteSetTypes_setByte2 obj = (BRequest_RemoteSetTypes_setByte2)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.byte2, false, byps.test.api.BSerializer_2052431866.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteSetTypes_setByte2 obj = (BRequest_RemoteSetTypes_setByte2)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteSetTypes_setByte2()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.byte2 = (java.util.Set<byte[]>)bin.readObj(false, byps.test.api.BSerializer_2052431866.instance);
		
		return obj;
	}
	
}
