package byps.test.api.inherit;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteClassAuth DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteClassAsync:68
public interface BioLemonServiceAuth extends BRemote, 
	byps.test.api.inherit.BioFruitServiceAuth, 
	byps.test.api.inherit.LemonServiceAuth {
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public int useParing() throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void useParing(final BAsyncResult<Integer> asyncResult) ;
	
	
}
