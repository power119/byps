package byps.test.api.inherit;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteClassAsync DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteClassAsync:68
public interface FruitServiceAsync extends BRemote, 
	FruitService, 
	byps.test.api.inherit.PlantServiceAsync {
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public java.lang.String squeeze() throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void squeeze(final BAsyncResult<String> asyncResult) ;
	
	
}
