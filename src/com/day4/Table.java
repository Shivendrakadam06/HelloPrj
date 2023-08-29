package com.day4;

public class Table {
	public synchronized void printTable(int number)
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println(number+" * "+x+" = "+(number*x));
		}
	}

}