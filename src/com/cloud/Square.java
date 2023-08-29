package com.cloud;

public class Square extends Shape{
	@Override
	public void acceptDetails()
	{
		super.acceptDetails();
		System.out.println("Accepting details for Square");
	}

	@Override
	public void calculateArea() {
		System.out.println("Calculating area for Square");
		
	}
	public static void main(String[] args) {
		Shape s=null;
		System.out.println("Details for Rectangle");
		s=new Rectangle();
		s.acceptDetails();
		s.calculateArea();
		System.out.println("Details for Square");
		s=new Square();
		s.acceptDetails();
		s.calculateArea();
		
		
	}
	

}
