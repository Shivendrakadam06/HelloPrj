package com.cloud;

public class PermanentEployee extends Employee {
	private double salary;
	
	@Override
	public void accept() {
		super.accept();
		System.out.println("Enter employee salary");
		salary=sc.nextDouble();
		
	}
	@Override
	public void display() {
		super.display();
		System.out.println(" employee salary"+salary);
		
	}
	
	public static void main(String[] args) {
		System.out.println(" employee details");
		Employee emp= new Employee();
		emp.accept();
		emp.display();
		PermanentEployee pemp = new PermanentEployee();
		pemp.accept();
		pemp.display();
		
	}

}
