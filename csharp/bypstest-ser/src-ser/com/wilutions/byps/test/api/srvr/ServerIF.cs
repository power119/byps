﻿using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.srvr
{
	
	// checkpoint com.wilutions.byps.gen.cs.GenRemoteClass:81
	public interface ServerIF : BRemote {
	
		int CallClientIncrementInt(int v);
		void CallClientIncrementIntAsync(int v, BAsyncResult<int> asyncResult) ;
		IAsyncResult BeginCallClientIncrementInt(int v, AsyncCallback callback, object state);
		int EndCallClientIncrementInt(IAsyncResult asyncResult);
		
		void SetPartner(ClientIF client);
		void SetPartnerAsync(ClientIF client, BAsyncResult<Object> asyncResult) ;
		IAsyncResult BeginSetPartner(ClientIF client, AsyncCallback callback, object state);
		Object EndSetPartner(IAsyncResult asyncResult);
		
		ClientIF GetPartner();
		void GetPartnerAsync(BAsyncResult<ClientIF> asyncResult) ;
		IAsyncResult BeginGetPartner(AsyncCallback callback, object state);
		ClientIF EndGetPartner(IAsyncResult asyncResult);
		
		IList<System.IO.Stream> GetStreamsFromClient();
		void GetStreamsFromClientAsync(BAsyncResult<IList<System.IO.Stream>> asyncResult) ;
		IAsyncResult BeginGetStreamsFromClient(AsyncCallback callback, object state);
		IList<System.IO.Stream> EndGetStreamsFromClient(IAsyncResult asyncResult);
		
		void PutStreamsOnClient(IList<System.IO.Stream> streams);
		void PutStreamsOnClientAsync(IList<System.IO.Stream> streams, BAsyncResult<Object> asyncResult) ;
		IAsyncResult BeginPutStreamsOnClient(IList<System.IO.Stream> streams, AsyncCallback callback, object state);
		Object EndPutStreamsOnClient(IAsyncResult asyncResult);
		
		void RegisterWithClientMap(int id);
		void RegisterWithClientMapAsync(int id, BAsyncResult<Object> asyncResult) ;
		IAsyncResult BeginRegisterWithClientMap(int id, AsyncCallback callback, object state);
		Object EndRegisterWithClientMap(IAsyncResult asyncResult);
		
		ClientIF GetClient(int id);
		void GetClientAsync(int id, BAsyncResult<ClientIF> asyncResult) ;
		IAsyncResult BeginGetClient(int id, AsyncCallback callback, object state);
		ClientIF EndGetClient(IAsyncResult asyncResult);
		
		ISet<int> GetClientIds();
		void GetClientIdsAsync(BAsyncResult<ISet<int>> asyncResult) ;
		IAsyncResult BeginGetClientIds(AsyncCallback callback, object state);
		ISet<int> EndGetClientIds(IAsyncResult asyncResult);
		
		int CallClientParallel(int v);
		void CallClientParallelAsync(int v, BAsyncResult<int> asyncResult) ;
		IAsyncResult BeginCallClientParallel(int v, AsyncCallback callback, object state);
		int EndCallClientParallel(IAsyncResult asyncResult);
		
		
	}
}  // end namespace
