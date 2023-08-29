package com.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EmployeeMap {
	private Map<Integer,Employee1> empmap;
	private Scanner sc;
	public EmployeeMap()
	{
		sc=new Scanner(System.in);
		empmap=new HashMap<Integer,Employee1>();
		
	}
	
	public void insert()
	{
		System.out.println("Enter number of employes u want ");
		int noofemployee=sc.nextInt();
		for(int x=1;x<=noofemployee;x++)
		{
			Employee1 e1=new Employee1();
			System.out.println("Enter Employee code ");
			int empcode=sc.nextInt();
			e1.setEmpid(empcode);
			System.out.println("Enter employee name ");
			e1.setEmpname(sc.next());
			System.out.println("Enter Salary ");
			e1.setSalary(sc.nextDouble());
			empmap.put(empcode,e1);
		}
	}
public void display()
	{
		Set<Map.Entry<Integer,Employee1>> mapd=empmap.entrySet();
		for(Map.Entry<Integer,Employee1> mapenter:mapd)
		{
			System.out.println("Key is "+mapenter.getKey());
			Employee1 eobj=mapenter.getValue();
			System.out.println("Employee name is "+eobj.getEmpname());
					
		}
		
	}
	public static void main(String[] args) {
		EmployeeMap emap=new EmployeeMap();
		emap.insert();
		emap.display();
	}}