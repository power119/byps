package byps.test.api.cons;

/*
 * Serializer for byps.test.api.cons.HebrewZ
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_1518668429 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1518668429();
	
	public BSerializer_1518668429() {
		super(1518668429);
	}
	
	public BSerializer_1518668429(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final HebrewZ obj = (HebrewZ)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putString(obj.getCore());
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final HebrewZ obj = (HebrewZ)(obj1 != null ? obj1 : bin.onObjectCreated(new HebrewZ()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.setCore(bbuf.getString());
		
		return obj;
	}
	
}
