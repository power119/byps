﻿package com.wilutions.byps.test.api.inherit;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenRemoteClassAuth DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// checkpoint com.wilutions.byps.gen.j.GenRemoteClassAsync:68
public interface BioFruitServiceAuth extends BRemote, 
	com.wilutions.byps.test.api.inherit.FruitServiceAuth {
	/**
	*/
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public boolean certify(java.lang.String param) throws RemoteException;
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void certify(java.lang.String param, final BAsyncResult<Boolean> asyncResult) ;
	
	
}
