package com.wilutions.byps.http;

import java.net.HttpURLConnection;

import com.wilutions.byps.BException;

public class HException extends BException {

	private static final long serialVersionUID = 1L;
	
	private int statusCode;

	public HException(int httpStatusCode) {
		super(BException.IOERROR, "HTTP " + httpStatusCode, "");
		statusCode = httpStatusCode;
	}
	
	public boolean isTimeout() {
		return statusCode == HttpURLConnection.HTTP_CLIENT_TIMEOUT;
	}
	
	public static boolean isTimeout(Throwable e) {
		if (e instanceof HException) {
			return ((HException)e).isTimeout();
		}
		return false;
	}
}