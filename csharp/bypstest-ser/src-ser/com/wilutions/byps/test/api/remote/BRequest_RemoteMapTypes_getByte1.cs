﻿//
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.remote
{
	
	public sealed class BRequest_RemoteMapTypes_getByte1 : BMethodRequest, BSerializable
	{
	
		#region Execute
		
		public int getRemoteId() { return 80483097; }
		
		public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) {
			try {
				RemoteMapTypes __byps__remoteT = (RemoteMapTypes)__byps__remote;				
				BAsyncResultSendMethod<Dictionary<double,byte>> __byps__outerResult = new BAsyncResultSendMethod<Dictionary<double,byte>>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_1972793385());				
				__byps__remoteT.async_GetByte1(__byps__outerResult);
			} catch (Exception e) {
				__byps__asyncResult.setAsyncResult(null, e);
				throw e;
			}
		}		
		
		#endregion
		
		#region Fields
		
		#endregion
		
		
		public static readonly long serialVersionUID = 1348711374L;		
	} // end class
}  // end namespace