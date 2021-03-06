package byps;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* USE THIS FILE ACCORDING TO THE COPYRIGHT RULES IN LICENSE.TXT WHICH IS PART OF THE SOURCE CODE PACKAGE */

/**
 * This class identifies a client or a stream. Target IDs are generated during
 * protocol negotiation. They are internally used in the generated code an in
 * the communication layer.
 */
public class BTargetId {

  /**
   * Server ID
   */
  private final int serverId;

  private final int remoteId;

  /**
   * First ID value. If used for a stream, this value is the message ID.
   */
  private final long v1;

  /**
   * Second ID value. If used for a stream, this value is the stream ID.
   */
  private final long v2;

  private final long signature;

  /**
   * Constant object to be used instead of a null reference.
   */
  public final static BTargetId ZERO = new BTargetId(0, 0, 0);
  public static final String SESSIONID_ZERO = ZERO.toSessionId();

  /**
   * Constructor.
   * 
   * @param v1
   *          If used for a stream, this value is the message ID.
   * @param v2
   *          If used for a stream, this value is the stream ID.
   */
  public BTargetId(int serverId, long v1, long v2) {
    this.serverId = serverId;
    this.remoteId = 0;
    this.v1 = v1;
    this.v2 = v2;
    this.signature = 0;
  }

  public BTargetId(int serverId, int remoteId, long v1, long v2, long v3) {
    this.serverId = serverId;
    this.remoteId = remoteId;
    this.v1 = v1;
    this.v2 = v2;
    this.signature = v3;
  }

  public BTargetId(BTargetId rhs, long signature) {
    this.serverId = rhs.serverId;
    this.remoteId = rhs.remoteId;
    this.v1 = rhs.v1;
    this.v2 = rhs.v2;
    this.signature = signature;
  }

  /**
   * Returns true, if the ID is zero.
   * 
   * @return true, if the ID is zero.
   */
  public boolean isZero() {
    return serverId == 0 && v1 == 0 && v2 == 0;
  }

  public boolean isEncrypted() {
    return signature != 0;
  }

  /**
   * Copy a target ID and constrain access to an interface.
   * 
   * @param remoteId
   *          Interface ID
   * @return BTargetId object
   */
  public BTargetId bindCopyToRemote(int remoteId) {
    return new BTargetId(serverId, remoteId, v1, v2, 0);
  }

  /**
   * Serialize the object into a buffer.
   * 
   * @param buf
   *          Destination buffer.
   */
  public void write(ByteBuffer buf, int bversion) {
    buf.putInt(serverId);
    buf.putLong(v1);
    buf.putLong(v2);
    if (bversion >= BMessageHeader.BYPS_VERSION_ENCRYPTED_TARGETID) {
      buf.putInt(remoteId);
      buf.putLong(signature);
    }
  }

  /**
   * Deserialize a target ID from a buffer.
   * 
   * @param buf
   *          Source buffer
   * @return target ID
   */
  public static BTargetId read(ByteBuffer buf, int bversion) {
    int serverId = buf.getInt();
    long v1 = buf.getLong();
    long v2 = buf.getLong();
    int remoteId = 0;
    long v3 = 0;
    if (bversion >= BMessageHeader.BYPS_VERSION_ENCRYPTED_TARGETID) {
      remoteId = buf.getInt();
      v3 = buf.getLong();
    }
    return new BTargetId(serverId, remoteId, v1, v2, v3);
  }

  /**
   * Print the target ID into a String.
   * 
   * @return target ID as String.
   */
  @Override
  public String toString() {
    StringBuilder sbuf = new StringBuilder();
    sbuf.append("[").append(serverId).append('.').append(v1).append('.').append(v2).append('.');
    if (remoteId != 0) {
      sbuf.append(remoteId).append('.').append(signature).append('.');
    }
    sbuf.append("]");
    return sbuf.toString();
  }
  
  public String makeSerializeString(int bversion) {
    if (isZero())
      return "";
    StringBuilder builder = new StringBuilder();
    builder.append(serverId).append(".");
    builder.append(v1).append(".");
    builder.append(v2);
    if (bversion >= BMessageHeader.BYPS_VERSION_ENCRYPTED_TARGETID) {
      builder.append(".");
      builder.append(remoteId).append(".");
      builder.append(signature);
    }
    return builder.toString();
  }

  /**
   * Create a target ID from String.
   * 
   * @param s
   *          String representation
   * @return target ID
   */
  public static BTargetId parseString(String s) {
    int serverId = 0, remoteId = 0;

    long v1 = 0, v2 = 0, v3 = 0;
    if (s != null && s.length() != 0) {
      int p = 0;
      int e = s.indexOf('.', p);
      if (e < 0)
        e = s.length();
      serverId = Integer.parseInt(s.substring(p, e));

      p = e + 1;
      if (p < s.length()) {
        e = s.indexOf('.', p);
        if (e < 0)
          e = s.length();
        v1 = Long.parseLong(s.substring(p, e));

        p = e + 1;
        if (p < s.length()) {
          e = s.indexOf('.', p);
          if (e < 0)
            e = s.length();
          v2 = Long.parseLong(s.substring(p, e));

          p = e + 1;
          if (p < s.length()) {
            e = s.indexOf('.', p);
            if (e < 0)
              e = s.length();
            remoteId = Integer.parseInt(s.substring(p, e));

            p = e + 1;
            if (p < s.length()) {
              e = s.indexOf('.', p);
              if (e < 0)
                e = s.length();
              v3 = Long.parseLong(s.substring(p, e));

            }
          }
        }
      }
    }

    return new BTargetId(serverId, remoteId, v1, v2, v3);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + serverId;
    result = prime * result + (int) (v1 ^ (v1 >>> 32));
    result = prime * result + (int) (v2 ^ (v2 >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    BTargetId other = (BTargetId) obj;
    if (serverId != other.serverId)
      return false;
    if (v1 != other.v1)
      return false;
    if (v2 != other.v2)
      return false;
    return true;
  }

  public int getServerId() {
    return serverId;
  }

  public int getRemoteId() {
    return remoteId;
  }

  public long getMessageId() {
    return v1;
  }

  public long getStreamId() {
    return v2;
  }

  public long getSignature() {
    return signature;
  }
  
  public String toSessionId() {
    return toSessionId(v1, v2);
  }
  
  private static String toSessionId(long v1, long v2) {
    StringBuilder sbuf = new StringBuilder();
    String s1 = Long.toHexString(v1);
    int d = s1.length();
    while (d++ < 16) sbuf.append('0'); 
    sbuf.append(s1);
    s1 = Long.toHexString(v2);
    d = s1.length();
    while (d++ < 16) sbuf.append('0');
    sbuf.append(s1);
    return sbuf.toString();
  }
  
  private static long parseHexLong(String s16) {
    long v = Long.parseLong(s16.substring(2), 16);
    long u = Integer.parseInt(s16.substring(0,2), 16);
    long r = (u << 56L) | v;
    return r;
  }
  
//  private static int charToNibble(char c) {
//    if (c >= '0' && c <= '9') return (c - '0') & 0xF; 
//    if (c >= 'A' && c <= 'F') return ((c - 'A') & 0xF) + 0xA;
//    if (c >= 'a' && c <= 'f') return ((c - 'a') & 0xF) + 0xA;
//    throw new IllegalStateException("Invalid character " + c + " cannot be converted to byte.");
//  }
//  
//  private static char nibbleToChar(int b) {
//    if (b >= 0 && b <= 9) return (char)('0' + b);
//    if (b >= 10 && b <= 15) return (char)('A' + (b - 10));
//    throw new IllegalStateException("Invalid byte " + b + " cannot be converted to character.");
//  }
//  
//  private static int charsToByte(char h, char l) {
//    int hb = charToNibble(h);
//    int lb = charToNibble(l);
//    int r = ((hb << 4) | lb) & 0xFF;
//    return r;
//  }
  
  public static void writeSessionId(ByteBuffer buf, String sessionId) {
    if (sessionId != null && sessionId.length() == 32) {
      long v1 = parseHexLong(sessionId.substring(0, 16));
      long v2 = parseHexLong(sessionId.substring(16, 32));
      ByteOrder bo = buf.order();
      buf.order(ByteOrder.BIG_ENDIAN);
      buf.putLong(v1);
      buf.putLong(v2);
      buf.order(bo);
    }
    else {
      buf.putLong(0);
      buf.putLong(0);
    }
  }
  
  public static String readSessionId(ByteBuffer buf) {
    ByteOrder bo = buf.order();
    buf.order(ByteOrder.BIG_ENDIAN);
    long v1 = buf.getLong();
    long v2 = buf.getLong();
    buf.order(bo);
    return toSessionId(v1, v2);
  }

  // /**
  // * Serialize the object into a buffer.
  // * @param buf Destination buffer.
  // */
  // public void write(BBuffer buf) {
  // buf.putInt(serverId);
  // buf.putLong(v1);
  // buf.putLong(v2);
  // }
  //
  // /**
  // * Deserialize a target ID from a buffer.
  // * @param buf Source buffer
  // * @return target ID
  // */
  // public static BTargetId read(BBuffer buf) {
  // int serverId = buf.getInt();
  // long v1 = buf.getLong();
  // long v2 = buf.getLong();
  // return new BTargetId(serverId,v1,v2);
  // }
}
