package com.cloud;

public class TempEmployee extends Employee{
	private double contAmount;
	private String contDuration;
	@Override
	public void accept() {
		super.accept();
		System.out.println("Enter employee contract amount");
		contAmount=sc.nextDouble();
		System.out.println("Enter employee contract duration");
		contDuration=sc.next();
		
		
	}
	@Override
	public void display() {
		super.display();
		System.out.println(" employee contract amount"+contAmount);
		System.out.println(" employee contract duration"+contDuration);
		
		
	}

}
