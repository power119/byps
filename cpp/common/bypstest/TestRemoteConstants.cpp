/* USE THIS FILE ACCORDING TO THE COPYRIGHT RULES IN LICENSE.TXT WHICH IS PART OF THE SOURCE CODE PACKAGE */
#include "AllTests.h"


using namespace byps;
using namespace com::wilutions::test;

using namespace byps::test::api;
using namespace byps::test::api::cons;
using namespace byps::test::api::remote;



class TestRemoteConstants : public TestBase {
	static BLogger log;
public:
	TestRemoteConstants(void* app) : TestBase(app) {}

	void testCompareConstants() {
		PRemoteConstants remote = client->getRemoteConstants();

		remote->compare_HebrewC(HebrewC::ALEPH, HebrewC::BETH);


		remote->compare_AllTypesC(
			AllTypesC::bool1s,
			AllTypesC::bool2s,
			AllTypesC::char1s,
			AllTypesC::stringNull,
			AllTypesC::char2s,
			AllTypesC::short1s,
			AllTypesC::int1s,
			AllTypesC::long1s,
			AllTypesC::float1s,
			AllTypesC::double1s,
			AllTypesC::string1s,
			AllTypesC::ALL,
			AllTypesC::arrInt,
			AllTypesC::arrInt4,
			AllTypesC::arrStrings,
			AllTypesC::arrStrings4,
			AllTypesC::arrALL);

 	}


	virtual void init() {
		ADD_TEST(testCompareConstants);
	}
};

BLogger TestRemoteConstants::log("TestRemoteConstants");

TestCase* TestRemoteConstants_create(void* app) {
	return new TestRemoteConstants(app);
}
