﻿//
// Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setString
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.remote
{
	
	public class BSerializer_362230997 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_362230997();
		
		public BSerializer_362230997()
			: base(362230997) {}
		
		public BSerializer_362230997(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BRequest_RemoteArrayTypes4dim_setString obj = (BRequest_RemoteArrayTypes4dim_setString)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			bout.writeObj(obj._v, true, com.wilutions.byps.test.api.BSerializer_588723219.instance);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BRequest_RemoteArrayTypes4dim_setString obj = (BRequest_RemoteArrayTypes4dim_setString)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes4dim_setString()));
			
			BBufferBin bbuf = bin.bbuf;
			obj._v = (String[,,,])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_588723219.instance);
			
			return obj;
		}
		
	}
} // namespace
