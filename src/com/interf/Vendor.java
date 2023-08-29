package com.interf;

public class Vendor implements PersonalDetails ,PaymentDetails{

	@Override
	public void acceptDetails() {
System.out.println("Accepting details of vendor");		
	}

	@Override
	public void acceptEducationDetails() {
System.out.println("Accepting education details vendor");		
	}

	@Override
	public void acceptBusinessDetails() {
		System.out.println("Accepting business details vendor");
		
	}

	@Override
	public void bankDetails() {
		System.out.println("Accepting bankdetails vendor");
		
	}

}
