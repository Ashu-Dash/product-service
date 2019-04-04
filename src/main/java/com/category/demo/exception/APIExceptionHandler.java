package com.category.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.category.demo.dtos.ErrorDTO;

@ControllerAdvice
public class APIExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDTO> customExceptionHandler(Exception e) {
		String message = e.getMessage();
		if (message == null) {
			message = "Internal Server Error";
		}

		return new ResponseEntity<ErrorDTO>(new ErrorDTO(message), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(APIException.class)
	public ResponseEntity<ErrorDTO> apiExceptionhandler(APIException e) {
		return new ResponseEntity<ErrorDTO>(new ErrorDTO(e.getMessage()), e.getStatus());
	}
}
