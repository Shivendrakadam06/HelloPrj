package com.cloud;

public class Rectangle extends Shape {
	@Override
	public void acceptDetails()
	{
		super.acceptDetails();
		System.out.println("Accepting details for Rectangle also");
	}

	@Override
	public void calculateArea() {
		System.out.println("Calculating Area for Rectangle.");
		
	}
	

}
