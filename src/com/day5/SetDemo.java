package com.day5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetDemo {
	private Set<String> setd;
	private Scanner sc;
	public SetDemo()
	{
		setd=new HashSet<String>();
		sc=new Scanner(System.in);
		
				
	}
	public void insertDemo()
	{
		System.out.println("Enter numbe of records u want to insert");
		int noofrecords=sc.nextInt();
		for(int x=1;x<=noofrecords;x++)
		{
			System.out.println("Enter values");
			setd.add(sc.next());
		}
	}
	public void display()
	{
		for(String s:setd)
		{
			System.out.println("Value is "+s);
		}
	}
	public static void main(String s[])
	{
		SetDemo setd=new SetDemo();
		setd.insertDemo();
		setd.display();
	}
	

}