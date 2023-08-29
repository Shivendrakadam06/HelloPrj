package com.day4.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OfficeMain {
	private Scanner sc;
	private List<Department> dpt;
	public OfficeMain() {
		sc= new Scanner(System.in);
		dpt= new ArrayList<Department>();
	}

	public void insertData() {
		List<Employee> empl= new ArrayList<Employee>();
		System.out.println("Enter how many emp you want to add");
		int noofemp=sc.nextInt();
		for(int x=1;x<=noofemp;x++) {
			Employee emp=new Employee();
			System.out.println("Enter employee code ");
			emp.setEmpCode(sc.next());
			System.out.println("Enter employee name");
			emp.setEmpName(sc.next());
			System.out.println("Enter salary");
			emp.setSalary(sc.nextDouble());
			empl.add(emp);
		}
		
		
		Department d= new Department();
		d.setdCode("a1");
		d.setdName("IT");
		d.setdCity("indore");
		d.setEmpList(empl);
		dpt.add(d);
	}
	
	public void Display() {
	
	for (Department d:dpt) {
		System.out.println("department code is "+" "+ d.getdCode());
		for(Employee e: d.getEmpList()) {
			System.out.println("employee name is"+" "+ e.getEmpName());
			System.out.println("employee salary is"+""+e.getSalary());
		}
	
	}
	}

}
