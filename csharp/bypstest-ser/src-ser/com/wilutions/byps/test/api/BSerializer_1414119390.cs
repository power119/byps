﻿//
// Serializer for com.wilutions.byps.test.api.BResult_181681714
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api
{
	
	public class BSerializer_1414119390 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_1414119390();
		
		public BSerializer_1414119390()
			: base(1414119390) {}
		
		public BSerializer_1414119390(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BResult_181681714 obj = (BResult_181681714)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			bout.writeObj(obj._result, false, com.wilutions.byps.test.api.BSerializer_181681714.instance);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BResult_181681714 obj = (BResult_181681714)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_181681714()));
			
			BBufferBin bbuf = bin.bbuf;
			obj._result = (IList<int>)bin.readObj(false, null);
			
			return obj;
		}
		
	}
} // namespace
