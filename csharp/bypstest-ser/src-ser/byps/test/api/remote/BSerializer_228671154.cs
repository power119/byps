﻿//
// Serializer for byps.test.api.remote.BRequest_RemoteListTypes_setDouble1
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace byps.test.api.remote
{
	
	public class BSerializer_228671154 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_228671154();
		
		public BSerializer_228671154()
			: base(228671154) {}
		
		public BSerializer_228671154(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BRequest_RemoteListTypes_setDouble1 obj = (BRequest_RemoteListTypes_setDouble1)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			bout.writeObj(obj._double1, false, byps.test.api.BSerializer_1555345627.instance);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BRequest_RemoteListTypes_setDouble1 obj = (BRequest_RemoteListTypes_setDouble1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteListTypes_setDouble1()));
			
			BBufferBin bbuf = bin.bbuf;
			obj._double1 = (IList<double>)bin.readObj(false, null);
			
			return obj;
		}
		
	}
} // namespace