﻿//
// Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteListTypes_getInt3
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.remote
{
	
	public class BSerializer_874047763 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_874047763();
		
		public BSerializer_874047763()
			: base(874047763) {}
		
		public BSerializer_874047763(int typeId)
			: base(typeId) {}
		
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BRequest_RemoteListTypes_getInt3 obj = (BRequest_RemoteListTypes_getInt3)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteListTypes_getInt3()));
			
			BBufferBin bbuf = bin.bbuf;
			
			return obj;
		}
		
	}
} // namespace
