/* USE THIS FILE ACCORDING TO THE COPYRIGHT RULES IN LICENSE.TXT WHICH IS PART OF THE SOURCE CODE PACKAGE */
#ifndef BCONTENTSTREAM_H_
#define BCONTENTSTREAM_H_

#include "Byps.h"

namespace byps {

using namespace ::std;

class BContentStream : public BSerializable {
public:
	virtual ~BContentStream() {}

	virtual BTYPEID BSerializable_getTypeId() { return BTYPEID_STREAM; }

    virtual const wstring& getContentType() const = 0;
	virtual int64_t getContentLength() const = 0;
	virtual int32_t read(char* buf, int32_t offs, int32_t len) = 0;

	static void serialize(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
};

class BContentStreamImpl : public BContentStream {
public:
    BContentStreamImpl(const wstring& contentType, int64_t contentLength, PStream stream);
	BContentStreamImpl(PStream stream);
	virtual ~BContentStreamImpl() {}
    virtual const wstring& getContentType() const ;
	virtual int64_t getContentLength() const ;
	virtual int32_t read(char* buf, int32_t offs, int32_t len);
protected:
	BContentStreamImpl();
    wstring contentType;
	int64_t contentLength;
	PStream stream;
};


class BContentStreamFile : public BContentStreamImpl {
public:
#ifdef BFSTREAM_WCHAR
    BContentStreamFile(const wstring& fname);
    BContentStreamFile(const wstring& fname, const wstring& contentType, int64_t contentLength);
#endif
	BContentStreamFile(const string& fname);
    BContentStreamFile(const string& fname, const string& contentType, int64_t contentLength);
	virtual ~BContentStreamFile();
private:
    void init(ifstream* fstrm);
};

}

#endif
