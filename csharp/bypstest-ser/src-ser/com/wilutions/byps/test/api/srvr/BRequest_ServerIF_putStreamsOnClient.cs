﻿//
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.srvr
{
	
	public sealed class BRequest_ServerIF_putStreamsOnClient : BMethodRequest, BSerializable
	{
	
		#region Execute
		
		public int getRemoteId() { return 1313562065; }
		
		public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) {
			try {
				ServerIF __byps__remoteT = (ServerIF)__byps__remote;				
				BAsyncResultSendMethod<Object> __byps__outerResult = new BAsyncResultSendMethod<Object>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_19());				
				__byps__remoteT.async_PutStreamsOnClient(_streams, __byps__outerResult);
			} catch (Exception e) {
				__byps__asyncResult.setAsyncResult(null, e);
				throw e;
			}
		}		
		
		#endregion
		
		#region Fields
		
		internal IList<System.IO.Stream> _streams;

		#endregion
		
		
		public static readonly long serialVersionUID = 1367013829L;		
	} // end class
}  // end namespace