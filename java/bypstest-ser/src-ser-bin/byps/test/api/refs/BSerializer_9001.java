package byps.test.api.refs;

/*
 * Serializer for byps.test.api.refs.Node
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=4

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_9001 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_9001();
	
	public BSerializer_9001() {
		super(9001);
	}
	
	public BSerializer_9001(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final Node obj = (Node)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.listOfNodes, false, byps.test.api.BSerializer_1442786648.instance);
		bout.writeObj(obj.mapOfNodes, false, byps.test.api.BSerializer_2011881553.instance);
		bout.writeObj(obj.me, false, null);
		bout.writeObj(obj.next, false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final Node obj = (Node)(obj1 != null ? obj1 : bin.onObjectCreated(new Node()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.listOfNodes = (java.util.List<byps.test.api.refs.Node>)bin.readObj(false, byps.test.api.BSerializer_1442786648.instance);
		obj.mapOfNodes = (java.util.Map<java.lang.String,byps.test.api.refs.Node>)bin.readObj(false, byps.test.api.BSerializer_2011881553.instance);
		obj.me = (byps.test.api.refs.Node)bin.readObj(false, null);
		obj.next = (byps.test.api.refs.Node)bin.readObj(false, null);
		
		return obj;
	}
	
}
