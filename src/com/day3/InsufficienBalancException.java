package com.day3;

public class InsufficienBalancException extends Exception{
	@Override
	public String getMessage()
	{
		return "you have Insufficien Balance";
	}
	

}
