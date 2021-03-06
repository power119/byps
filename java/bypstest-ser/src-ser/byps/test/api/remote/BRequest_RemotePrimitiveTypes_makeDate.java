package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_RemotePrimitiveTypes_makeDate extends BMethodRequest implements Serializable {

	public int year;
	public int month;
	public int day;
	public int hour;
	public int minute;
	public int second;
	public int millisecond;
	
	public final static long serialVersionUID = 1918934973L;
	
	public int getRemoteId() { return 1178916877; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemotePrimitiveTypesAsync __byps__remoteT = (RemotePrimitiveTypesAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.Date> __byps__outerResult = new BAsyncResultSendMethod<java.util.Date>(__byps__asyncResult, new byps.test.api.BResult_17());			
			__byps__remoteT.makeDate(year, month, day, hour, minute, second, millisecond, __byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemotePrimitiveTypes.makeDate(");
		s.append(year);
		s.append(",").append(month);
		s.append(",").append(day);
		s.append(",").append(hour);
		s.append(",").append(minute);
		s.append(",").append(second);
		s.append(",").append(millisecond);
		s.append(")]");
		return s.toString();
	}
	
}
