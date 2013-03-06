package com.wilutions.byps;

public abstract class JSerializer_Array extends BSerializer {

	protected JSerializer_Array(int typeId) {
		super(typeId);
	}

	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputJson bin = ((BInputJson)bin1);
		Object obj = internalRead(bin);
		return obj;
	}	
	
	@Override
	public void write(Object obj1, BOutput bout1, int version) throws BException {
		final BOutputJson bout = (BOutputJson)bout1;
		final BBufferJson bbuf = (BBufferJson)bout.bbuf;
		internalWrite(obj1, bout, bbuf);
	}
	
	protected abstract void internalWrite(Object obj1, final BOutputJson bout, BBufferJson bbuf) throws BException;
	protected abstract Object internalRead(final BInputJson bin) throws BException;
	
}
