﻿//
// Serializer for com.wilutions.byps.test.api.srvr.BRequest_ServerIF_getPartner
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.srvr
{
	
	public class BSerializer_748402113 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_748402113();
		
		public BSerializer_748402113()
			: base(748402113) {}
		
		public BSerializer_748402113(int typeId)
			: base(typeId) {}
		
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BRequest_ServerIF_getPartner obj = (BRequest_ServerIF_getPartner)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_ServerIF_getPartner()));
			
			BBufferBin bbuf = bin.bbuf;
			
			return obj;
		}
		
	}
} // namespace
