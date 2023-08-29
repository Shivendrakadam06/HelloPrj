package com.day5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EmployeeMain {
	private Set<Employee> eset;
	private Scanner sc;
	
public EmployeeMain() {
	eset = new HashSet<Employee>();
	sc= new Scanner(System.in);
}

public void insertDemo()
{
	System.out.println("Enter numbe of records u want to insert");
	int noofrecords=sc.nextInt();
	for(int x=1;x<=noofrecords;x++)
	{
		Employee emp= new Employee();
		System.out.println("Enter Employee id");
		emp.setEmpId(sc.nextInt());
		System.out.println("enter employee name");
		emp.setEmpName(sc.next());
		System.out.println("enter emp salary");
		emp.setEmpSalary(sc.nextDouble());
		eset.add(emp);
		
	}
}
public void display()
{
	for(Employee e:eset)
	{
		System.out.println("Employee id "+e.getEmpId());
		System.out.println("Employee name "+e.getEmpName());
		System.out.println("Employee salary "+e.getEmpSalary());
		
	}
}
public static void main(String[] args) {
	EmployeeMain em= new EmployeeMain();
	em.insertDemo();
	em.display();
}
}
