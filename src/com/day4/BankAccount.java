package com.day4;

import java.util.Scanner;

public class BankAccount {
	
	private int balance=50000;
	private Scanner sc;
	public BankAccount() {
		sc= new Scanner(System.in);
		
	}
	
	public synchronized void withdraw() {
		System.out.println("enter amount for withdraw");
		int wamt= sc.nextInt();
		//int lamt=0;
		if (wamt>balance) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("insufficent balance");
			//System.out.println("remaning balance is" + balance);
		} 
		
			//lamt=balance-wamt;
			balance=balance-wamt;
		System.out.println("withdraw succeful");
		System.out.println("remaning balance is" + balance);
		//balance=lamt;
		
		
	}

	
	public synchronized void deposit() {
		System.out.println("enter amount for deposit");
		int damt= sc.nextInt();
		balance=balance+damt;
		System.out.println("your balance is" + balance);
		notify();
		
	}
}
