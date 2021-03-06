package byps.test.api.remote;

import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

import byps.BRemote;
import byps.RemoteException;

public interface RemoteStreams extends BRemote {

	public InputStream getImage() throws RemoteException;
	
	public void setImage(InputStream istrm) throws RemoteException;
	
	public TreeMap<Integer, InputStream> getImages() throws RemoteException;
	
	public void setImages(Map<Integer, InputStream> istrms, int doNotReadStreamAtKey) throws RemoteException;
	
	public void throwLastException() throws RemoteException;
	
	public InputStream getTextStream() throws RemoteException;
	
	/**
	 * Return stream without properties.
	 * The properties must be made explicitly available on the client-side by calling 
	 * BContentStream.ensureProperties()
	 * @return InputStream
	 * @throws RemoteException
	 */
	public InputStream getStreamDeferedProperies() throws RemoteException;
	
	/**
	 * Stores a stream reference but does not create an internal copy (does not materialize)
	 * @param stream
	 * @throws RemoteException
	 */
	public void setStreamDoNotMaterialize(InputStream stream) throws RemoteException;
	
	/**
	 * Return stream, do not call BContentStream.cloneStream().
	 * @throws RemoteException
	 */
	public InputStream getStreamDoNotClone() throws RemoteException;
}
