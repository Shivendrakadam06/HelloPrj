package com.day3;

public class NestedTryCatch {

	public static void main(String[] args) {
		try
		{
			int arr[]= {56,23,2,3,4};
			try
			{
				System.out.println("coming here");
				double result=arr[3]/0;
				System.out.println("Result is "+result);
			}
			catch(ArithmeticException ex)
			{
				System.out.println("Trying to divide number by zero");
			}
			System.out.println("Welcome here");
			System.out.println("Value of array is "+arr[4]);

		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Trying to access beyond limit");
		}
	}
}