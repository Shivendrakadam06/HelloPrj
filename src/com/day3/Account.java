package com.day3;

import java.util.Scanner;

public class Account {
	private int accBalance;
	private Scanner sc;
	 public Account() {
		 sc= new Scanner(System.in);
		 
	 }
	
	public int getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}

	
	public void add() {
		System.out.println("enter the amount");
		accBalance=sc.nextInt();
	}
	
	public void withdraw() throws InsufficienBalancException {
		System.out.println("enter the amount which you want to withdraw");
		int wamt= sc.nextInt();
		if (wamt<accBalance) {
			throw new InsufficienBalancException();
		}
	
	}

	
	

}
