package byps.test.api;

/*
 * Serializer for java.util.Map<java.lang.Byte,java.lang.Double>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerMapJson DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_1487265161 extends JSerializer_13 {
	
	public final static BSerializer instance = new JSerializer_1487265161();
	
	public JSerializer_1487265161() {
		super(1487265161);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BJsonObject js = bin.currentObject;
		final Set<String> keys = js.keys();
		final HashMap<java.lang.Byte,java.lang.Double> map = new HashMap<java.lang.Byte,java.lang.Double>(keys.size());
		bin.onObjectCreated(map);
		for (String keyName : keys) {
			java.lang.Byte key = keyName != null && keyName.length() != 0 ? Byte.parseByte(keyName) : (byte)0;
			final java.lang.Double value = js.getDouble(keyName);
			map.put(key, value);
		}
		return map;
	}
	
	// checkpoint byps.gen.j.GenSerMapJson:80
	@Override
	protected void internalWriteKeyValue(final BOutputJson bout, final BBufferJson bbuf, final Object key, final Object value) throws BException {
		final String keyName = key != null ? key.toString() : "";
		// checkpoint byps.gen.j.PrintContext:332
		bbuf.putDouble(keyName, value != null ? (Double)value : 0.0);
	}
	
}
