﻿#include "Testser-impl.h"
using namespace ::std;
using namespace ::com::wilutions::byps;


namespace com { namespace wilutions { namespace byps { namespace test { namespace api { namespace remote { 

BStub_RemotePrimitiveTypes::BStub_RemotePrimitiveTypes(PTransport transport) 
	: BStub(transport) {}

void BStub_RemotePrimitiveTypes::voidFunctionVoid()  {
	BSyncResultT< bool > syncResult;	
	voidFunctionVoid([&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::voidFunctionVoid(::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_voidFunctionVoid());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemotePrimitiveTypes::setBool(bool v)  {
	BSyncResultT< bool > syncResult;	
	setBool(v, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::setBool(bool v, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_setBool(v));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemotePrimitiveTypes::setByte(int8_t v)  {
	BSyncResultT< bool > syncResult;	
	setByte(v, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::setByte(int8_t v, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_setByte(v));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemotePrimitiveTypes::setChar(wchar_t v)  {
	BSyncResultT< bool > syncResult;	
	setChar(v, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::setChar(wchar_t v, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_setChar(v));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemotePrimitiveTypes::setShort(int16_t v)  {
	BSyncResultT< bool > syncResult;	
	setShort(v, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::setShort(int16_t v, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_setShort(v));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemotePrimitiveTypes::setInt(int32_t v)  {
	BSyncResultT< bool > syncResult;	
	setInt(v, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::setInt(int32_t v, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_setInt(v));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemotePrimitiveTypes::setLong(int64_t v)  {
	BSyncResultT< bool > syncResult;	
	setLong(v, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::setLong(int64_t v, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_setLong(v));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemotePrimitiveTypes::setFloat(float v)  {
	BSyncResultT< bool > syncResult;	
	setFloat(v, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::setFloat(float v, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_setFloat(v));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemotePrimitiveTypes::setDouble(double v)  {
	BSyncResultT< bool > syncResult;	
	setDouble(v, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::setDouble(double v, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_setDouble(v));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemotePrimitiveTypes::setString(::std::wstring v)  {
	BSyncResultT< bool > syncResult;	
	setString(v, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::setString(::std::wstring v, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_setString(v));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemotePrimitiveTypes::setPrimitiveTypes(com::wilutions::byps::test::api::prim::PPrimitiveTypes v)  {
	BSyncResultT< bool > syncResult;	
	setPrimitiveTypes(v, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::setPrimitiveTypes(com::wilutions::byps::test::api::prim::PPrimitiveTypes v, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_setPrimitiveTypes(v));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemotePrimitiveTypes::setObject(PSerializable v)  {
	BSyncResultT< bool > syncResult;	
	setObject(v, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::setObject(PSerializable v, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_setObject(v));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
bool BStub_RemotePrimitiveTypes::getBool()  {
	BSyncResultT< bool > syncResult;	
	getBool([&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::getBool(::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_getBool());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_1 >(asyncResult) );
	transport->send(req, outerResult);
}
int8_t BStub_RemotePrimitiveTypes::getByte()  {
	BSyncResultT< int8_t > syncResult;	
	getByte([&syncResult](int8_t v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::getByte(::std::function< void (int8_t, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_getByte());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< int8_t, com::wilutions::byps::test::api::BResult_2 >(asyncResult) );
	transport->send(req, outerResult);
}
wchar_t BStub_RemotePrimitiveTypes::getChar()  {
	BSyncResultT< wchar_t > syncResult;	
	getChar([&syncResult](wchar_t v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::getChar(::std::function< void (wchar_t, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_getChar());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< wchar_t, com::wilutions::byps::test::api::BResult_4 >(asyncResult) );
	transport->send(req, outerResult);
}
int16_t BStub_RemotePrimitiveTypes::getShort()  {
	BSyncResultT< int16_t > syncResult;	
	getShort([&syncResult](int16_t v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::getShort(::std::function< void (int16_t, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_getShort());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< int16_t, com::wilutions::byps::test::api::BResult_3 >(asyncResult) );
	transport->send(req, outerResult);
}
int32_t BStub_RemotePrimitiveTypes::getInt()  {
	BSyncResultT< int32_t > syncResult;	
	getInt([&syncResult](int32_t v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::getInt(::std::function< void (int32_t, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_getInt());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< int32_t, com::wilutions::byps::test::api::BResult_5 >(asyncResult) );
	transport->send(req, outerResult);
}
int64_t BStub_RemotePrimitiveTypes::getLong()  {
	BSyncResultT< int64_t > syncResult;	
	getLong([&syncResult](int64_t v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::getLong(::std::function< void (int64_t, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_getLong());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< int64_t, com::wilutions::byps::test::api::BResult_6 >(asyncResult) );
	transport->send(req, outerResult);
}
float BStub_RemotePrimitiveTypes::getFloat()  {
	BSyncResultT< float > syncResult;	
	getFloat([&syncResult](float v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::getFloat(::std::function< void (float, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_getFloat());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< float, com::wilutions::byps::test::api::BResult_7 >(asyncResult) );
	transport->send(req, outerResult);
}
double BStub_RemotePrimitiveTypes::getDouble()  {
	BSyncResultT< double > syncResult;	
	getDouble([&syncResult](double v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::getDouble(::std::function< void (double, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_getDouble());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< double, com::wilutions::byps::test::api::BResult_8 >(asyncResult) );
	transport->send(req, outerResult);
}
::std::wstring BStub_RemotePrimitiveTypes::getString()  {
	BSyncResultT< ::std::wstring > syncResult;	
	getString([&syncResult](::std::wstring v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::getString(::std::function< void (::std::wstring, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_getString());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< ::std::wstring, com::wilutions::byps::test::api::BResult_10 >(asyncResult) );
	transport->send(req, outerResult);
}
com::wilutions::byps::test::api::prim::PPrimitiveTypes BStub_RemotePrimitiveTypes::getPrimitiveTypes()  {
	BSyncResultT< com::wilutions::byps::test::api::prim::PPrimitiveTypes > syncResult;	
	getPrimitiveTypes([&syncResult](com::wilutions::byps::test::api::prim::PPrimitiveTypes v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::getPrimitiveTypes(::std::function< void (com::wilutions::byps::test::api::prim::PPrimitiveTypes, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_getPrimitiveTypes());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< com::wilutions::byps::test::api::prim::PPrimitiveTypes, com::wilutions::byps::test::api::BResult_1000 >(asyncResult) );
	transport->send(req, outerResult);
}
PSerializable BStub_RemotePrimitiveTypes::getObject()  {
	BSyncResultT< PSerializable > syncResult;	
	getObject([&syncResult](PSerializable v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::getObject(::std::function< void (PSerializable, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_getObject());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< PSerializable, com::wilutions::byps::test::api::BResult_21 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemotePrimitiveTypes::sendAllTypes(bool b, wchar_t c, int16_t s, int32_t i, int64_t l, float f, double d, ::std::wstring str, com::wilutions::byps::test::api::prim::PPrimitiveTypes pt, PSerializable o)  {
	BSyncResultT< bool > syncResult;	
	sendAllTypes(b, c, s, i, l, f, d, str, pt, o, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::sendAllTypes(bool b, wchar_t c, int16_t s, int32_t i, int64_t l, float f, double d, ::std::wstring str, com::wilutions::byps::test::api::prim::PPrimitiveTypes pt, PSerializable o, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_sendAllTypes(b, c, s, i, l, f, d, str, pt, o));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
int32_t BStub_RemotePrimitiveTypes::add(int32_t a, int32_t b)  {
	BSyncResultT< int32_t > syncResult;	
	add(a, b, [&syncResult](int32_t v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemotePrimitiveTypes::add(int32_t a, int32_t b, ::std::function< void (int32_t, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemotePrimitiveTypes_add(a, b));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< int32_t, com::wilutions::byps::test::api::BResult_5 >(asyncResult) );
	transport->send(req, outerResult);
}
}}}}}}

// checkpoint com.wilutions.byps.gen.cpp.GenRemoteStub:223
namespace com { namespace wilutions { namespace byps { namespace test { namespace api { 
void BSerializer_1341983932(BIO& bio, POBJECT& , PSerializable& pObjS, void* ){
	BSerializable* p = pObjS.get();
	if (bio.is_loading) {
		if (p) return;
		BTargetId targetId;
		bio & targetId;
		PTransport transport(new BTransport(*bio.transport, targetId));
		pObjS = PSerializable(new com::wilutions::byps::test::api::remote::BStub_RemotePrimitiveTypes(transport));
	}
	else {
		com::wilutions::byps::test::api::remote::RemotePrimitiveTypes* r = dynamic_cast<com::wilutions::byps::test::api::remote::RemotePrimitiveTypes*>(p);
		BTargetId targetId = r->BRemote_getTargetId();
		bio & targetId;
	}
}
}}}}}

namespace com { namespace wilutions { namespace byps { namespace test { namespace api { namespace remote { 

BStub_RemoteReferences::BStub_RemoteReferences(PTransport transport) 
	: BStub(transport) {}

com::wilutions::byps::test::api::refs::PNode BStub_RemoteReferences::getNode()  {
	BSyncResultT< com::wilutions::byps::test::api::refs::PNode > syncResult;	
	getNode([&syncResult](com::wilutions::byps::test::api::refs::PNode v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteReferences::getNode(::std::function< void (com::wilutions::byps::test::api::refs::PNode, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteReferences_getNode());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< com::wilutions::byps::test::api::refs::PNode, com::wilutions::byps::test::api::BResult_9001 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteReferences::setNode(com::wilutions::byps::test::api::refs::PNode v)  {
	BSyncResultT< bool > syncResult;	
	setNode(v, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteReferences::setNode(com::wilutions::byps::test::api::refs::PNode v, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteReferences_setNode(v));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
}}}}}}

// checkpoint com.wilutions.byps.gen.cpp.GenRemoteStub:223
namespace com { namespace wilutions { namespace byps { namespace test { namespace api { 
void BSerializer_2086824050(BIO& bio, POBJECT& , PSerializable& pObjS, void* ){
	BSerializable* p = pObjS.get();
	if (bio.is_loading) {
		if (p) return;
		BTargetId targetId;
		bio & targetId;
		PTransport transport(new BTransport(*bio.transport, targetId));
		pObjS = PSerializable(new com::wilutions::byps::test::api::remote::BStub_RemoteReferences(transport));
	}
	else {
		com::wilutions::byps::test::api::remote::RemoteReferences* r = dynamic_cast<com::wilutions::byps::test::api::remote::RemoteReferences*>(p);
		BTargetId targetId = r->BRemote_getTargetId();
		bio & targetId;
	}
}
}}}}}

namespace com { namespace wilutions { namespace byps { namespace test { namespace api { namespace remote { 

BStub_RemoteServerCtrl::BStub_RemoteServerCtrl(PTransport transport) 
	: BStub(transport) {}

void BStub_RemoteServerCtrl::publishRemote(::std::wstring name, PRemote remote, bool fowardToOtherServers)  {
	BSyncResultT< bool > syncResult;	
	publishRemote(name, remote, fowardToOtherServers, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteServerCtrl::publishRemote(::std::wstring name, PRemote remote, bool fowardToOtherServers, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteServerCtrl_publishRemote(name, remote, fowardToOtherServers));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
PRemote BStub_RemoteServerCtrl::getPublishedRemote(::std::wstring name)  {
	BSyncResultT< PRemote > syncResult;	
	getPublishedRemote(name, [&syncResult](PRemote v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteServerCtrl::getPublishedRemote(::std::wstring name, ::std::function< void (PRemote, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteServerCtrl_getPublishedRemote(name));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< PRemote, com::wilutions::byps::test::api::BResult_16 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteServerCtrl::removePublishedRemote(::std::wstring name)  {
	BSyncResultT< bool > syncResult;	
	removePublishedRemote(name, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteServerCtrl::removePublishedRemote(::std::wstring name, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteServerCtrl_removePublishedRemote(name));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
}}}}}}

// checkpoint com.wilutions.byps.gen.cpp.GenRemoteStub:223
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

BStub_RemoteSetTypes::BStub_RemoteSetTypes(PTransport transport) 
	: BStub(transport) {}

byps_ptr< ::std::set< bool > > BStub_RemoteSetTypes::getBoolean1()  {
	BSyncResultT< byps_ptr< ::std::set< bool > > > syncResult;	
	getBoolean1([&syncResult](byps_ptr< ::std::set< bool > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::getBoolean1(::std::function< void (byps_ptr< ::std::set< bool > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getBoolean1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< bool > >, com::wilutions::byps::test::api::BResult_1365696060 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setBoolean1(byps_ptr< ::std::set< bool > > boolean1)  {
	BSyncResultT< bool > syncResult;	
	setBoolean1(boolean1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::setBoolean1(byps_ptr< ::std::set< bool > > boolean1, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setBoolean1(boolean1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< int8_t > > BStub_RemoteSetTypes::getByte1()  {
	BSyncResultT< byps_ptr< ::std::set< int8_t > > > syncResult;	
	getByte1([&syncResult](byps_ptr< ::std::set< int8_t > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::getByte1(::std::function< void (byps_ptr< ::std::set< int8_t > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getByte1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< int8_t > >, com::wilutions::byps::test::api::BResult_31512998 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setByte1(byps_ptr< ::std::set< int8_t > > byte1)  {
	BSyncResultT< bool > syncResult;	
	setByte1(byte1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::setByte1(byps_ptr< ::std::set< int8_t > > byte1, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setByte1(byte1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< wchar_t > > BStub_RemoteSetTypes::getChar1()  {
	BSyncResultT< byps_ptr< ::std::set< wchar_t > > > syncResult;	
	getChar1([&syncResult](byps_ptr< ::std::set< wchar_t > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::getChar1(::std::function< void (byps_ptr< ::std::set< wchar_t > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getChar1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< wchar_t > >, com::wilutions::byps::test::api::BResult_936607009 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setChar1(byps_ptr< ::std::set< wchar_t > > char1)  {
	BSyncResultT< bool > syncResult;	
	setChar1(char1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::setChar1(byps_ptr< ::std::set< wchar_t > > char1, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setChar1(char1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< int16_t > > BStub_RemoteSetTypes::getShort1()  {
	BSyncResultT< byps_ptr< ::std::set< int16_t > > > syncResult;	
	getShort1([&syncResult](byps_ptr< ::std::set< int16_t > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::getShort1(::std::function< void (byps_ptr< ::std::set< int16_t > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getShort1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< int16_t > >, com::wilutions::byps::test::api::BResult_2028443792 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setShort1(byps_ptr< ::std::set< int16_t > > short1)  {
	BSyncResultT< bool > syncResult;	
	setShort1(short1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::setShort1(byps_ptr< ::std::set< int16_t > > short1, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setShort1(short1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< int32_t > > BStub_RemoteSetTypes::getInt1()  {
	BSyncResultT< byps_ptr< ::std::set< int32_t > > > syncResult;	
	getInt1([&syncResult](byps_ptr< ::std::set< int32_t > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::getInt1(::std::function< void (byps_ptr< ::std::set< int32_t > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getInt1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< int32_t > >, com::wilutions::byps::test::api::BResult_1493282670 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setInt1(byps_ptr< ::std::set< int32_t > > int1)  {
	BSyncResultT< bool > syncResult;	
	setInt1(int1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::setInt1(byps_ptr< ::std::set< int32_t > > int1, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setInt1(int1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< int64_t > > BStub_RemoteSetTypes::getLong1()  {
	BSyncResultT< byps_ptr< ::std::set< int64_t > > > syncResult;	
	getLong1([&syncResult](byps_ptr< ::std::set< int64_t > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::getLong1(::std::function< void (byps_ptr< ::std::set< int64_t > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getLong1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< int64_t > >, com::wilutions::byps::test::api::BResult_1457164460 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setLong1(byps_ptr< ::std::set< int64_t > > long1)  {
	BSyncResultT< bool > syncResult;	
	setLong1(long1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::setLong1(byps_ptr< ::std::set< int64_t > > long1, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setLong1(long1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< float > > BStub_RemoteSetTypes::getFloat1()  {
	BSyncResultT< byps_ptr< ::std::set< float > > > syncResult;	
	getFloat1([&syncResult](byps_ptr< ::std::set< float > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::getFloat1(::std::function< void (byps_ptr< ::std::set< float > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getFloat1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< float > >, com::wilutions::byps::test::api::BResult_1898022288 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setFloat1(byps_ptr< ::std::set< float > > float1)  {
	BSyncResultT< bool > syncResult;	
	setFloat1(float1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::setFloat1(byps_ptr< ::std::set< float > > float1, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setFloat1(float1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< double > > BStub_RemoteSetTypes::getDouble1()  {
	BSyncResultT< byps_ptr< ::std::set< double > > > syncResult;	
	getDouble1([&syncResult](byps_ptr< ::std::set< double > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::getDouble1(::std::function< void (byps_ptr< ::std::set< double > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getDouble1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< double > >, com::wilutions::byps::test::api::BResult_1320560671 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setDouble1(byps_ptr< ::std::set< double > > double1)  {
	BSyncResultT< bool > syncResult;	
	setDouble1(double1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::setDouble1(byps_ptr< ::std::set< double > > double1, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setDouble1(double1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< ::std::wstring > > BStub_RemoteSetTypes::getString1()  {
	BSyncResultT< byps_ptr< ::std::set< ::std::wstring > > > syncResult;	
	getString1([&syncResult](byps_ptr< ::std::set< ::std::wstring > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::getString1(::std::function< void (byps_ptr< ::std::set< ::std::wstring > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getString1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< ::std::wstring > >, com::wilutions::byps::test::api::BResult_1888799711 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setString1(byps_ptr< ::std::set< ::std::wstring > > string1)  {
	BSyncResultT< bool > syncResult;	
	setString1(string1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::setString1(byps_ptr< ::std::set< ::std::wstring > > string1, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setString1(string1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > > BStub_RemoteSetTypes::getPrimitiveTypes1()  {
	BSyncResultT< byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > > > syncResult;	
	getPrimitiveTypes1([&syncResult](byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::getPrimitiveTypes1(::std::function< void (byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getPrimitiveTypes1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > >, com::wilutions::byps::test::api::BResult_1280571537 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setPrimitiveTypes1(byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > > primitiveTypes1)  {
	BSyncResultT< bool > syncResult;	
	setPrimitiveTypes1(primitiveTypes1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::setPrimitiveTypes1(byps_ptr< ::std::set< com::wilutions::byps::test::api::prim::PPrimitiveTypes > > primitiveTypes1, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setPrimitiveTypes1(primitiveTypes1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< PBytes > > BStub_RemoteSetTypes::getByte2()  {
	BSyncResultT< byps_ptr< ::std::set< PBytes > > > syncResult;	
	getByte2([&syncResult](byps_ptr< ::std::set< PBytes > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::getByte2(::std::function< void (byps_ptr< ::std::set< PBytes > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getByte2());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< PBytes > >, com::wilutions::byps::test::api::BResult_2052431866 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setByte2(byps_ptr< ::std::set< PBytes > > byte2)  {
	BSyncResultT< bool > syncResult;	
	setByte2(byte2, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::setByte2(byps_ptr< ::std::set< PBytes > > byte2, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setByte2(byte2));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > > BStub_RemoteSetTypes::getInt2()  {
	BSyncResultT< byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > > > syncResult;	
	getInt2([&syncResult](byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::getInt2(::std::function< void (byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getInt2());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > >, com::wilutions::byps::test::api::BResult_1406124761 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setInt2(byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > > int2)  {
	BSyncResultT< bool > syncResult;	
	setInt2(int2, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::setInt2(byps_ptr< ::std::set< byps_ptr< BArray1< int32_t > > > > int2, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setInt2(int2));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::set< PSerializable > > BStub_RemoteSetTypes::getObj1()  {
	BSyncResultT< byps_ptr< ::std::set< PSerializable > > > syncResult;	
	getObj1([&syncResult](byps_ptr< ::std::set< PSerializable > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteSetTypes::getObj1(::std::function< void (byps_ptr< ::std::set< PSerializable > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_getObj1());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::set< PSerializable > >, com::wilutions::byps::test::api::BResult_14 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteSetTypes::setObj1(byps_ptr< ::std::set< PSerializable > > obj1)  {
	BSyncResultT< bool > syncResult;	
	setObj1(obj1, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteSetTypes::setObj1(byps_ptr< ::std::set< PSerializable > > obj1, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteSetTypes_setObj1(obj1));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
}}}}}}

// checkpoint com.wilutions.byps.gen.cpp.GenRemoteStub:223
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

BStub_RemoteStreams::BStub_RemoteStreams(PTransport transport) 
	: BStub(transport) {}

PContentStream BStub_RemoteStreams::getImage()  {
	BSyncResultT< PContentStream > syncResult;	
	getImage([&syncResult](PContentStream v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteStreams::getImage(::std::function< void (PContentStream, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteStreams_getImage());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< PContentStream, com::wilutions::byps::test::api::BResult_15 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteStreams::setImage(PContentStream istrm)  {
	BSyncResultT< bool > syncResult;	
	setImage(istrm, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteStreams::setImage(PContentStream istrm, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteStreams_setImage(istrm));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
byps_ptr< ::std::map< int32_t , PContentStream > > BStub_RemoteStreams::getImages()  {
	BSyncResultT< byps_ptr< ::std::map< int32_t , PContentStream > > > syncResult;	
	getImages([&syncResult](byps_ptr< ::std::map< int32_t , PContentStream > > v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteStreams::getImages(::std::function< void (byps_ptr< ::std::map< int32_t , PContentStream > >, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteStreams_getImages());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< byps_ptr< ::std::map< int32_t , PContentStream > >, com::wilutions::byps::test::api::BResult_476459792 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteStreams::setImages(byps_ptr< ::std::map< int32_t , PContentStream > > istrms, int32_t doNotReadStreamAtKey)  {
	BSyncResultT< bool > syncResult;	
	setImages(istrms, doNotReadStreamAtKey, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteStreams::setImages(byps_ptr< ::std::map< int32_t , PContentStream > > istrms, int32_t doNotReadStreamAtKey, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteStreams_setImages(istrms, doNotReadStreamAtKey));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteStreams::throwLastException()  {
	BSyncResultT< bool > syncResult;	
	throwLastException([&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteStreams::throwLastException(::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteStreams_throwLastException());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
PContentStream BStub_RemoteStreams::getTextStream()  {
	BSyncResultT< PContentStream > syncResult;	
	getTextStream([&syncResult](PContentStream v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteStreams::getTextStream(::std::function< void (PContentStream, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteStreams_getTextStream());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< PContentStream, com::wilutions::byps::test::api::BResult_15 >(asyncResult) );
	transport->send(req, outerResult);
}
}}}}}}

// checkpoint com.wilutions.byps.gen.cpp.GenRemoteStub:223
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
void BSkeleton_RemoteWithAuthentication::setUseAuthentication(bool useAuth, ::std::function< void (bool, BException ex) > asyncResult)  {
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
void BSkeleton_RemoteWithAuthentication::login(com::wilutions::byps::test::api::auth::PSessionInfo sess, ::std::wstring userName, ::std::wstring userPwd, ::std::function< void (com::wilutions::byps::test::api::auth::PSessionInfo, BException ex) > asyncResult)  {
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
void BSkeleton_RemoteWithAuthentication::doit(com::wilutions::byps::test::api::auth::PSessionInfo sess, int32_t value, ::std::function< void (int32_t, BException ex) > asyncResult)  {
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
void BSkeleton_RemoteWithAuthentication::expire(com::wilutions::byps::test::api::auth::PSessionInfo sess, ::std::function< void (bool, BException ex) > asyncResult)  {
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
void BSkeleton_RemoteWithAuthentication::setReloginCount(int32_t count, ::std::function< void (bool, BException ex) > asyncResult)  {
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
	setUseAuthentication(useAuth, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteWithAuthentication::setUseAuthentication(bool useAuth, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteWithAuthentication_setUseAuthentication(useAuth));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
com::wilutions::byps::test::api::auth::PSessionInfo BStub_RemoteWithAuthentication::login(::std::wstring userName, ::std::wstring userPwd)  {
	BSyncResultT< com::wilutions::byps::test::api::auth::PSessionInfo > syncResult;	
	login(userName, userPwd, [&syncResult](com::wilutions::byps::test::api::auth::PSessionInfo v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteWithAuthentication::login(::std::wstring userName, ::std::wstring userPwd, ::std::function< void (com::wilutions::byps::test::api::auth::PSessionInfo, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteWithAuthentication_login(userName, userPwd));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< com::wilutions::byps::test::api::auth::PSessionInfo, com::wilutions::byps::test::api::BResult_65775978 >(asyncResult) );
	transport->send(req, outerResult);
}
int32_t BStub_RemoteWithAuthentication::doit(int32_t value)  {
	BSyncResultT< int32_t > syncResult;	
	doit(value, [&syncResult](int32_t v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_RemoteWithAuthentication::doit(int32_t value, ::std::function< void (int32_t, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteWithAuthentication_doit(value));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< int32_t, com::wilutions::byps::test::api::BResult_5 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteWithAuthentication::expire()  {
	BSyncResultT< bool > syncResult;	
	expire([&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteWithAuthentication::expire(::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteWithAuthentication_expire());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
void BStub_RemoteWithAuthentication::setReloginCount(int32_t count)  {
	BSyncResultT< bool > syncResult;	
	setReloginCount(count, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_RemoteWithAuthentication::setReloginCount(int32_t count, ::std::function< void (bool, BException ex) > asyncResult)  {
	PSerializable req(new BRequest_RemoteWithAuthentication_setReloginCount(count));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, com::wilutions::byps::test::api::BResult_19 >(asyncResult) );
	transport->send(req, outerResult);
}
}}}}}}

// checkpoint com.wilutions.byps.gen.cpp.GenRemoteStub:223
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
		com::wilutions::byps::test::api::remote::RemoteWithAuthenticationAuth* r = dynamic_cast<com::wilutions::byps::test::api::remote::RemoteWithAuthenticationAuth*>(p);
		BTargetId targetId = r->BRemote_getTargetId();
		bio & targetId;
	}
}
}}}}}
