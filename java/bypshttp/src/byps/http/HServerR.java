package byps.http;
/* USE THIS FILE ACCORDING TO THE COPYRIGHT RULES IN LICENSE.TXT WHICH IS PART OF THE SOURCE CODE PACKAGE */
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import byps.BAsyncResult;
import byps.BException;
import byps.BExceptionC;
import byps.BMessage;
import byps.BMessageHeader;
import byps.BOutput;
import byps.BServer;
import byps.BServerR;
import byps.BTransport;

/**
 * LongPoll-Nachricht:
 * 
 */
public class HServerR extends BServerR {

  public HServerR(BTransport transport, BServer server, int nbOfConns) {
    super(transport, server);
    this.nbOfConns = nbOfConns;
    this.sleepMillisBeforeRetry = 30 * 1000;
  }

  @Override
  public void start() throws BException {
    if (log.isDebugEnabled()) log.debug("start(");
    synchronized (refDone) {
      refDone[0] = false;
    }
    for (int i = 0; i < nbOfConns; i++) {
      sendLongPoll(null);
    }
    if (log.isDebugEnabled()) log.debug(")start");
  }

  @Override
  public void done() {
    if (log.isDebugEnabled()) log.debug("done(");

    synchronized (refDone) {
      refDone[0] = true;
      refDone.notifyAll();
    }

    // Wird von HWireClient.done() aufgerufen.
    // Dort werden die Long-Polls vom Server beendet.

    // workerThread.interrupt();
    //
    // try {
    // workerThread.join(1000);
    // }
    // catch (InterruptedException ignored) {}

    if (log.isDebugEnabled()) log.debug(")done");
  }

  protected class LongPoll implements Runnable {

    protected BMessage methodResult;

    protected LongPoll(BMessage methodResult) throws BException {
      if (log.isDebugEnabled()) log.debug("LongPoll(" + methodResult);
      if (methodResult != null) {
        this.methodResult = methodResult;
      }
      else {
        BOutput outp = transport.getOutput();
        outp.header.flags |= BMessageHeader.FLAG_RESPONSE;
        outp.store(null); // irgendwas, damit auch der Header in den ByteBuffer
                          // geschrieben wird.
        this.methodResult = outp.toMessage();
      }
      if (log.isDebugEnabled()) log.debug(")LongPoll");
    }

    public void run() {
      if (log.isDebugEnabled()) log.debug("run(");

      final BAsyncResult<BMessage> asyncResult = new BAsyncResult<BMessage>() {

        @Override
        public void setAsyncResult(BMessage msg, Throwable e) {
          if (log.isDebugEnabled()) log.debug("setAsyncResult(" + msg);
          try {
            if (e != null) {
              BOutput out = transport.getOutput();
              out.header.flags = BMessageHeader.FLAG_RESPONSE;
              out.setException(e);
              msg = out.toMessage();
            }
            sendLongPoll(msg);
          } catch (BException e1) {
            if (log.isErrorEnabled()) log.error("Failed to send longpoll for obj=" + msg, e1);
          }
          if (log.isDebugEnabled()) log.debug(")setAsyncResult");
        }

      };

      BAsyncResult<BMessage> nextAsyncMethod = new BAsyncResult<BMessage>() {

        @Override
        public void setAsyncResult(BMessage msg, Throwable e) {
          if (log.isDebugEnabled()) log.debug("asyncMethod.setAsyncResult(" + msg + ", e=" + e);
          try {
            
            if (e == null) {
              // Execute the method received from server.
              transport.recv(server, msg, asyncResult);
            }
            else {
              BException ex = (BException) e;
              switch (ex.code) {

              case BExceptionC.SESSION_CLOSED: // Session was invalidated.
              case BExceptionC.UNAUTHORIZED: // Re-login required
              case BExceptionC.CANCELLED:
                // no retry
                break;
                
              case BExceptionC.RESEND_LONG_POLL:
                // HWireClientR has released the expried long-poll.
                // Ignore the error and send a new long-poll.
                asyncResult.setAsyncResult(null, null);
                break;
                
              default:
                onLostConnection(ex);
                break;
              }
            }
            
          } catch (Throwable ex) {
            // transport.recv failed
            if (log.isDebugEnabled()) log.debug("recv failed.", e);
            asyncResult.setAsyncResult(null, ex);
          }
          if (log.isDebugEnabled()) log.debug(")asyncMethod.setAsyncResult");
        }

        private void onLostConnection(BException ex) {
          boolean callLostConnectionHandler = false;
          
          synchronized (refDone) {
            // Server still running?
            if (!refDone[0]) {
              try {
                if (lostConnectionHandler != null) {
                  callLostConnectionHandler = true;
                }
                else {
                  // Wait some seconds before next retry
                  refDone.wait(sleepMillisBeforeRetry);
                }
                
              } catch (InterruptedException e1) {
              }
            }
          }
          
          if (callLostConnectionHandler) {
            lostConnectionHandler.onLostConnection(ex);
          }
          else {
            asyncResult.setAsyncResult(null, null);
          }
          
        }
        
      };

      // Sende den longPoll-Request
      // Im Body befindet sich die Antwort auf die vorige vom Server gestellte
      // Anfrage.
      // Als Ergebnis des longPoll kommt eine neue Serveranfrage (Methode).

      transport.getWire().sendR(methodResult, nextAsyncMethod);

      if (log.isDebugEnabled()) log.debug(")run");
    }

  }

  protected void sendLongPoll(BMessage obj) throws BException {
    if (log.isDebugEnabled()) log.debug("sendLongPollInWorkerThread(" + obj);
    synchronized (refDone) {
      if (!refDone[0]) {
        LongPoll lp = new LongPoll(obj);
        lp.run();
      }
    }
    // synchronized(this) {
    // if (log.isDebugEnabled()) log.debug("execute in worker thread");
    // currentLongPoll_access_sync = lp;
    // this.notifyAll();
    // }
    if (log.isDebugEnabled()) log.debug(")sendLongPollInWorkerThread");
  }

  // protected class WorkerThread extends Thread {
  // WorkerThread() {
  // setName("longpoll-" + c_longPollCounter.incrementAndGet());
  // }
  //
  // public void run() {
  // if (log.isDebugEnabled()) log.debug("LongPoll.run(");
  // try {
  // while (!isInterrupted()) {
  // LongPoll lp = null;
  // synchronized(HServerR.this) {
  // while (currentLongPoll_access_sync == null) {
  // if (log.isDebugEnabled()) log.debug("wait for LongPoll");
  // HServerR.this.wait();
  // }
  // lp = currentLongPoll_access_sync;
  // currentLongPoll_access_sync = null;
  // }
  //
  // try {
  // if (log.isDebugEnabled()) log.debug("execute LongPoll");
  // lp.run();
  // }
  // catch (Throwable e) {
  // log.error("LongPoll worker thread received uncaught exception.", e);
  // }
  // }
  // if (log.isDebugEnabled()) log.debug("Worker interrupted");
  // }
  // catch (InterruptedException e) {
  // if (log.isDebugEnabled()) log.debug("Recevied "+ e);
  // }
  // if (log.isDebugEnabled()) log.debug(")LongPoll.run");
  // }
  // }

  protected int nbOfConns;
  protected boolean[] refDone = new boolean[1];
  protected final long sleepMillisBeforeRetry;
  // protected final Thread workerThread = new WorkerThread();
  // protected LongPoll currentLongPoll_access_sync;
  private final static Log log = LogFactory.getLog(HServerR.class);
}
