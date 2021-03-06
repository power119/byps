package byps.test.api.remote;

import byps.BRemote;
import byps.RemoteException;

public interface RemoteServerCtrl extends BRemote {

	public void publishRemote(String name, BRemote remote, boolean fowardToOtherServers) throws RemoteException;
	
	public BRemote getPublishedRemote(String name) throws RemoteException;
	
	public void removePublishedRemote(String name) throws RemoteException;
}