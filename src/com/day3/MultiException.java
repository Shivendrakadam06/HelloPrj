package com.day3;

import java.util.Scanner;



public class MultiException {
	private int arr[];
	private Scanner sc;
	public MultiException()
	{
		arr=new int[4];
		sc=new Scanner(System.in);
		
	}
	public void acceptVal()
	{
		for(int x=0;x<arr.length;x++)
		{
			System.out.println("Enter value");
			arr[x]=sc.nextInt();
			
		}
	}
	public void divide()
	{
		System.out.println("Enter index number for first value");
		int index1=sc.nextInt();
		System.out.println("Enter index number for second value");
		int index2=sc.nextInt();
		try
		{
		double result=arr[index1]/arr[index2];
		System.out.println("Result is  "+result);
		}
catch(ArithmeticException ex)
		{
			System.out.println("Trying to divide rnumber by zero");
		}
		catch(ArrayIndexOutOfBoundsException  ex)
		{
		System.out.println("Trying to access beyound limit.");	
	
		}
	}
	public static void main(String[] args) {
		MultiException mec=new MultiException();
		mec.acceptVal();
		mec.divide();
	}
			
	
	
}