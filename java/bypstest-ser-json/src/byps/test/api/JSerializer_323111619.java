package byps.test.api;

/*
 * Serializer for byps.test.api.BResult_8789515
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_323111619 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_323111619();
	
	public JSerializer_323111619() {
		super(323111619);
	}
	
	public JSerializer_323111619(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_8789515 obj = (BResult_8789515)obj1;		
		bout.writeObj("result",obj.result, false, byps.test.api.JSerializer_8789515.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_8789515 obj = (BResult_8789515)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_8789515()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (java.util.TreeMap<java.lang.Float,java.lang.Character>)bin.readObj("result", false, byps.test.api.JSerializer_8789515.instance);
		
		return obj;
	}
	
}