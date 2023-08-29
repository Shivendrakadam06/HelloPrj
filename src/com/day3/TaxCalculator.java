package com.day3;

import java.util.Scanner;

public class TaxCalculator {
	private String empName;
	private boolean isIndian;
	private double empSal;
	private Scanner sc ;
	
	public TaxCalculator() {
		sc= new Scanner(System.in);
	}
	
	
		public double calculateTax() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException{
		double taxAmount = 0;
		System.out.println("enter the name of employee");
		empName=sc.next();
		System.out.println("enter nationality if indian write true else write false");
		isIndian=sc.nextBoolean();
		System.out.println("enter the salary of employee");
		empSal=sc.nextInt();
		if(isIndian==false) {
			throw new CountryNotValidException();
		}
		if(empName==null) {
			throw new EmployeeNameInvalidException();
		}
		if(empSal>100000 && isIndian==true ) {
			taxAmount =empSal *8/100 ;
		}else if(empSal>50000 && empSal<100000 && isIndian==true) {
			taxAmount =empSal *6/100 ;
		}else if(empSal>30000 && empSal<50000 && isIndian==true) {
			taxAmount =empSal *5/100 ;
		}else if(empSal>10000 && empSal<30000 && isIndian==true) {
			taxAmount =empSal *4/100 ;
		}
		else {
			throw new TaxNotEligibleException();
		}
		System.out.println(taxAmount);
		return taxAmount;
		
	}
	
	
	

}
