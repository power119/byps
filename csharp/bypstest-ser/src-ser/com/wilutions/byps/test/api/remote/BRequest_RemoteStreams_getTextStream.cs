﻿//
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.remote
{
	
	public sealed class BRequest_RemoteStreams_getTextStream : BMethodRequest, BSerializable
	{
	
		#region Execute
		
		public override int getRemoteId() { return 2028487863; }
		
		public override void execute(BRemote __byps__remote, BAsyncResultIF<Object> __byps__asyncResult) {
			// checkpoint com.wilutions.byps.gen.cs.GenApiClass:372
			try {
				RemoteStreams __byps__remoteT = (RemoteStreams)__byps__remote;				
				BAsyncResultSendMethod<System.IO.Stream> __byps__outerResult = new BAsyncResultSendMethod<System.IO.Stream>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_15());				
				__byps__remoteT.GetTextStream(BAsyncResultHelper.ToDelegate(__byps__outerResult));
			} catch (Exception e) {
				__byps__asyncResult.setAsyncResult(null, e);
				throw e;
			}
		}		
		
		#endregion
		
		#region Fields
		
		#endregion
		
		
		public static readonly long serialVersionUID = 1083407988L;		
	} // end class
}  // end namespace
