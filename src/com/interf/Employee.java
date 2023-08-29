package com.interf;

public class Employee implements PersonalDetails ,PaymentDetails{
	@Override
	public void acceptDetails() {
		System.out.println("Accepting details of employee");	
		
	}

	@Override
	public void acceptEducationDetails() {
		System.out.println("Accepting education details employee");	
		
	}

	@Override
	public void acceptBusinessDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bankDetails() {
		System.out.println("Accepting bankdetails");	
		
	}
}
