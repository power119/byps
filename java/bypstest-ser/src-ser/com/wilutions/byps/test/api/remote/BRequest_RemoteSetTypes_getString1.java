package com.wilutions.byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_RemoteSetTypes_getString1 extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 615539953L;
	
	public int getRemoteId() { return 1156008353; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteSetTypesAsync __byps__remoteT = (RemoteSetTypesAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.Set<java.lang.String>> __byps__outerResult = new BAsyncResultSendMethod<java.util.Set<java.lang.String>>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_1888799711());			
			__byps__remoteT.getString1(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}
