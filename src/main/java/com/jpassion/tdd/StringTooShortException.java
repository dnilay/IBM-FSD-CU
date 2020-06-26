package com.jpassion.tdd;

public class StringTooShortException extends RuntimeException {

	public StringTooShortException(String message){
		super(message);
	}
}
