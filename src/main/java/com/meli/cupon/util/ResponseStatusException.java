package com.meli.cupon.util;

import org.springframework.http.HttpStatus;

public class ResponseStatusException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ResponseStatusException(HttpStatus status) {
		super("hay un problema " + status);
	}
}
