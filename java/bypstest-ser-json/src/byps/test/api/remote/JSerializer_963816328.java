package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BStub_RemoteArrayTypes1dim
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class JSerializer_963816328 extends JSerializer_16 {
	
	public final static BSerializer instance = new JSerializer_963816328();
	
	public JSerializer_963816328() {
		super(963816328);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_RemoteArrayTypes1dim(transport);
	}
	
}
