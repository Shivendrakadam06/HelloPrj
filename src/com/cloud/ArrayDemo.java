package com.cloud;
import java.util.Scanner;
public class ArrayDemo {
	private int arr[];
	private Scanner sc;
	public ArrayDemo()
	{
		sc=new Scanner(System.in);
		arr=new int[5];
	}
	public void accept()
	{
		for(int x=0;x<arr.length;x++)
		{
			System.out.println("Enter any number ");
			arr[x]=sc.nextInt();
		}
	}
	public void display()
	{
		for(int val:arr )
		{
			System.out.println("Value is "+val);
		}
	}
	public static void main(String[] args) {
		ArrayDemo arrd=new ArrayDemo();
		arrd.accept();
		arrd.display();
	}

}
