package byps.test.api.remote;

import byps.BRemote;
import byps.RemoteException;
import byps.test.api.auth.SessionInfo;

/**
 * This interface is an example for using the authentication mechanism.
 * @BSessionParamType byps.test.api.auth.SessionInfo
 */
public interface RemoteWithAuthentication extends BRemote {

  /**
   * Set authentication flag in MySession.
   * @param useAuth
   * @throws RemoteException
   */
  public void setUseAuthentication(boolean useAuth) throws RemoteException;
  
  /**
   * Login.
   * Only user "Fritz" is allowed to login. 
   * @param sess Session information, always null in this scenario.
   * @param userName 
   * @param userPwd
   * @return Session object
   * @throws RemoteException
   */
  public SessionInfo login(SessionInfo sess, String userName, String userPwd) throws RemoteException;
  
  /**
   * Do something.
   * @param sess Session information. Must not be null, if user was logged in.
   * @param value
   * @return value+1
   * @throws RemoteException
   */
  public int doit(SessionInfo sess, int value) throws RemoteException;
  
  /**
   * Logout
   * @param sess
   * @throws RemoteException
   */
  public void expire(SessionInfo sess) throws RemoteException;
  
  /**
   * Set the number of login calls nessesary to login the user.
   * This function is used to check that parameter reloginCount in BAuthentication.isReloginException is supplied correctly.
   * @param count
   * @throws RemoteException
   */
  public void setReloginCount(int count) throws RemoteException;
  
}
