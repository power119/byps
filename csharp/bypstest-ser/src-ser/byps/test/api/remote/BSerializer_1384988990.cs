﻿//
// Serializer for byps.test.api.remote.BRequest_RemoteArrayTypes1dim_getFloat
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace byps.test.api.remote
{
	
	public class BSerializer_1384988990 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_1384988990();
		
		public BSerializer_1384988990()
			: base(1384988990) {}
		
		public BSerializer_1384988990(int typeId)
			: base(typeId) {}
		
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BRequest_RemoteArrayTypes1dim_getFloat obj = (BRequest_RemoteArrayTypes1dim_getFloat)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes1dim_getFloat()));
			
			BBufferBin bbuf = bin.bbuf;
			
			return obj;
		}
		
	}
} // namespace
