package com.day4;

public class BankMain {
public static void main(String[] args) {
	BankAccount bnk= new BankAccount();
	BankTh1 th1= new BankTh1(bnk);
	th1.start();
	BankTh2 th2= new BankTh2(bnk);
	
	th2.start();
}
}
