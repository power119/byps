package byps;
/* USE THIS FILE ACCORDING TO THE COPYRIGHT RULES IN LICENSE.TXT WHICH IS PART OF THE SOURCE CODE PACKAGE */
import java.util.ArrayList;
import java.util.Collection;

import byps.BException;
import byps.BInput;
import byps.BInputBin;
import byps.BOutput;
import byps.BOutputBin;
import byps.BRegistry;
import byps.BSerializer;

public class BSerializer_12 extends BSerializer {

	public final static BSerializer instance = new BSerializer_12();
	
	public BSerializer_12() {
		super(BRegistry.TYPEID_LIST);
	}

	protected BSerializer_12(int typeId) {
		super(typeId);
	}

	
	protected Collection<Object> internalCreate(final BInput bin1) throws BException {
		return new ArrayList<Object>();
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		BInputBin bin = ((BInputBin)bin1);
		
		// lengths
		final int n0 = bin.bbuf.getLength();

		// create list
		final Collection<Object> arr = internalCreate(bin1);
		bin.onObjectCreated(arr);
		
		// read
		for (int i = 0; i < n0; i++) {
			final Object obj = bin.readObj(false, null);
			arr.add(obj);
		}
		
		return arr;
	}

	
	@SuppressWarnings("rawtypes")
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BOutputBin bout = ((BOutputBin)bout1);
		final Collection arr = (Collection) obj1;

		// lengths
		final int n0 = arr.size();
		bout.bbuf.putLength(n0);

		// write
		for (final Object obj : arr) {
			bout.writeObj(obj, false, null);
		}

	}

}
