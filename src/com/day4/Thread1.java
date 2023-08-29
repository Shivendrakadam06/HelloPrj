package com.day4;

public class Thread1 extends Thread {
	Table obj;
	public Thread1(Table obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.printTable(7);
	}

}