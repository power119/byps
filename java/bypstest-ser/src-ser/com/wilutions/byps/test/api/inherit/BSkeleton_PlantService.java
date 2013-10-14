﻿package com.wilutions.byps.test.api.inherit;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenRemoteSkeleton DO NOT MODIFY.
 */

import com.wilutions.byps.*;

/**
 * This class provides a skeleton implementation of the interface PlantService.
 * Your interface implementation class has to be derived from this skeleton.
 * Either provide an asynchronous or a synchronous function in your subclass.
 * The framework calls only the asynchronous function.
 */
@SuppressWarnings("all")
public class BSkeleton_PlantService extends BSkeleton implements PlantServiceAsync {
	
	public final static long serialVersionUID = 1117460801L;
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public java.lang.String grow() throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void grow(final BAsyncResult<String> asyncResult) {
		try {
			java.lang.String ret = grow();
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	
}
