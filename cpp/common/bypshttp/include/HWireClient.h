#ifndef HWIRECLIENT_H_
#define HWIRECLIENT_H_


#include "Bypshttp.h"

namespace com { namespace wilutions { namespace byps { namespace http {

using namespace com::wilutions::byps;

class HWireClient_RequestsToCancel;
typedef byps_ptr<HWireClient_RequestsToCancel> PWireClient_RequestsToCancel;

class HWireClient : public BWire, public std::enable_shared_from_this<HWireClient> {
	
public:
	const std::wstring url;

	static PWire create(const std::wstring& url, int32_t flags, int32_t timeoutSeconds, PThreadPool tpool);

	virtual ~HWireClient();

    virtual void send(const PMessage& msg, PAsyncResult asyncResult);

    virtual void sendR(const PMessage& msg, PAsyncResult asyncResult);

	virtual PContentStream getStream(int64_t messageId, int64_t streamId);

    virtual int64_t makeMessageId();

	virtual void done();
	
	virtual void cancelAllRequests();

	void throwLastException();

	virtual PTestAdapter getTestAdapter();

protected:
	HWireClient(const std::wstring& url, int32_t flags, int32_t timeoutSeconds, PThreadPool tpool);

	void init();

	PWireClient_RequestsToCancel requestsToCancel;

	BException lastException;
	std::wstring urlPath;
	DWORD urlFlags;
	DWORD timeoutMillisClient;
	PThreadPool tpool;
	bool isMyThreadPool;
	byps_atomic<bool> isDone;

	void internalCancelAllRequests(int64_t cancelMessageId, PAsyncResult asyncResult);

	void internalSend(const PMessage& msg, PAsyncResult asyncResult, DWORD timeoutMillis);
	void internalSendStreamsThenMessage(const PMessage& msg, PAsyncResult asyncResult, DWORD timeoutMillis);

	friend class HWireClient_TestAdapter;
};

}}}}

#endif