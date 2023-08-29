package com.cloud;

import java.util.Scanner;

public class Employee {
private int Empid;
private String Empname;
protected Scanner sc;
Employee(){
	sc=new Scanner(System.in);
}

public void accept() {
	 System.out.println("Enter employee id");
	 Empid=sc.nextInt();
	 System.out.println("Enter employee Name");
	 Empname=sc.next();
	
}
public void display()
{
	 System.out.println(" employee id"+Empid);
	 System.out.println(" employee Name"+Empname);
	 
}
}
