﻿using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.remote
{
	
	// checkpoint com.wilutions.byps.gen.cs.GenRemoteClass:93
	public interface RemotePrimitiveTypes : BRemote {
	
		void VoidFunctionVoid();
		void VoidFunctionVoid(BAsyncResult<Object> asyncResult) ;
		Task VoidFunctionVoidAsync();
		
		void SetBool(bool v);
		void SetBool(bool v, BAsyncResult<Object> asyncResult) ;
		Task SetBoolAsync(bool v);
		
		void SetByte(byte v);
		void SetByte(byte v, BAsyncResult<Object> asyncResult) ;
		Task SetByteAsync(byte v);
		
		void SetChar(char v);
		void SetChar(char v, BAsyncResult<Object> asyncResult) ;
		Task SetCharAsync(char v);
		
		void SetShort(short v);
		void SetShort(short v, BAsyncResult<Object> asyncResult) ;
		Task SetShortAsync(short v);
		
		void SetInt(int v);
		void SetInt(int v, BAsyncResult<Object> asyncResult) ;
		Task SetIntAsync(int v);
		
		void SetLong(long v);
		void SetLong(long v, BAsyncResult<Object> asyncResult) ;
		Task SetLongAsync(long v);
		
		void SetFloat(float v);
		void SetFloat(float v, BAsyncResult<Object> asyncResult) ;
		Task SetFloatAsync(float v);
		
		void SetDouble(double v);
		void SetDouble(double v, BAsyncResult<Object> asyncResult) ;
		Task SetDoubleAsync(double v);
		
		void SetString(String v);
		void SetString(String v, BAsyncResult<Object> asyncResult) ;
		Task SetStringAsync(String v);
		
		void SetPrimitiveTypes(com.wilutions.byps.test.api.prim.PrimitiveTypes v);
		void SetPrimitiveTypes(com.wilutions.byps.test.api.prim.PrimitiveTypes v, BAsyncResult<Object> asyncResult) ;
		Task SetPrimitiveTypesAsync(com.wilutions.byps.test.api.prim.PrimitiveTypes v);
		
		void SetObject(Object v);
		void SetObject(Object v, BAsyncResult<Object> asyncResult) ;
		Task SetObjectAsync(Object v);
		
		bool GetBool();
		void GetBool(BAsyncResult<bool> asyncResult) ;
		Task<bool> GetBoolAsync();
		
		byte GetByte();
		void GetByte(BAsyncResult<byte> asyncResult) ;
		Task<byte> GetByteAsync();
		
		char GetChar();
		void GetChar(BAsyncResult<char> asyncResult) ;
		Task<char> GetCharAsync();
		
		short GetShort();
		void GetShort(BAsyncResult<short> asyncResult) ;
		Task<short> GetShortAsync();
		
		int GetInt();
		void GetInt(BAsyncResult<int> asyncResult) ;
		Task<int> GetIntAsync();
		
		long GetLong();
		void GetLong(BAsyncResult<long> asyncResult) ;
		Task<long> GetLongAsync();
		
		float GetFloat();
		void GetFloat(BAsyncResult<float> asyncResult) ;
		Task<float> GetFloatAsync();
		
		double GetDouble();
		void GetDouble(BAsyncResult<double> asyncResult) ;
		Task<double> GetDoubleAsync();
		
		String GetString();
		void GetString(BAsyncResult<String> asyncResult) ;
		Task<String> GetStringAsync();
		
		com.wilutions.byps.test.api.prim.PrimitiveTypes GetPrimitiveTypes();
		void GetPrimitiveTypes(BAsyncResult<com.wilutions.byps.test.api.prim.PrimitiveTypes> asyncResult) ;
		Task<com.wilutions.byps.test.api.prim.PrimitiveTypes> GetPrimitiveTypesAsync();
		
		Object GetObject();
		void GetObject(BAsyncResult<Object> asyncResult) ;
		Task<Object> GetObjectAsync();
		
		void SendAllTypes(bool b, char c, short s, int i, long l, float f, double d, String str, com.wilutions.byps.test.api.prim.PrimitiveTypes pt, Object o);
		void SendAllTypes(bool b, char c, short s, int i, long l, float f, double d, String str, com.wilutions.byps.test.api.prim.PrimitiveTypes pt, Object o, BAsyncResult<Object> asyncResult) ;
		Task SendAllTypesAsync(bool b, char c, short s, int i, long l, float f, double d, String str, com.wilutions.byps.test.api.prim.PrimitiveTypes pt, Object o);
		
		int Add(int a, int b);
		void Add(int a, int b, BAsyncResult<int> asyncResult) ;
		Task<int> AddAsync(int a, int b);
		
		void ThrowException();
		void ThrowException(BAsyncResult<Object> asyncResult) ;
		Task ThrowExceptionAsync();
		
		
	}
}  // end namespace
