﻿//
// Serializer for com.wilutions.byps.test.api.BResult_588723219
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api
{
	
	public class BSerializer_1886698628 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_1886698628();
		
		public BSerializer_1886698628()
			: base(1886698628) {}
		
		public BSerializer_1886698628(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BResult_588723219 obj = (BResult_588723219)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			bout.writeObj(obj._result, true, com.wilutions.byps.test.api.BSerializer_588723219.instance);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BResult_588723219 obj = (BResult_588723219)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_588723219()));
			
			BBufferBin bbuf = bin.bbuf;
			obj._result = (String[,,,])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_588723219.instance);
			
			return obj;
		}
		
	}
} // namespace
