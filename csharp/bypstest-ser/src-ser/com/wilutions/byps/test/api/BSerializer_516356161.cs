﻿//
// Serializer for com.wilutions.byps.test.api.BResult_846419204
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api
{
	
	public class BSerializer_516356161 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_516356161();
		
		public BSerializer_516356161()
			: base(516356161) {}
		
		public BSerializer_516356161(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BResult_846419204 obj = (BResult_846419204)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			bout.writeObj(obj._result, false, com.wilutions.byps.test.api.BSerializer_846419204.instance);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BResult_846419204 obj = (BResult_846419204)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_846419204()));
			
			BBufferBin bbuf = bin.bbuf;
			obj._result = (long[,,,])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_846419204.instance);
			
			return obj;
		}
		
	}
} // namespace
