package com.day3;

import java.util.Scanner;

public class ArithDemo {
	private Scanner sc;
	int number1;
	int number2;
	public ArithDemo()
	{
		sc=new Scanner(System.in);
		
	}
	public void checkData()
	{
		System.out.println("Enter number 1");
		number1=sc.nextInt();
		System.out.println("Enter number 2");
		number2=sc.nextInt();
		try
		{
		double result=number1/number2;
		System.out.println("Result is "+result);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Trying to divide number by zero");
		}
	}
	public static void main(String[] args) {
		ArithDemo arhd=new ArithDemo();
		arhd.checkData();
	}

}
