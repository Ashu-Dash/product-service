package com.category.demo.exception;

import org.springframework.http.HttpStatus;

public class APIException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message;
	private HttpStatus status;

	public APIException(String message, HttpStatus status) {
		this.message = message;
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public HttpStatus getStatus() {
		return status;
	}

}
