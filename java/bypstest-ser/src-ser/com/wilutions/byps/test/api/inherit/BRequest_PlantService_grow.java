﻿package com.wilutions.byps.test.api.inherit;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_PlantService_grow extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 1534230652L;
	
	public int getRemoteId() { return 1117460801; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final PlantServiceAsync __byps__remoteT = (PlantServiceAsync)__byps__remote;			
			BAsyncResultSendMethod<String> __byps__outerResult = new BAsyncResultSendMethod<String>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_10());			
			__byps__remoteT.grow(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}
