﻿using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using byps;

namespace byps.test.api.remote
{
	
	public class BStub_RemoteWithAuthentication : BStub, RemoteWithAuthenticationAuth, BSerializable {	
		
		public readonly static long serialVersionUID = 1983670399L;
		
		public BStub_RemoteWithAuthentication(BTransport transport)
			: base(transport) {}			
		
		public virtual void SetUseAuthentication(bool useAuth) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			SetUseAuthentication(useAuth, BAsyncResultHelper.ToDelegate<Object>(asyncResult));
			asyncResult.GetResult();			
		}
		public virtual void SetUseAuthentication(bool useAuth, BAsyncResult<Object> asyncResult) {
			BRequest_RemoteWithAuthentication_setUseAuthentication req = new BRequest_RemoteWithAuthentication_setUseAuthentication();			
			req.useAuthValue = useAuth;
			transport.sendMethod(req, asyncResult);
		}
		// checkpoint byps.gen.cs.GenRemoteStub:133
		public async Task SetUseAuthenticationAsync(bool useAuth){
			BRequest_RemoteWithAuthentication_setUseAuthentication req = new BRequest_RemoteWithAuthentication_setUseAuthentication();			
			req.useAuthValue = useAuth;
			Task<Object> task = Task<Object>.Factory.FromAsync(transport.BeginSend<Object>, transport.EndSend<Object>, req, null);
			await task;
		}
		
		public virtual byps.test.api.auth.SessionInfo Login(String userName, String userPwd) {
			BSyncResult<byps.test.api.auth.SessionInfo> asyncResult = new BSyncResult<byps.test.api.auth.SessionInfo>();			
			Login(userName, userPwd, BAsyncResultHelper.ToDelegate<byps.test.api.auth.SessionInfo>(asyncResult));
			return asyncResult.GetResult();			
		}
		public virtual void Login(String userName, String userPwd, BAsyncResult<byps.test.api.auth.SessionInfo> asyncResult) {
			BRequest_RemoteWithAuthentication_login req = new BRequest_RemoteWithAuthentication_login();			
			req.userNameValue = userName;
			req.userPwdValue = userPwd;
			transport.sendMethod(req, asyncResult);
		}
		// checkpoint byps.gen.cs.GenRemoteStub:133
		public async Task<byps.test.api.auth.SessionInfo> LoginAsync(String userName, String userPwd){
			BRequest_RemoteWithAuthentication_login req = new BRequest_RemoteWithAuthentication_login();			
			req.userNameValue = userName;
			req.userPwdValue = userPwd;
			Task<byps.test.api.auth.SessionInfo> task = Task<byps.test.api.auth.SessionInfo>.Factory.FromAsync(transport.BeginSend<byps.test.api.auth.SessionInfo>, transport.EndSend<byps.test.api.auth.SessionInfo>, req, null);
			return await task;
		}
		
		public virtual int Doit(int value) {
			BSyncResult<int> asyncResult = new BSyncResult<int>();			
			Doit(value, BAsyncResultHelper.ToDelegate<int>(asyncResult));
			return asyncResult.GetResult();			
		}
		public virtual void Doit(int value, BAsyncResult<int> asyncResult) {
			BRequest_RemoteWithAuthentication_doit req = new BRequest_RemoteWithAuthentication_doit();			
			req.valueValue = value;
			transport.sendMethod(req, asyncResult);
		}
		// checkpoint byps.gen.cs.GenRemoteStub:133
		public async Task<int> DoitAsync(int value){
			BRequest_RemoteWithAuthentication_doit req = new BRequest_RemoteWithAuthentication_doit();			
			req.valueValue = value;
			Task<int> task = Task<int>.Factory.FromAsync(transport.BeginSend<int>, transport.EndSend<int>, req, null);
			return await task;
		}
		
		public virtual void Expire() {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			Expire(BAsyncResultHelper.ToDelegate<Object>(asyncResult));
			asyncResult.GetResult();			
		}
		public virtual void Expire(BAsyncResult<Object> asyncResult) {
			BRequest_RemoteWithAuthentication_expire req = new BRequest_RemoteWithAuthentication_expire();			
			transport.sendMethod(req, asyncResult);
		}
		// checkpoint byps.gen.cs.GenRemoteStub:133
		public async Task ExpireAsync(){
			BRequest_RemoteWithAuthentication_expire req = new BRequest_RemoteWithAuthentication_expire();			
			Task<Object> task = Task<Object>.Factory.FromAsync(transport.BeginSend<Object>, transport.EndSend<Object>, req, null);
			await task;
		}
		
		public virtual void SetReloginCount(int count) {
			BSyncResult<Object> asyncResult = new BSyncResult<Object>();			
			SetReloginCount(count, BAsyncResultHelper.ToDelegate<Object>(asyncResult));
			asyncResult.GetResult();			
		}
		public virtual void SetReloginCount(int count, BAsyncResult<Object> asyncResult) {
			BRequest_RemoteWithAuthentication_setReloginCount req = new BRequest_RemoteWithAuthentication_setReloginCount();			
			req.countValue = count;
			transport.sendMethod(req, asyncResult);
		}
		// checkpoint byps.gen.cs.GenRemoteStub:133
		public async Task SetReloginCountAsync(int count){
			BRequest_RemoteWithAuthentication_setReloginCount req = new BRequest_RemoteWithAuthentication_setReloginCount();			
			req.countValue = count;
			Task<Object> task = Task<Object>.Factory.FromAsync(transport.BeginSend<Object>, transport.EndSend<Object>, req, null);
			await task;
		}
		
		
	}
}
