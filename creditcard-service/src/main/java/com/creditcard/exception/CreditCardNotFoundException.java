package com.creditcard.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CreditCardNotFoundException extends RuntimeException {


	private static final long serialVersionUID = -8322943359320444824L;

	public CreditCardNotFoundException(String message) {
		super(message);
	}

}
