﻿//
// Serializer for com.wilutions.byps.test.api.BResult_1488550492
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api
{
	
	public class BSerializer_1240765869 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_1240765869();
		
		public BSerializer_1240765869()
			: base(1240765869) {}
		
		public BSerializer_1240765869(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BResult_1488550492 obj = (BResult_1488550492)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			bout.writeObj(obj._result, false, com.wilutions.byps.test.api.BSerializer_1488550492.instance);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BResult_1488550492 obj = (BResult_1488550492)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1488550492()));
			
			BBufferBin bbuf = bin.bbuf;
			obj._result = (IDictionary<String,Object>)bin.readObj(false, null);
			
			return obj;
		}
		
	}
} // namespace
