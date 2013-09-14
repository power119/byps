﻿using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api
{
	
	public class BServer_Testser : BServer { 
	
		public static BServer_Testser createServer(BTransportFactory transportFactory) {
			return new BServer_Testser(transportFactory);
		}
		
		public static BServer_Testser createServerR(BTransport transport) {
			return new BServer_Testser(transport);
		}
		
		public BServer_Testser(BTransport transport) 
			: base(transport, null)
		{
		}
		
		public BServer_Testser(BTransportFactory transportFactory) 
			: base(
				transportFactory.createServerTransport(),
				transportFactory.createClientR(
					BClient_Testser.createClientR(
						transportFactory.createClientTransport()
					)
				)
			)
		{
		}
		
		public BServer_Testser addRemote(com.wilutions.byps.test.api.remote.BSkeleton_RemoteWithAuthentication remoteSkeleton) {
			addRemote(1677934392, remoteSkeleton);
			return this;
		}
		
		public BServer_Testser addRemote(com.wilutions.byps.test.api.srvr.BSkeleton_ClientIF remoteSkeleton) {
			addRemote(1784257353, remoteSkeleton);
			return this;
		}
		
	}
}
