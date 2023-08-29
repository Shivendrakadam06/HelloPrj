package com.day4;

public class BankTh2 extends Thread{
	BankAccount obj;
	public BankTh2(BankAccount obj) {
		this.obj=obj;
		
	}
	public void run()
	{
		obj.deposit();
	}

}
