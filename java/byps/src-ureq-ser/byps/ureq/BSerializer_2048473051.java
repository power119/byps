package byps.ureq;

/*
 * Serializer for byps.ureq.BRequest_BUtilityRequests_execute
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
public class BSerializer_2048473051 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_2048473051();
	
	public BSerializer_2048473051() {
		super(2048473051);
	}
	
	public BSerializer_2048473051(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_BUtilityRequests_execute obj = (BRequest_BUtilityRequests_execute)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putString(obj.functionName);
		bout.writeObj(obj.params, false, byps.ureq.BSerializer_1710660846.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_BUtilityRequests_execute obj = (BRequest_BUtilityRequests_execute)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_BUtilityRequests_execute()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.functionName = bbuf.getString();
		obj.params = (java.util.Map<java.lang.String,java.lang.String>)bin.readObj(false, byps.ureq.BSerializer_1710660846.instance);
		
		return obj;
	}
	
}
