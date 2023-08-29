package com.day3;

public class EmployeeNameInvalidException extends Exception{
	@Override
	public String getMessage()
	{
		return "The employee name cannot be empty";
	}

}
