package task.app;

/*
 * Serializer for task.app.BRequest_TaskService_getTasks
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=0

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_280075325 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_280075325();
	
	public JSerializer_280075325() {
		super(280075325);
	}
	
	public JSerializer_280075325(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_TaskService_getTasks obj = (BRequest_TaskService_getTasks)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_TaskService_getTasks()));
		
		return obj;
	}
	
}