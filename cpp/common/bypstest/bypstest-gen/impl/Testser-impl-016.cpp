﻿#include "Testser-impl.h"
using namespace ::std;
using namespace ::com::wilutions::byps;


namespace com { namespace wilutions { namespace byps { namespace test { namespace api { namespace remote { 

void BSkeleton_RemoteServerCtrl::publishRemote(::std::wstring name, PRemote remote, bool fowardToOtherServers)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteServerCtrl::async_publishRemote(::std::wstring name, PRemote remote, bool fowardToOtherServers, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		publishRemote(name, remote, fowardToOtherServers);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
PRemote BSkeleton_RemoteServerCtrl::getPublishedRemote(::std::wstring name)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteServerCtrl::async_getPublishedRemote(::std::wstring name, std::function< void (PRemote, BException ex) > asyncResult)  {
	PRemote ret = PRemote();
	try {
		ret = getPublishedRemote(name);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteServerCtrl::removePublishedRemote(::std::wstring name)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteServerCtrl::async_removePublishedRemote(::std::wstring name, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		removePublishedRemote(name);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
}}}}}}


namespace com { namespace wilutions { namespace byps { namespace test { namespace api { namespace remote { 

BStub_RemoteServerCtrl::BStub_RemoteServerCtrl(PTransport transport) 
	: BStub(transport) {}

void BStub_RemoteServerCtrl::publishRemote(::std::wstring name, PRemote remote, bool fowardToOtherServers)  {
	BSyncResultT< bool > syncResult;	
	async_publishRemote(name, remote, fowardToOtherServers, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteServerCtrl::async_publishRemote(::std::wstring name, PRemote remote, bool fowardToOtherServers, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteServerCtrl_publishRemote(name, remote, fowardToOtherServers));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
PRemote BStub_RemoteServerCtrl::getPublishedRemote(::std::wstring name)  {
	BSyncResultT< PRemote > syncResult;	
	async_getPublishedRemote(name, [&syncResult](PRemote v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteServerCtrl::async_getPublishedRemote(::std::wstring name, std::function< void (PRemote, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteServerCtrl_getPublishedRemote(name));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< PRemote, com::wilutions::byps::test::api::BResult_16 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteServerCtrl::removePublishedRemote(::std::wstring name)  {
	BSyncResultT< bool > syncResult;	
	async_removePublishedRemote(name, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteServerCtrl::async_removePublishedRemote(::std::wstring name, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteServerCtrl_removePublishedRemote(name));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
}}}}}}

namespace com { namespace wilutions { namespace byps { namespace test { namespace api { 
void BSerializer_1124545992(BIO& bio, POBJECT& , PSerializable& pObjS, void* ){
	BSerializable* p = pObjS.get();
	if (bio.is_loading) {
		if (p) return;
		BTargetId targetId;
		bio & targetId;
		PTransport transport(new BTransport(*bio.transport, targetId));
		pObjS = PSerializable(new com::wilutions::byps::test::api::remote::BStub_RemoteServerCtrl(transport));
	}
	else {
		com::wilutions::byps::test::api::remote::RemoteServerCtrl* r = dynamic_cast<com::wilutions::byps::test::api::remote::RemoteServerCtrl*>(p);
		BTargetId targetId = r->BRemote_getTargetId();
		bio & targetId;
	}
}
}}}}}

namespace com { namespace wilutions { namespace byps { namespace test { namespace api { namespace remote { 

byps_ptr< ::std::set< bool > > BSkeleton_RemoteSetTypes::getBoolean1()  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_getBoolean1(std::function< void (byps_ptr< ::std::set< bool > >, BException ex) > asyncResult)  {
	byps_ptr< ::std::set< bool > > ret = byps_ptr< ::std::set< bool > >();
	try {
		ret = getBoolean1();
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteSetTypes::setBoolean1(byps_ptr< ::std::set< bool > > boolean1)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_setBoolean1(byps_ptr< ::std::set< bool > > boolean1, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		setBoolean1(boolean1);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
byps_ptr< ::std::set< int8_t > > BSkeleton_RemoteSetTypes::getByte1()  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_getByte1(std::function< void (byps_ptr< ::std::set< int8_t > >, BException ex) > asyncResult)  {
	byps_ptr< ::std::set< int8_t > > ret = byps_ptr< ::std::set< int8_t > >();
	try {
		ret = getByte1();
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteSetTypes::setByte1(byps_ptr< ::std::set< int8_t > > byte1)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_setByte1(byps_ptr< ::std::set< int8_t > > byte1, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		setByte1(byte1);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
byps_ptr< ::std::set< wchar_t > > BSkeleton_RemoteSetTypes::getChar1()  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_getChar1(std::function< void (byps_ptr< ::std::set< wchar_t > >, BException ex) > asyncResult)  {
	byps_ptr< ::std::set< wchar_t > > ret = byps_ptr< ::std::set< wchar_t > >();
	try {
		ret = getChar1();
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteSetTypes::setChar1(byps_ptr< ::std::set< wchar_t > > char1)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_setChar1(byps_ptr< ::std::set< wchar_t > > char1, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		setChar1(char1);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
byps_ptr< ::std::set< int16_t > > BSkeleton_RemoteSetTypes::getShort1()  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_getShort1(std::function< void (byps_ptr< ::std::set< int16_t > >, BException ex) > asyncResult)  {
	byps_ptr< ::std::set< int16_t > > ret = byps_ptr< ::std::set< int16_t > >();
	try {
		ret = getShort1();
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteSetTypes::setShort1(byps_ptr< ::std::set< int16_t > > short1)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_setShort1(byps_ptr< ::std::set< int16_t > > short1, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		setShort1(short1);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
byps_ptr< ::std::set< int32_t > > BSkeleton_RemoteSetTypes::getInt1()  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_getInt1(std::function< void (byps_ptr< ::std::set< int32_t > >, BException ex) > asyncResult)  {
	byps_ptr< ::std::set< int32_t > > ret = byps_ptr< ::std::set< int32_t > >();
	try {
		ret = getInt1();
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteSetTypes::setInt1(byps_ptr< ::std::set< int32_t > > int1)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_setInt1(byps_ptr< ::std::set< int32_t > > int1, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		setInt1(int1);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
byps_ptr< ::std::set< int64_t > > BSkeleton_RemoteSetTypes::getLong1()  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_getLong1(std::function< void (byps_ptr< ::std::set< int64_t > >, BException ex) > asyncResult)  {
	byps_ptr< ::std::set< int64_t > > ret = byps_ptr< ::std::set< int64_t > >();
	try {
		ret = getLong1();
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteSetTypes::setLong1(byps_ptr< ::std::set< int64_t > > long1)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_setLong1(byps_ptr< ::std::set< int64_t > > long1, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		setLong1(long1);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
byps_ptr< ::std::set< float > > BSkeleton_RemoteSetTypes::getFloat1()  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_getFloat1(std::function< void (byps_ptr< ::std::set< float > >, BException ex) > asyncResult)  {
	byps_ptr< ::std::set< float > > ret = byps_ptr< ::std::set< float > >();
	try {
		ret = getFloat1();
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteSetTypes::setFloat1(byps_ptr< ::std::set< float > > float1)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_setFloat1(byps_ptr< ::std::set< float > > float1, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		setFloat1(float1);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
byps_ptr< ::std::set< double > > BSkeleton_RemoteSetTypes::getDouble1()  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_getDouble1(std::function< void (byps_ptr< ::std::set< double > >, BException ex) > asyncResult)  {
	byps_ptr< ::std::set< double > > ret = byps_ptr< ::std::set< double > >();
	try {
		ret = getDouble1();
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteSetTypes::setDouble1(byps_ptr< ::std::set< double > > double1)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_setDouble1(byps_ptr< ::std::set< double > > double1, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		setDouble1(double1);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
byps_ptr< ::std::set< ::std::wstring > > BSkeleton_RemoteSetTypes::getString1()  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_getString1(std::function< void (byps_ptr< ::std::set< ::std::wstring > >, BException ex) > asyncResult)  {
	byps_ptr< ::std::set< ::std::wstring > > ret = byps_ptr< ::std::set< ::std::wstring > >();
	try {
		ret = getString1();
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteSetTypes::setString1(byps_ptr< ::std::set< ::std::wstring > > string1)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_setString1(byps_ptr< ::std::set< ::std::wstring > > string1, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		setString1(string1);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > > BSkeleton_RemoteSetTypes::getPrimitiveTypes1()  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_getPrimitiveTypes1(std::function< void (byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > >, BException ex) > asyncResult)  {
	byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > > ret = byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > >();
	try {
		ret = getPrimitiveTypes1();
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteSetTypes::setPrimitiveTypes1(byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > > primitiveTypes1)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_setPrimitiveTypes1(byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > > primitiveTypes1, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		setPrimitiveTypes1(primitiveTypes1);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
byps_ptr< ::std::set< PBytes > > BSkeleton_RemoteSetTypes::getByte2()  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_getByte2(std::function< void (byps_ptr< ::std::set< PBytes > >, BException ex) > asyncResult)  {
	byps_ptr< ::std::set< PBytes > > ret = byps_ptr< ::std::set< PBytes > >();
	try {
		ret = getByte2();
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteSetTypes::setByte2(byps_ptr< ::std::set< PBytes > > byte2)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_setByte2(byps_ptr< ::std::set< PBytes > > byte2, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		setByte2(byte2);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > > BSkeleton_RemoteSetTypes::getInt2()  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_getInt2(std::function< void (byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > >, BException ex) > asyncResult)  {
	byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > > ret = byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > >();
	try {
		ret = getInt2();
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteSetTypes::setInt2(byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > > int2)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_setInt2(byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > > int2, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		setInt2(int2);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
byps_ptr< ::std::set< PSerializable > > BSkeleton_RemoteSetTypes::getObj1()  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_getObj1(std::function< void (byps_ptr< ::std::set< PSerializable > >, BException ex) > asyncResult)  {
	byps_ptr< ::std::set< PSerializable > > ret = byps_ptr< ::std::set< PSerializable > >();
	try {
		ret = getObj1();
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteSetTypes::setObj1(byps_ptr< ::std::set< PSerializable > > obj1)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteSetTypes::async_setObj1(byps_ptr< ::std::set< PSerializable > > obj1, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		setObj1(obj1);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
}}}}}}


namespace com { namespace wilutions { namespace byps { namespace test { namespace api { namespace remote { 

BStub_RemoteSetTypes::BStub_RemoteSetTypes(PTransport transport) 
	: BStub(transport) {}

byps_ptr< ::std::set< bool > > BStub_RemoteSetTypes::getBoolean1()  {
	BSyncResultT< byps_ptr< ::std::set< bool > > > syncResult;	
	async_getBoolean1([&syncResult](byps_ptr< ::std::set< bool > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::async_getBoolean1(std::function< void (byps_ptr< ::std::set< bool > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getBoolean1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< bool > >, com::wilutions::byps::test::api::BResult_1365696060 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setBoolean1(byps_ptr< ::std::set< bool > > boolean1)  {
	BSyncResultT< bool > syncResult;	
	async_setBoolean1(boolean1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::async_setBoolean1(byps_ptr< ::std::set< bool > > boolean1, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setBoolean1(boolean1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< int8_t > > BStub_RemoteSetTypes::getByte1()  {
	BSyncResultT< byps_ptr< ::std::set< int8_t > > > syncResult;	
	async_getByte1([&syncResult](byps_ptr< ::std::set< int8_t > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::async_getByte1(std::function< void (byps_ptr< ::std::set< int8_t > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getByte1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< int8_t > >, com::wilutions::byps::test::api::BResult_31512998 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setByte1(byps_ptr< ::std::set< int8_t > > byte1)  {
	BSyncResultT< bool > syncResult;	
	async_setByte1(byte1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::async_setByte1(byps_ptr< ::std::set< int8_t > > byte1, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setByte1(byte1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< wchar_t > > BStub_RemoteSetTypes::getChar1()  {
	BSyncResultT< byps_ptr< ::std::set< wchar_t > > > syncResult;	
	async_getChar1([&syncResult](byps_ptr< ::std::set< wchar_t > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::async_getChar1(std::function< void (byps_ptr< ::std::set< wchar_t > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getChar1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< wchar_t > >, com::wilutions::byps::test::api::BResult_936607009 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setChar1(byps_ptr< ::std::set< wchar_t > > char1)  {
	BSyncResultT< bool > syncResult;	
	async_setChar1(char1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::async_setChar1(byps_ptr< ::std::set< wchar_t > > char1, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setChar1(char1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< int16_t > > BStub_RemoteSetTypes::getShort1()  {
	BSyncResultT< byps_ptr< ::std::set< int16_t > > > syncResult;	
	async_getShort1([&syncResult](byps_ptr< ::std::set< int16_t > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::async_getShort1(std::function< void (byps_ptr< ::std::set< int16_t > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getShort1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< int16_t > >, com::wilutions::byps::test::api::BResult_2028443792 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setShort1(byps_ptr< ::std::set< int16_t > > short1)  {
	BSyncResultT< bool > syncResult;	
	async_setShort1(short1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::async_setShort1(byps_ptr< ::std::set< int16_t > > short1, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setShort1(short1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< int32_t > > BStub_RemoteSetTypes::getInt1()  {
	BSyncResultT< byps_ptr< ::std::set< int32_t > > > syncResult;	
	async_getInt1([&syncResult](byps_ptr< ::std::set< int32_t > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::async_getInt1(std::function< void (byps_ptr< ::std::set< int32_t > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getInt1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< int32_t > >, com::wilutions::byps::test::api::BResult_1493282670 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setInt1(byps_ptr< ::std::set< int32_t > > int1)  {
	BSyncResultT< bool > syncResult;	
	async_setInt1(int1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::async_setInt1(byps_ptr< ::std::set< int32_t > > int1, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setInt1(int1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< int64_t > > BStub_RemoteSetTypes::getLong1()  {
	BSyncResultT< byps_ptr< ::std::set< int64_t > > > syncResult;	
	async_getLong1([&syncResult](byps_ptr< ::std::set< int64_t > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::async_getLong1(std::function< void (byps_ptr< ::std::set< int64_t > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getLong1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< int64_t > >, com::wilutions::byps::test::api::BResult_1457164460 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setLong1(byps_ptr< ::std::set< int64_t > > long1)  {
	BSyncResultT< bool > syncResult;	
	async_setLong1(long1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::async_setLong1(byps_ptr< ::std::set< int64_t > > long1, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setLong1(long1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< float > > BStub_RemoteSetTypes::getFloat1()  {
	BSyncResultT< byps_ptr< ::std::set< float > > > syncResult;	
	async_getFloat1([&syncResult](byps_ptr< ::std::set< float > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::async_getFloat1(std::function< void (byps_ptr< ::std::set< float > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getFloat1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< float > >, com::wilutions::byps::test::api::BResult_1898022288 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setFloat1(byps_ptr< ::std::set< float > > float1)  {
	BSyncResultT< bool > syncResult;	
	async_setFloat1(float1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::async_setFloat1(byps_ptr< ::std::set< float > > float1, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setFloat1(float1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< double > > BStub_RemoteSetTypes::getDouble1()  {
	BSyncResultT< byps_ptr< ::std::set< double > > > syncResult;	
	async_getDouble1([&syncResult](byps_ptr< ::std::set< double > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::async_getDouble1(std::function< void (byps_ptr< ::std::set< double > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getDouble1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< double > >, com::wilutions::byps::test::api::BResult_1320560671 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setDouble1(byps_ptr< ::std::set< double > > double1)  {
	BSyncResultT< bool > syncResult;	
	async_setDouble1(double1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::async_setDouble1(byps_ptr< ::std::set< double > > double1, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setDouble1(double1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< ::std::wstring > > BStub_RemoteSetTypes::getString1()  {
	BSyncResultT< byps_ptr< ::std::set< ::std::wstring > > > syncResult;	
	async_getString1([&syncResult](byps_ptr< ::std::set< ::std::wstring > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::async_getString1(std::function< void (byps_ptr< ::std::set< ::std::wstring > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getString1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< ::std::wstring > >, com::wilutions::byps::test::api::BResult_1888799711 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setString1(byps_ptr< ::std::set< ::std::wstring > > string1)  {
	BSyncResultT< bool > syncResult;	
	async_setString1(string1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::async_setString1(byps_ptr< ::std::set< ::std::wstring > > string1, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setString1(string1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > > BStub_RemoteSetTypes::getPrimitiveTypes1()  {
	BSyncResultT< byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > > > syncResult;	
	async_getPrimitiveTypes1([&syncResult](byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::async_getPrimitiveTypes1(std::function< void (byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getPrimitiveTypes1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > >, com::wilutions::byps::test::api::BResult_1280571537 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setPrimitiveTypes1(byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > > primitiveTypes1)  {
	BSyncResultT< bool > syncResult;	
	async_setPrimitiveTypes1(primitiveTypes1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::async_setPrimitiveTypes1(byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > > primitiveTypes1, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setPrimitiveTypes1(primitiveTypes1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< PBytes > > BStub_RemoteSetTypes::getByte2()  {
	BSyncResultT< byps_ptr< ::std::set< PBytes > > > syncResult;	
	async_getByte2([&syncResult](byps_ptr< ::std::set< PBytes > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::async_getByte2(std::function< void (byps_ptr< ::std::set< PBytes > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getByte2());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< PBytes > >, com::wilutions::byps::test::api::BResult_2052431866 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setByte2(byps_ptr< ::std::set< PBytes > > byte2)  {
	BSyncResultT< bool > syncResult;	
	async_setByte2(byte2, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::async_setByte2(byps_ptr< ::std::set< PBytes > > byte2, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setByte2(byte2));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > > BStub_RemoteSetTypes::getInt2()  {
	BSyncResultT< byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > > > syncResult;	
	async_getInt2([&syncResult](byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::async_getInt2(std::function< void (byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getInt2());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > >, com::wilutions::byps::test::api::BResult_1406124761 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setInt2(byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > > int2)  {
	BSyncResultT< bool > syncResult;	
	async_setInt2(int2, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::async_setInt2(byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > > int2, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setInt2(int2));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< PSerializable > > BStub_RemoteSetTypes::getObj1()  {
	BSyncResultT< byps_ptr< ::std::set< PSerializable > > > syncResult;	
	async_getObj1([&syncResult](byps_ptr< ::std::set< PSerializable > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::async_getObj1(std::function< void (byps_ptr< ::std::set< PSerializable > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getObj1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< PSerializable > >, com::wilutions::byps::test::api::BResult_14 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setObj1(byps_ptr< ::std::set< PSerializable > > obj1)  {
	BSyncResultT< bool > syncResult;	
	async_setObj1(obj1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::async_setObj1(byps_ptr< ::std::set< PSerializable > > obj1, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setObj1(obj1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
}}}}}}

namespace com { namespace wilutions { namespace byps { namespace test { namespace api { 
void BSerializer_1156008353(BIO& bio, POBJECT& , PSerializable& pObjS, void* ){
	BSerializable* p = pObjS.get();
	if (bio.is_loading) {
		if (p) return;
		BTargetId targetId;
		bio & targetId;
		PTransport transport(new BTransport(*bio.transport, targetId));
		pObjS = PSerializable(new com::wilutions::byps::test::api::remote::BStub_RemoteSetTypes(transport));
	}
	else {
		com::wilutions::byps::test::api::remote::RemoteSetTypes* r = dynamic_cast<com::wilutions::byps::test::api::remote::RemoteSetTypes*>(p);
		BTargetId targetId = r->BRemote_getTargetId();
		bio & targetId;
	}
}
}}}}}

namespace com { namespace wilutions { namespace byps { namespace test { namespace api { namespace remote { 

PContentStream BSkeleton_RemoteStreams::getImage()  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteStreams::async_getImage(std::function< void (PContentStream, BException ex) > asyncResult)  {
	PContentStream ret = PContentStream();
	try {
		ret = getImage();
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteStreams::setImage(PContentStream istrm)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteStreams::async_setImage(PContentStream istrm, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		setImage(istrm);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
byps_ptr< ::std::map< int32_t , PContentStream > > BSkeleton_RemoteStreams::getImages()  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteStreams::async_getImages(std::function< void (byps_ptr< ::std::map< int32_t , PContentStream > >, BException ex) > asyncResult)  {
	byps_ptr< ::std::map< int32_t , PContentStream > > ret = byps_ptr< ::std::map< int32_t , PContentStream > >();
	try {
		ret = getImages();
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteStreams::setImages(byps_ptr< ::std::map< int32_t , PContentStream > > istrms, int32_t doNotReadStreamAtKey)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteStreams::async_setImages(byps_ptr< ::std::map< int32_t , PContentStream > > istrms, int32_t doNotReadStreamAtKey, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		setImages(istrms, doNotReadStreamAtKey);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteStreams::throwLastException()  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteStreams::async_throwLastException(std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		throwLastException();
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
PContentStream BSkeleton_RemoteStreams::getTextStream()  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteStreams::async_getTextStream(std::function< void (PContentStream, BException ex) > asyncResult)  {
	PContentStream ret = PContentStream();
	try {
		ret = getTextStream();
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
}}}}}}


namespace com { namespace wilutions { namespace byps { namespace test { namespace api { namespace remote { 

BStub_RemoteStreams::BStub_RemoteStreams(PTransport transport) 
	: BStub(transport) {}

PContentStream BStub_RemoteStreams::getImage()  {
	BSyncResultT< PContentStream > syncResult;	
	async_getImage([&syncResult](PContentStream v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteStreams::async_getImage(std::function< void (PContentStream, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteStreams_getImage());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< PContentStream, com::wilutions::byps::test::api::BResult_15 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteStreams::setImage(PContentStream istrm)  {
	BSyncResultT< bool > syncResult;	
	async_setImage(istrm, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteStreams::async_setImage(PContentStream istrm, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteStreams_setImage(istrm));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::map< int32_t , PContentStream > > BStub_RemoteStreams::getImages()  {
	BSyncResultT< byps_ptr< ::std::map< int32_t , PContentStream > > > syncResult;	
	async_getImages([&syncResult](byps_ptr< ::std::map< int32_t , PContentStream > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteStreams::async_getImages(std::function< void (byps_ptr< ::std::map< int32_t , PContentStream > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteStreams_getImages());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::map< int32_t , PContentStream > >, com::wilutions::byps::test::api::BResult_476459792 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteStreams::setImages(byps_ptr< ::std::map< int32_t , PContentStream > > istrms, int32_t doNotReadStreamAtKey)  {
	BSyncResultT< bool > syncResult;	
	async_setImages(istrms, doNotReadStreamAtKey, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteStreams::async_setImages(byps_ptr< ::std::map< int32_t , PContentStream > > istrms, int32_t doNotReadStreamAtKey, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteStreams_setImages(istrms, doNotReadStreamAtKey));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteStreams::throwLastException()  {
	BSyncResultT< bool > syncResult;	
	async_throwLastException([&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteStreams::async_throwLastException(std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteStreams_throwLastException());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
PContentStream BStub_RemoteStreams::getTextStream()  {
	BSyncResultT< PContentStream > syncResult;	
	async_getTextStream([&syncResult](PContentStream v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteStreams::async_getTextStream(std::function< void (PContentStream, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteStreams_getTextStream());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< PContentStream, com::wilutions::byps::test::api::BResult_15 >(asyncResult) );
	transport->send(req, outerResult);
}
}}}}}}

namespace com { namespace wilutions { namespace byps { namespace test { namespace api { 
void BSerializer_2028487863(BIO& bio, POBJECT& , PSerializable& pObjS, void* ){
	BSerializable* p = pObjS.get();
	if (bio.is_loading) {
		if (p) return;
		BTargetId targetId;
		bio & targetId;
		PTransport transport(new BTransport(*bio.transport, targetId));
		pObjS = PSerializable(new com::wilutions::byps::test::api::remote::BStub_RemoteStreams(transport));
	}
	else {
		com::wilutions::byps::test::api::remote::RemoteStreams* r = dynamic_cast<com::wilutions::byps::test::api::remote::RemoteStreams*>(p);
		BTargetId targetId = r->BRemote_getTargetId();
		bio & targetId;
	}
}
}}}}}

namespace com { namespace wilutions { namespace byps { namespace test { namespace api { namespace remote { 

void BSkeleton_RemoteWithAuthentication::setUseAuthentication(bool useAuth)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteWithAuthentication::async_setUseAuthentication(bool useAuth, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		setUseAuthentication(useAuth);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
com::wilutions::byps::test::api::auth::PSessionInfo BSkeleton_RemoteWithAuthentication::login(com::wilutions::byps::test::api::auth::PSessionInfo sess, ::std::wstring userName, ::std::wstring userPwd)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteWithAuthentication::async_login(com::wilutions::byps::test::api::auth::PSessionInfo sess, ::std::wstring userName, ::std::wstring userPwd, std::function< void (com::wilutions::byps::test::api::auth::PSessionInfo, BException ex) > asyncResult)  {
	com::wilutions::byps::test::api::auth::PSessionInfo ret = com::wilutions::byps::test::api::auth::PSessionInfo();
	try {
		ret = login(sess, userName, userPwd);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
int32_t BSkeleton_RemoteWithAuthentication::doit(com::wilutions::byps::test::api::auth::PSessionInfo sess, int32_t value)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteWithAuthentication::async_doit(com::wilutions::byps::test::api::auth::PSessionInfo sess, int32_t value, std::function< void (int32_t, BException ex) > asyncResult)  {
	int32_t ret = int32_t();
	try {
		ret = doit(sess, value);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteWithAuthentication::expire(com::wilutions::byps::test::api::auth::PSessionInfo sess)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteWithAuthentication::async_expire(com::wilutions::byps::test::api::auth::PSessionInfo sess, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		expire(sess);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
void BSkeleton_RemoteWithAuthentication::setReloginCount(int32_t count)  {
	throw BException(EX_UNSUPPORTED_METHOD, L"");
}
void BSkeleton_RemoteWithAuthentication::async_setReloginCount(int32_t count, std::function< void (bool, BException ex) > asyncResult)  {
	bool ret = false;
	try {
		setReloginCount(count);
		asyncResult(ret, BException());
	} catch (const std::exception& ex) {
		asyncResult(ret, ex);
	}
}
}}}}}}


namespace com { namespace wilutions { namespace byps { namespace test { namespace api { namespace remote { 

BStub_RemoteWithAuthentication::BStub_RemoteWithAuthentication(PTransport transport) 
	: BStub(transport) {}

void BStub_RemoteWithAuthentication::setUseAuthentication(bool useAuth)  {
	BSyncResultT< bool > syncResult;	
	async_setUseAuthentication(useAuth, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteWithAuthentication::async_setUseAuthentication(bool useAuth, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteWithAuthentication_setUseAuthentication(useAuth));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
com::wilutions::byps::test::api::auth::PSessionInfo BStub_RemoteWithAuthentication::login(com::wilutions::byps::test::api::auth::PSessionInfo sess, ::std::wstring userName, ::std::wstring userPwd)  {
	BSyncResultT< com::wilutions::byps::test::api::auth::PSessionInfo > syncResult;	
	async_login(sess, userName, userPwd, [&syncResult](com::wilutions::byps::test::api::auth::PSessionInfo v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteWithAuthentication::async_login(com::wilutions::byps::test::api::auth::PSessionInfo sess, ::std::wstring userName, ::std::wstring userPwd, std::function< void (com::wilutions::byps::test::api::auth::PSessionInfo, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteWithAuthentication_login(sess, userName, userPwd));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< com::wilutions::byps::test::api::auth::PSessionInfo, com::wilutions::byps::test::api::BResult_65775978 >(asyncResult) );
	transport->send(req, outerResult);
}
int32_t BStub_RemoteWithAuthentication::doit(com::wilutions::byps::test::api::auth::PSessionInfo sess, int32_t value)  {
	BSyncResultT< int32_t > syncResult;	
	async_doit(sess, value, [&syncResult](int32_t v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteWithAuthentication::async_doit(com::wilutions::byps::test::api::auth::PSessionInfo sess, int32_t value, std::function< void (int32_t, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteWithAuthentication_doit(sess, value));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< int32_t, com::wilutions::byps::test::api::BResult_5 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteWithAuthentication::expire(com::wilutions::byps::test::api::auth::PSessionInfo sess)  {
	BSyncResultT< bool > syncResult;	
	async_expire(sess, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteWithAuthentication::async_expire(com::wilutions::byps::test::api::auth::PSessionInfo sess, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteWithAuthentication_expire(sess));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteWithAuthentication::setReloginCount(int32_t count)  {
	BSyncResultT< bool > syncResult;	
	async_setReloginCount(count, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteWithAuthentication::async_setReloginCount(int32_t count, std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteWithAuthentication_setReloginCount(count));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
}}}}}}

namespace com { namespace wilutions { namespace byps { namespace test { namespace api { 
void BSerializer_1677934392(BIO& bio, POBJECT& , PSerializable& pObjS, void* ){
	BSerializable* p = pObjS.get();
	if (bio.is_loading) {
		if (p) return;
		BTargetId targetId;
		bio & targetId;
		PTransport transport(new BTransport(*bio.transport, targetId));
		pObjS = PSerializable(new com::wilutions::byps::test::api::remote::BStub_RemoteWithAuthentication(transport));
	}
	else {
		com::wilutions::byps::test::api::remote::RemoteWithAuthentication* r = dynamic_cast<com::wilutions::byps::test::api::remote::RemoteWithAuthentication*>(p);
		BTargetId targetId = r->BRemote_getTargetId();
		bio & targetId;
	}
}
}}}}}
