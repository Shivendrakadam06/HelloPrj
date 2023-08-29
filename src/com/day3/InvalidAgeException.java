package com.day3;

public class InvalidAgeException extends Exception{
	@Override
	public String getMessage()
	{
		return "Trying to Enter Invalid Age";
	}
	

}