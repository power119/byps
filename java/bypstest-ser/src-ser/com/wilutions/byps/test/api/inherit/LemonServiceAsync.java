package com.wilutions.byps.test.api.inherit;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenRemoteClassAsync DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// checkpoint com.wilutions.byps.gen.j.GenRemoteClassAsync:68
public interface LemonServiceAsync extends BRemote, 
	LemonService, 
	com.wilutions.byps.test.api.inherit.FruitServiceAsync {
	/**
	*/
	// checkpoint com.wilutions.byps.gen.j.PrintContext:359
	public java.lang.String pick(com.wilutions.byps.test.api.auth.SessionInfo sess, java.lang.String fromTree) throws RemoteException;
	// checkpoint com.wilutions.byps.gen.j.PrintContext:403
	public void pick(com.wilutions.byps.test.api.auth.SessionInfo sess, java.lang.String fromTree, final BAsyncResult<String> asyncResult) ;
	
	
}
