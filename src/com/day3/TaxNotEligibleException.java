package com.day3;

public class TaxNotEligibleException extends Exception{
	@Override
	public String getMessage()
	{
		return "you are not Eligible for tax";
	}

}

