﻿//
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.remote
{
	
	public sealed class BRequest_RemoteSetTypes_getInt1 : BMethodRequest, BSerializable
	{
	
		#region Execute
		
		public int getRemoteId() { return 1156008353; }
		
		public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) {
			try {
				RemoteSetTypes __byps__remoteT = (RemoteSetTypes)__byps__remote;				
				BAsyncResultSendMethod<ISet<int>> __byps__outerResult = new BAsyncResultSendMethod<ISet<int>>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_1493282670());				
				__byps__remoteT.async_GetInt1(__byps__outerResult);
			} catch (Exception e) {
				__byps__asyncResult.setAsyncResult(null, e);
				throw e;
			}
		}		
		
		#endregion
		
		#region Fields
		
		#endregion
		
		
		public static readonly long serialVersionUID = 68372557L;		
	} // end class
}  // end namespace