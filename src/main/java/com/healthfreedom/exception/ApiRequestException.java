package com.healthfreedom.exception;

public class ApiRequestException extends RuntimeException{
	
	public ApiRequestException() {
		super();
	}
	public ApiRequestException(String message) {
		super(message);
	}

	public ApiRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ApiRequestException(String message, Throwable cause) {
		super(message, cause);
	}

	public ApiRequestException(Throwable cause) {
		super(cause);
	}

}
