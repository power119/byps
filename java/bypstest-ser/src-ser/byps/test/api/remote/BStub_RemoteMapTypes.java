package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteStub:164
public class BStub_RemoteMapTypes extends BStub implements RemoteMapTypesAsync, java.io.Serializable {
	
	// checkpoint byps.gen.j.GenRemoteStub:145
	public final static long serialVersionUID = 664304990L;
	
	public BStub_RemoteMapTypes(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.Map<java.lang.String,java.lang.Boolean> getBoolean1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Map<java.lang.String,java.lang.Boolean>> asyncResult = new BSyncResult<java.util.Map<java.lang.String,java.lang.Boolean>>();		
		getBoolean1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void getBoolean1(final BAsyncResult<java.util.Map<java.lang.String,java.lang.Boolean>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_getBoolean1 req = new BRequest_RemoteMapTypes_getBoolean1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void setBoolean1(java.util.Map<java.lang.String,java.lang.Boolean> boolean1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setBoolean1(boolean1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void setBoolean1(java.util.Map<java.lang.String,java.lang.Boolean> boolean1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_setBoolean1 req = new BRequest_RemoteMapTypes_setBoolean1();		
		req.boolean1 = boolean1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.HashMap<java.lang.Double,java.lang.Byte> getByte1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.HashMap<java.lang.Double,java.lang.Byte>> asyncResult = new BSyncResult<java.util.HashMap<java.lang.Double,java.lang.Byte>>();		
		getByte1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void getByte1(final BAsyncResult<java.util.HashMap<java.lang.Double,java.lang.Byte>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_getByte1 req = new BRequest_RemoteMapTypes_getByte1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void setByte1(java.util.HashMap<java.lang.Double,java.lang.Byte> byte1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setByte1(byte1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void setByte1(java.util.HashMap<java.lang.Double,java.lang.Byte> byte1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_setByte1 req = new BRequest_RemoteMapTypes_setByte1();		
		req.byte1 = byte1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.TreeMap<java.lang.Float,java.lang.Character> getChar1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.TreeMap<java.lang.Float,java.lang.Character>> asyncResult = new BSyncResult<java.util.TreeMap<java.lang.Float,java.lang.Character>>();		
		getChar1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void getChar1(final BAsyncResult<java.util.TreeMap<java.lang.Float,java.lang.Character>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_getChar1 req = new BRequest_RemoteMapTypes_getChar1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void setChar1(java.util.TreeMap<java.lang.Float,java.lang.Character> char1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setChar1(char1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void setChar1(java.util.TreeMap<java.lang.Float,java.lang.Character> char1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_setChar1 req = new BRequest_RemoteMapTypes_setChar1();		
		req.char1 = char1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.Map<java.lang.Long,java.lang.Short> getShort1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Map<java.lang.Long,java.lang.Short>> asyncResult = new BSyncResult<java.util.Map<java.lang.Long,java.lang.Short>>();		
		getShort1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void getShort1(final BAsyncResult<java.util.Map<java.lang.Long,java.lang.Short>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_getShort1 req = new BRequest_RemoteMapTypes_getShort1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void setShort1(java.util.Map<java.lang.Long,java.lang.Short> short1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setShort1(short1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void setShort1(java.util.Map<java.lang.Long,java.lang.Short> short1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_setShort1 req = new BRequest_RemoteMapTypes_setShort1();		
		req.short1 = short1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.Map<java.lang.Integer,java.lang.Integer> getInt1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Map<java.lang.Integer,java.lang.Integer>> asyncResult = new BSyncResult<java.util.Map<java.lang.Integer,java.lang.Integer>>();		
		getInt1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void getInt1(final BAsyncResult<java.util.Map<java.lang.Integer,java.lang.Integer>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_getInt1 req = new BRequest_RemoteMapTypes_getInt1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void setInt1(java.util.Map<java.lang.Integer,java.lang.Integer> int1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setInt1(int1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void setInt1(java.util.Map<java.lang.Integer,java.lang.Integer> int1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_setInt1 req = new BRequest_RemoteMapTypes_setInt1();		
		req.int1 = int1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.Map<java.lang.Short,java.lang.Long> getLong1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Map<java.lang.Short,java.lang.Long>> asyncResult = new BSyncResult<java.util.Map<java.lang.Short,java.lang.Long>>();		
		getLong1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void getLong1(final BAsyncResult<java.util.Map<java.lang.Short,java.lang.Long>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_getLong1 req = new BRequest_RemoteMapTypes_getLong1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void setLong1(java.util.Map<java.lang.Short,java.lang.Long> long1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setLong1(long1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void setLong1(java.util.Map<java.lang.Short,java.lang.Long> long1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_setLong1 req = new BRequest_RemoteMapTypes_setLong1();		
		req.long1 = long1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.Map<java.lang.Character,java.lang.Float> getFloat1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Map<java.lang.Character,java.lang.Float>> asyncResult = new BSyncResult<java.util.Map<java.lang.Character,java.lang.Float>>();		
		getFloat1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void getFloat1(final BAsyncResult<java.util.Map<java.lang.Character,java.lang.Float>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_getFloat1 req = new BRequest_RemoteMapTypes_getFloat1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void setFloat1(java.util.Map<java.lang.Character,java.lang.Float> float1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setFloat1(float1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void setFloat1(java.util.Map<java.lang.Character,java.lang.Float> float1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_setFloat1 req = new BRequest_RemoteMapTypes_setFloat1();		
		req.float1 = float1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.Map<java.lang.Byte,java.lang.Double> getDouble1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Map<java.lang.Byte,java.lang.Double>> asyncResult = new BSyncResult<java.util.Map<java.lang.Byte,java.lang.Double>>();		
		getDouble1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void getDouble1(final BAsyncResult<java.util.Map<java.lang.Byte,java.lang.Double>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_getDouble1 req = new BRequest_RemoteMapTypes_getDouble1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void setDouble1(java.util.Map<java.lang.Byte,java.lang.Double> double1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setDouble1(double1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void setDouble1(java.util.Map<java.lang.Byte,java.lang.Double> double1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_setDouble1 req = new BRequest_RemoteMapTypes_setDouble1();		
		req.double1 = double1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.Map<java.lang.String,java.lang.String> getString1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Map<java.lang.String,java.lang.String>> asyncResult = new BSyncResult<java.util.Map<java.lang.String,java.lang.String>>();		
		getString1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void getString1(final BAsyncResult<java.util.Map<java.lang.String,java.lang.String>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_getString1 req = new BRequest_RemoteMapTypes_getString1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void setString1(java.util.Map<java.lang.String,java.lang.String> string1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setString1(string1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void setString1(java.util.Map<java.lang.String,java.lang.String> string1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_setString1 req = new BRequest_RemoteMapTypes_setString1();		
		req.string1 = string1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.Map<java.lang.Integer,byps.test.api.prim.PrimitiveTypes> getPrimitiveTypes1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Map<java.lang.Integer,byps.test.api.prim.PrimitiveTypes>> asyncResult = new BSyncResult<java.util.Map<java.lang.Integer,byps.test.api.prim.PrimitiveTypes>>();		
		getPrimitiveTypes1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void getPrimitiveTypes1(final BAsyncResult<java.util.Map<java.lang.Integer,byps.test.api.prim.PrimitiveTypes>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_getPrimitiveTypes1 req = new BRequest_RemoteMapTypes_getPrimitiveTypes1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void setPrimitiveTypes1(java.util.Map<java.lang.Integer,byps.test.api.prim.PrimitiveTypes> primitiveTypes1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setPrimitiveTypes1(primitiveTypes1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void setPrimitiveTypes1(java.util.Map<java.lang.Integer,byps.test.api.prim.PrimitiveTypes> primitiveTypes1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_setPrimitiveTypes1 req = new BRequest_RemoteMapTypes_setPrimitiveTypes1();		
		req.primitiveTypes1 = primitiveTypes1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.Map<java.lang.Integer,byte[]> getByte2() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Map<java.lang.Integer,byte[]>> asyncResult = new BSyncResult<java.util.Map<java.lang.Integer,byte[]>>();		
		getByte2(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void getByte2(final BAsyncResult<java.util.Map<java.lang.Integer,byte[]>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_getByte2 req = new BRequest_RemoteMapTypes_getByte2();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void setByte2(java.util.Map<java.lang.Integer,byte[]> byte2) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setByte2(byte2, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void setByte2(java.util.Map<java.lang.Integer,byte[]> byte2, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_setByte2 req = new BRequest_RemoteMapTypes_setByte2();		
		req.byte2 = byte2;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.Map<java.lang.Integer,int[]> getInt2() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Map<java.lang.Integer,int[]>> asyncResult = new BSyncResult<java.util.Map<java.lang.Integer,int[]>>();		
		getInt2(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void getInt2(final BAsyncResult<java.util.Map<java.lang.Integer,int[]>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_getInt2 req = new BRequest_RemoteMapTypes_getInt2();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void setInt2(java.util.Map<java.lang.Integer,int[]> int2) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setInt2(int2, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void setInt2(java.util.Map<java.lang.Integer,int[]> int2, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_setInt2 req = new BRequest_RemoteMapTypes_setInt2();		
		req.int2 = int2;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.Map<java.lang.String,java.lang.Object> getObj1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Map<java.lang.String,java.lang.Object>> asyncResult = new BSyncResult<java.util.Map<java.lang.String,java.lang.Object>>();		
		getObj1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void getObj1(final BAsyncResult<java.util.Map<java.lang.String,java.lang.Object>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_getObj1 req = new BRequest_RemoteMapTypes_getObj1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void setObj1(java.util.Map<java.lang.String,java.lang.Object> obj1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setObj1(obj1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void setObj1(java.util.Map<java.lang.String,java.lang.Object> obj1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_setObj1 req = new BRequest_RemoteMapTypes_setObj1();		
		req.obj1 = obj1;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.util.Map<java.lang.String,java.util.Date> getDate1() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.util.Map<java.lang.String,java.util.Date>> asyncResult = new BSyncResult<java.util.Map<java.lang.String,java.util.Date>>();		
		getDate1(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void getDate1(final BAsyncResult<java.util.Map<java.lang.String,java.util.Date>> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_getDate1 req = new BRequest_RemoteMapTypes_getDate1();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public void setDate1(java.util.Map<java.lang.String,java.util.Date> obj1) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setDate1(obj1, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void setDate1(java.util.Map<java.lang.String,java.util.Date> obj1, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteMapTypes_setDate1 req = new BRequest_RemoteMapTypes_setDate1();		
		req.obj1 = obj1;
		transport.sendMethod(req, asyncResult);
	}
	
	
}
