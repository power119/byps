package byps.test.api.inherit;

/*
 * Serializer for byps.test.api.inherit.BStub_LemonService
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class BSerializer_605543968 extends BSerializer_16 {
	
	public final static BSerializer instance = new BSerializer_605543968();
	
	public BSerializer_605543968() {
		super(605543968);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_LemonService(transport);
	}
	
}
