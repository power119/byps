package task.app;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_TaskService_getTasks extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 280075325L;
	
	public int getRemoteId() { return 216769899; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final TaskServiceAsync __byps__remoteT = (TaskServiceAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.List<TaskInfo>> __byps__outerResult = new BAsyncResultSendMethod<java.util.List<TaskInfo>>(__byps__asyncResult, new BResult_1182472339());			
			__byps__remoteT.getTasks(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[TaskService.getTasks(");
		s.append(")]");
		return s.toString();
	}
	
}