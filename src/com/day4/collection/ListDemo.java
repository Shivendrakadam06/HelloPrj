package com.day4.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	private List<String> liststr;
	public ListDemo()
	{
		liststr=new ArrayList<String>();
	}
	public void op()
	{
		liststr.add("java");
		liststr.add("welcome");
		liststr.add("hello");
		liststr.add("spring Framework");
		liststr.add("Hibernate Framework");
		System.out.println("Displaying data ");
		ArrayList<String> demo = new ArrayList<>();  
		demo.add("new");
		demo.addAll(liststr);
		for(String s:liststr)
		{
			System.out.println("String is "+s);
		}
		liststr.remove(2);
		System.out.println("Displaying values after removing");
		for(String s:liststr)
		{
			System.out.println("After removing "+s);
		}
		for(String s:demo)
		{
			System.out.println("demo array "+s);
		}
		   boolean ans = demo.contains("new");
		   
	        if (ans)
	            System.out.println("The list contains new");
	        else
	            System.out.println("The list does not contains 2");
	}
	public static void main(String[] args) {
		
		ListDemo listd=new ListDemo();
		listd.op();
	}
}