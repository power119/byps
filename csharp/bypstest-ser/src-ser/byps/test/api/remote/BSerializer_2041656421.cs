﻿//
// Serializer for byps.test.api.remote.BRequest_RemoteArrayTypes4dim_getShort
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace byps.test.api.remote
{
	
	public class BSerializer_2041656421 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_2041656421();
		
		public BSerializer_2041656421()
			: base(2041656421) {}
		
		public BSerializer_2041656421(int typeId)
			: base(typeId) {}
		
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BRequest_RemoteArrayTypes4dim_getShort obj = (BRequest_RemoteArrayTypes4dim_getShort)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes4dim_getShort()));
			
			BBufferBin bbuf = bin.bbuf;
			
			return obj;
		}
		
	}
} // namespace
