package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteStub:164
public class BStub_RemoteSetTypes extends BStub implements RemoteSetTypesAsync, java.io.Serializable {
	
	// checkpoint byps.gen.j.GenRemoteStub:145
	public final static long serialVersionUID = 1900796440L;
	
	public BStub_RemoteSetTypes(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public java.util.Set<java.lang.Boolean> getBoolean1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Set<java.lang.Boolean>> asyncResult = new BSyncResult<java.util.Set<java.lang.Boolean>>();		
		getBoolean1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getBoolean1(final BAsyncResult<java.util.Set<java.lang.Boolean>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_getBoolean1 req = new BRequest_RemoteSetTypes_getBoolean1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setBoolean1(java.util.Set<java.lang.Boolean> boolean1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setBoolean1(boolean1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setBoolean1(java.util.Set<java.lang.Boolean> boolean1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_setBoolean1 req = new BRequest_RemoteSetTypes_setBoolean1();		
		req.boolean1 = boolean1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public java.util.HashSet<java.lang.Byte> getByte1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.HashSet<java.lang.Byte>> asyncResult = new BSyncResult<java.util.HashSet<java.lang.Byte>>();		
		getByte1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getByte1(final BAsyncResult<java.util.HashSet<java.lang.Byte>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_getByte1 req = new BRequest_RemoteSetTypes_getByte1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setByte1(java.util.HashSet<java.lang.Byte> byte1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setByte1(byte1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setByte1(java.util.HashSet<java.lang.Byte> byte1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_setByte1 req = new BRequest_RemoteSetTypes_setByte1();		
		req.byte1 = byte1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public java.util.TreeSet<java.lang.Character> getChar1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.TreeSet<java.lang.Character>> asyncResult = new BSyncResult<java.util.TreeSet<java.lang.Character>>();		
		getChar1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getChar1(final BAsyncResult<java.util.TreeSet<java.lang.Character>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_getChar1 req = new BRequest_RemoteSetTypes_getChar1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setChar1(java.util.TreeSet<java.lang.Character> char1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setChar1(char1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setChar1(java.util.TreeSet<java.lang.Character> char1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_setChar1 req = new BRequest_RemoteSetTypes_setChar1();		
		req.char1 = char1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public java.util.Set<java.lang.Short> getShort1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Set<java.lang.Short>> asyncResult = new BSyncResult<java.util.Set<java.lang.Short>>();		
		getShort1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getShort1(final BAsyncResult<java.util.Set<java.lang.Short>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_getShort1 req = new BRequest_RemoteSetTypes_getShort1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setShort1(java.util.Set<java.lang.Short> short1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setShort1(short1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setShort1(java.util.Set<java.lang.Short> short1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_setShort1 req = new BRequest_RemoteSetTypes_setShort1();		
		req.short1 = short1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public java.util.Set<java.lang.Integer> getInt1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Set<java.lang.Integer>> asyncResult = new BSyncResult<java.util.Set<java.lang.Integer>>();		
		getInt1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getInt1(final BAsyncResult<java.util.Set<java.lang.Integer>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_getInt1 req = new BRequest_RemoteSetTypes_getInt1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setInt1(java.util.Set<java.lang.Integer> int1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setInt1(int1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setInt1(java.util.Set<java.lang.Integer> int1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_setInt1 req = new BRequest_RemoteSetTypes_setInt1();		
		req.int1 = int1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public java.util.Set<java.lang.Long> getLong1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Set<java.lang.Long>> asyncResult = new BSyncResult<java.util.Set<java.lang.Long>>();		
		getLong1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getLong1(final BAsyncResult<java.util.Set<java.lang.Long>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_getLong1 req = new BRequest_RemoteSetTypes_getLong1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setLong1(java.util.Set<java.lang.Long> long1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setLong1(long1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setLong1(java.util.Set<java.lang.Long> long1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_setLong1 req = new BRequest_RemoteSetTypes_setLong1();		
		req.long1 = long1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public java.util.Set<java.lang.Float> getFloat1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Set<java.lang.Float>> asyncResult = new BSyncResult<java.util.Set<java.lang.Float>>();		
		getFloat1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getFloat1(final BAsyncResult<java.util.Set<java.lang.Float>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_getFloat1 req = new BRequest_RemoteSetTypes_getFloat1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setFloat1(java.util.Set<java.lang.Float> float1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setFloat1(float1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setFloat1(java.util.Set<java.lang.Float> float1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_setFloat1 req = new BRequest_RemoteSetTypes_setFloat1();		
		req.float1 = float1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public java.util.Set<java.lang.Double> getDouble1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Set<java.lang.Double>> asyncResult = new BSyncResult<java.util.Set<java.lang.Double>>();		
		getDouble1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getDouble1(final BAsyncResult<java.util.Set<java.lang.Double>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_getDouble1 req = new BRequest_RemoteSetTypes_getDouble1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setDouble1(java.util.Set<java.lang.Double> double1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setDouble1(double1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setDouble1(java.util.Set<java.lang.Double> double1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_setDouble1 req = new BRequest_RemoteSetTypes_setDouble1();		
		req.double1 = double1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public java.util.Set<java.lang.String> getString1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Set<java.lang.String>> asyncResult = new BSyncResult<java.util.Set<java.lang.String>>();		
		getString1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getString1(final BAsyncResult<java.util.Set<java.lang.String>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_getString1 req = new BRequest_RemoteSetTypes_getString1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setString1(java.util.Set<java.lang.String> string1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setString1(string1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setString1(java.util.Set<java.lang.String> string1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_setString1 req = new BRequest_RemoteSetTypes_setString1();		
		req.string1 = string1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public java.util.Set<byps.test.api.prim.PrimitiveTypes> getPrimitiveTypes1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Set<byps.test.api.prim.PrimitiveTypes>> asyncResult = new BSyncResult<java.util.Set<byps.test.api.prim.PrimitiveTypes>>();		
		getPrimitiveTypes1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getPrimitiveTypes1(final BAsyncResult<java.util.Set<byps.test.api.prim.PrimitiveTypes>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_getPrimitiveTypes1 req = new BRequest_RemoteSetTypes_getPrimitiveTypes1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setPrimitiveTypes1(java.util.Set<byps.test.api.prim.PrimitiveTypes> primitiveTypes1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setPrimitiveTypes1(primitiveTypes1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setPrimitiveTypes1(java.util.Set<byps.test.api.prim.PrimitiveTypes> primitiveTypes1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_setPrimitiveTypes1 req = new BRequest_RemoteSetTypes_setPrimitiveTypes1();		
		req.primitiveTypes1 = primitiveTypes1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public java.util.Set<byte[]> getByte2() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Set<byte[]>> asyncResult = new BSyncResult<java.util.Set<byte[]>>();		
		getByte2(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getByte2(final BAsyncResult<java.util.Set<byte[]>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_getByte2 req = new BRequest_RemoteSetTypes_getByte2();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setByte2(java.util.Set<byte[]> byte2) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setByte2(byte2, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setByte2(java.util.Set<byte[]> byte2, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_setByte2 req = new BRequest_RemoteSetTypes_setByte2();		
		req.byte2 = byte2;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public java.util.Set<int[]> getInt2() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Set<int[]>> asyncResult = new BSyncResult<java.util.Set<int[]>>();		
		getInt2(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getInt2(final BAsyncResult<java.util.Set<int[]>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_getInt2 req = new BRequest_RemoteSetTypes_getInt2();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setInt2(java.util.Set<int[]> int2) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setInt2(int2, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setInt2(java.util.Set<int[]> int2, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_setInt2 req = new BRequest_RemoteSetTypes_setInt2();		
		req.int2 = int2;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public java.util.Set<java.lang.Object> getObj1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Set<java.lang.Object>> asyncResult = new BSyncResult<java.util.Set<java.lang.Object>>();		
		getObj1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getObj1(final BAsyncResult<java.util.Set<java.lang.Object>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_getObj1 req = new BRequest_RemoteSetTypes_getObj1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setObj1(java.util.Set<java.lang.Object> obj1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setObj1(obj1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setObj1(java.util.Set<java.lang.Object> obj1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteSetTypes_setObj1 req = new BRequest_RemoteSetTypes_setObj1();		
		req.obj1 = obj1;
		transport.sendMethod(req, asyncResult);
	}
	
	
}