package byps.test.api.inherit;

/*
 * Serializer for byps.test.api.inherit.Class1
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=2

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_6001 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_6001();
	
	public JSerializer_6001() {
		super(6001);
	}
	
	public JSerializer_6001(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final Class1 obj = (Class1)obj1;		
		bbuf.putInt("int1", obj.int1);
		bout.writeObj("nextClass1",obj.nextClass1, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final Class1 obj = (Class1)(obj1 != null ? obj1 : bin.onObjectCreated(new Class1()));
		
		final BJsonObject js = bin.currentObject;
		obj.int1 = js.getInt("int1");
		obj.nextClass1 = (byps.test.api.inherit.Class1)bin.readObj("nextClass1", false, null);
		
		return obj;
	}
	
}
