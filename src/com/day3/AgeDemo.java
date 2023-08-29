package com.day3;

import java.util.Scanner;

public class AgeDemo {
	private Scanner sc;
	int age;
	public AgeDemo()
	{
		sc=new Scanner(System.in);
	}
	public void accept()
	{
		try
		{
		System.out.println("Enter Age");
		age=sc.nextInt();
		if(age<18)
		{
			throw new InvalidAgeException();
		}
		}
		catch(InvalidAgeException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	public static void main(String[] args) {
		AgeDemo aged=new AgeDemo();
		aged.accept();
	}
}