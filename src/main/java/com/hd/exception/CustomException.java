package com.hd.exception;

public class CustomException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CustomException(String message) {
		this.message = message;
	}
	
	
	
}
