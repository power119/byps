﻿package com.wilutions.byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_RemoteConstants_compare_HebrewC implements BMethodRequest, Serializable {

	public com.wilutions.byps.test.api.cons.HebrewZ ALEPH;
	public com.wilutions.byps.test.api.cons.HebrewZ BETH;
	
	private final static long serialVersionUID = 1570751625L;
	
	@Override
	public int getRemoteId() { return 431648293; }
	
	@Override
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteConstantsAsync __byps__remoteT = (RemoteConstantsAsync)__byps__remote;			
			BAsyncResultSendMethod<Object> __byps__outerResult = new BAsyncResultSendMethod<Object>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_19());			
			__byps__remoteT.async_compare_HebrewC(ALEPH, BETH, __byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}