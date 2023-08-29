package com.day4;

public class Thread2 extends Thread{
	Table obj;
	public Thread2(Table obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.printTable(20);
	}

}