package byps.test.api.inherit;

/*
 * Serializer for byps.test.api.inherit.BRequest_LemonService_pick
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
public class BSerializer_1022088379 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1022088379();
	
	public BSerializer_1022088379() {
		super(1022088379);
	}
	
	public BSerializer_1022088379(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_LemonService_pick obj = (BRequest_LemonService_pick)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putString(obj.fromTree);
		bout.writeObj(obj.sess, false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_LemonService_pick obj = (BRequest_LemonService_pick)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_LemonService_pick()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.fromTree = bbuf.getString();
		obj.sess = (byps.test.api.auth.SessionInfo)bin.readObj(false, null);
		
		return obj;
	}
	
}
