﻿//
// Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setChar
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.remote
{
	
	public class BSerializer_589230893 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_589230893();
		
		public BSerializer_589230893()
			: base(589230893) {}
		
		public BSerializer_589230893(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BRequest_RemoteArrayTypes1dim_setChar obj = (BRequest_RemoteArrayTypes1dim_setChar)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			bout.writeObj(obj._v, false, com.wilutions.byps.test.api.BSerializer_1361632968.instance);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BRequest_RemoteArrayTypes1dim_setChar obj = (BRequest_RemoteArrayTypes1dim_setChar)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes1dim_setChar()));
			
			BBufferBin bbuf = bin.bbuf;
			obj._v = (char[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1361632968.instance);
			
			return obj;
		}
		
	}
} // namespace
