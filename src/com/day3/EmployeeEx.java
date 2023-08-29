package com.day3;

import java.util.Scanner;

public class EmployeeEx {
private int salary;
private Scanner sc;
 public EmployeeEx() {
	 sc= new Scanner(System.in);
	 
 }


public void accept() {
	System.out.println("enter the salary");
	salary=sc.nextInt();
	if(salary<5000) {
		  throw new ArithmeticException("salary is less then 5000");    
	}
	
	
}
public static void main(String[] args) {
	EmployeeEx ex= new EmployeeEx();
	ex.accept();
}
}