package com.jpassion.tdd;

public class StringConcatenator {

	public String concatenate(String string1, String string2) {
		
		validateArguments(string1, string2);
		return string1.concat(string2);
	}

	protected void validateArguments(String string1, String string2) {
		if(string1.length() <2 || string2.length() <2)
			throw new StringTooShortException("Too short string:  " + string1 + " " + string2);
	}

}
