package byps;

/* USE THIS FILE ACCORDING TO THE COPYRIGHT RULES IN LICENSE.TXT WHICH IS PART OF THE SOURCE CODE PACKAGE */

import java.nio.ByteBuffer;

import byps.BException;

public class BProtocolJson extends BProtocol {
	
	public static final BBinaryModel BINARY_MODEL = BBinaryModel.JSON;

	public BProtocolJson(BApiDescriptor apiDesc) {
		super(apiDesc, BMessageHeader.BYPS_VERSION_CURRENT, apiDesc.version, null);
	}

	public BOutput getOutput(BTransport transport, BMessageHeader responseHeader) throws BException {
		if (responseHeader != null) {
			return new BOutputJson(transport, responseHeader);
		}
		else {
			return new BOutputJson(transport);
		}
	}

	public BInput getInput(BTransport transport, BMessageHeader header, ByteBuffer buf) throws BException {
		return new BInputJson(header, buf, transport);
	}

	public BRegistry getRegistry() {
	  return apiDesc.getRegistry(BINARY_MODEL);
	}
}
