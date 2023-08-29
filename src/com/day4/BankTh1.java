package com.day4;

public class BankTh1 extends Thread{
	BankAccount obj;
	public BankTh1(BankAccount obj) {
		this.obj=obj;
		
	}
	public void run()
	{
		obj.withdraw();
	}

}
