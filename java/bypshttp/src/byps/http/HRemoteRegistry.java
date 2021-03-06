package byps.http;

/* USE THIS FILE ACCORDING TO THE COPYRIGHT RULES IN LICENSE.TXT WHICH IS PART OF THE SOURCE CODE PACKAGE */
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import byps.BApiDescriptor;
import byps.BAsyncResult;
import byps.BClient;
import byps.BException;
import byps.BExceptionC;
import byps.BHashMap;
import byps.BRemote;
import byps.BServerRegistry;
import byps.BSyncResult;
import byps.BTargetId;
import byps.BTransport;
import byps.BWire;
import byps.RemoteException;

public abstract class HRemoteRegistry implements BServerRegistry {

  /**
   * BClient objects per server. One BClient object is mapped to each server ID.
   */
  private final BHashMap<Integer, BClient> forwardClientMap = new BHashMap<Integer, BClient>();

  private final ExecutorService tpool = Executors
      .newCachedThreadPool(new PoolThreadFactory());
  private final HConfig config;
  private final HTargetIdFactory targetIdFactory;
  private final static Log log = LogFactory.getLog(HRemoteRegistry.class);

  public HRemoteRegistry(HConfig config, HTargetIdFactory targetIdFactory) {
    this.config = config;
    this.targetIdFactory = targetIdFactory;
  }

  @Override
  public ArrayList<BClient> getForwardClientsToOtherServers()
      throws RemoteException {
    ArrayList<BClient> clients = new ArrayList<BClient>();
    Collection<Integer> serverIds = config.getServerIds();
    for (Integer serverId : serverIds) {
      if (serverId == config.getMyServerId()) continue;
      BClient client = getForwardClient(serverId);
      if (client == null) continue; // Failed to connect.
      clients.add(client);
    }
    return clients;
  }

  @Override
  public BClient getForwardClientIfForeignTargetId(BTargetId targetId)
      throws RemoteException {
    if (log.isDebugEnabled()) log.debug("getForwardClientIfForeignTargetId("
        + targetId);

    BClient client = null;
    if (targetId.getServerId() != config.getMyServerId()) {

      client = getForwardClient(targetId.getServerId());
      if (client == null) {
        throw new BException(BExceptionC.INTERNAL,
            "Cannot reach server for targetId=" + targetId
                + ", missing URL or wrong URL for serverId="
                + targetId.getServerId() + ", in configuration.");
      }
      
      // Clone the transport to the other server.
      // The cloned transport has the same connection (BWire) as the
      // server-to-server transport,
      // but it acts for the passed targetId.
      final BTransport forwardTransport = new BForwardTransport(
          client.getTransport(), targetId);

      // Create a client object for the forward transport.
      client = createForwardClientToOtherServer(forwardTransport);
      
    }
    if (log.isDebugEnabled()) log.debug(")getForwardClientIfForeignTargetId="
        + client);
    return client;
  }

  public void done() {
    tpool.shutdown();
  }

  protected BClient getForwardClient(int serverId) throws RemoteException {
    BClient client = forwardClientMap.get(serverId);

    if (client != null) {

      // Is valid? (see catch block below)

      long invalidUntil = client.getTransport().getWire()
          .getInvalidUntilMillis();
      if (invalidUntil == 0) {
        return client;
      }
      else if (invalidUntil > System.currentTimeMillis()) {
        return null;
      }
      else {
        // retry to connect connect
      }

    }

    String url = config.getServerUrl(serverId);
    if (url == null || url.length() == 0) {
      return null;
    }
    if (log.isDebugEnabled()) log.debug("createForwardClientToOtherServer...");

    try {
      if (log.isInfoEnabled()) log.info("Connect to other server=[serverId="
          + serverId + ", url=" + url + "]");

      // Create BClient object for other server
      BWire wire = new HWireClient(url, 0, 120, tpool);
      BTransport transport = new BTransport(getApiDescriptor(), wire, null);
      client = createForwardClientToOtherServer(transport);

      // Connect to server
      BSyncResult<Boolean> syncResult = new BSyncResult<Boolean>();
      client.start(syncResult);
      syncResult.getResult();

      // OK
      if (log.isDebugEnabled()) log
          .debug("createForwardClientToOtherServer OK, client=" + client);
    }
    catch (final RemoteException e) {
      if (log.isInfoEnabled()) log.info(
          "Failed to connect to other server=[serverId=" + serverId + ", url="
              + url + "], ", e);

      // Create a dummy BWire object that is invalid for the next 60 seconds.
      final long invalidUntil = System.currentTimeMillis()
          + HConstants.CONNECTION_RETRY_PAUSE;
      BWire wire = new BWire(BWire.FLAG_DEFAULT) {
        @Override
        public long getInvalidUntilMillis() {
          return invalidUntil;
        }
      };

      BTransport transport = new BTransport(getApiDescriptor(), wire, null);
      client = createForwardClientToOtherServer(transport);
    }

    forwardClientMap.put(serverId, client);

    return client;
  }

  /**
   * This BTransport is used when a client request has to be forwarded to another server.
   * The sessionId of the server-to-server transport object is to be used. 
   * If it is expired, the re-login is performed over the server-to-server transport object,
   * in order to receive the new sessionId there.  
   */
  private static class BForwardTransport extends BTransport {

    private final BTransport serverToServerTransport;

    public BForwardTransport(BTransport serverToServerTransport,
        BTargetId targetId) {
      super(serverToServerTransport, targetId);
      this.serverToServerTransport = serverToServerTransport;
    }

    @Override
    public void negotiateProtocolClient(final BAsyncResult<Boolean> asyncResult) {
      
      BAsyncResult<Boolean> outerResult = new BAsyncResult<Boolean>() {
        @Override
        public void setAsyncResult(Boolean result, Throwable exception) {
          BForwardTransport.this.setSessionId(serverToServerTransport
              .getSessionId());
          asyncResult.setAsyncResult(result, exception);
        }
      };
      
      serverToServerTransport.negotiateProtocolClient(outerResult);
    }

  }

  @Override
  public BRemote getRemote(BTargetId targetId, int remoteId)
      throws RemoteException {
    if (log.isDebugEnabled()) log.debug("getRemote(targetId=" + targetId
        + ", remoteId=" + remoteId);
    BRemote remote = null;

    // Is targetId generated by me?
    int serverId = targetId.getServerId();
    if (log.isDebugEnabled()) log.debug("serverId=" + serverId);
    if (serverId != config.getMyServerId()) {

      if (log.isDebugEnabled()) log.debug("it is a serverId of another server");

      // Get/create a connection from this server to the other server
      final BClient forwardClient = getForwardClientIfForeignTargetId(targetId);

      // Return the requested BRemote interface
      remote = forwardClient.getStub(remoteId);
    }
    else {
      if (log.isDebugEnabled()) log.debug("it is my serverId");

      // Get client session
      HSession sess = HSession.getSession(targetId);
      if (sess == null) {
        throw new BException(BExceptionC.CLIENT_DIED,
            "Client is not connected, targetId=" + targetId);
      }

      remote = sess.getClientR().getStub(remoteId);
    }
    if (log.isDebugEnabled()) log.debug(")getRemote=" + remote);
    return remote;
  }

  public BTargetId encryptTargetId(BTargetId targetId, boolean encryptNotDecrypt)
      throws RemoteException {
    return targetIdFactory.encryptTargetId(targetId, encryptNotDecrypt);
  }

  private static AtomicInteger threadId = new AtomicInteger();

  private static class PoolThread extends Thread {
    PoolThread(Runnable r) {
      super(r, "rcli-" + (threadId.incrementAndGet()));
    }
  }

  private static class PoolThreadFactory implements ThreadFactory {
    public Thread newThread(Runnable r) {
      Thread t = new PoolThread(r);
      return t;
    }
  }

  protected abstract BClient createForwardClientToOtherServer(
      BTransport transport) throws BException;

  protected abstract BApiDescriptor getApiDescriptor();
}
