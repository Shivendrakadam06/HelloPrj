package com.day3;

public class DoesNotContainVowelException extends Exception{
	@Override
	public String getMessage()
	{
		return "does not contain any vowel";
	}
	

}