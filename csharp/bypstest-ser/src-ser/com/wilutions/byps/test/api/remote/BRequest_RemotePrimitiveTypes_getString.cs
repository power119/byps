﻿//
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.remote
{
	
	public sealed class BRequest_RemotePrimitiveTypes_getString : BMethodRequest, BSerializable
	{
	
		#region Execute
		
		public int getRemoteId() { return 1341983932; }
		
		public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) {
			try {
				RemotePrimitiveTypes __byps__remoteT = (RemotePrimitiveTypes)__byps__remote;				
				BAsyncResultSendMethod<String> __byps__outerResult = new BAsyncResultSendMethod<String>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_10());				
				__byps__remoteT.async_GetString(__byps__outerResult);
			} catch (Exception e) {
				__byps__asyncResult.setAsyncResult("", e);
				throw e;
			}
		}		
		
		#endregion
		
		#region Fields
		
		#endregion
		
		
		public static readonly long serialVersionUID = 104976387L;		
	} // end class
}  // end namespace