package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteMapTypes_setShort1
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
public class BSerializer_684809537 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_684809537();
	
	public BSerializer_684809537() {
		super(684809537);
	}
	
	public BSerializer_684809537(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteMapTypes_setShort1 obj = (BRequest_RemoteMapTypes_setShort1)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.short1, false, byps.test.api.BSerializer_601099730.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteMapTypes_setShort1 obj = (BRequest_RemoteMapTypes_setShort1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteMapTypes_setShort1()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.short1 = (java.util.Map<java.lang.Long,java.lang.Short>)bin.readObj(false, byps.test.api.BSerializer_601099730.instance);
		
		return obj;
	}
	
}
