package byps.test.api.srvr;

/*
 * Serializer for byps.test.api.srvr.BStub_ServerIF
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class JSerializer_1775199834 extends JSerializer_16 {
	
	public final static BSerializer instance = new JSerializer_1775199834();
	
	public JSerializer_1775199834() {
		super(1775199834);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_ServerIF(transport);
	}
	
}
