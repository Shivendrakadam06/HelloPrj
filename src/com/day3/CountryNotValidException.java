package com.day3;

public class CountryNotValidException extends Exception{
	@Override
	public String getMessage()
	{
		return "The employee should be an Indian citizen for calculating tax";
	}

}
