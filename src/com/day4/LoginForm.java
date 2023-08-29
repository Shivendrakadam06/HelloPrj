package com.day4;

import java.util.Scanner;

public class LoginForm implements Runnable{
	private String userid= "shiv";
	private int password=456;
	private Scanner sc;
	
	public LoginForm() {
		sc= new Scanner(System.in);
	}
	
	public void run() {
		System.out.println("Enter the user name ");
		String uname= sc.next();
		System.out.println("Enter the user password ");
		int upass = sc.nextInt();
		
		if(uname.equals(userid)&& upass==password) {
			System.out.println("login succeessfully");
		}else {
			System.out.println("wrong id password");
		}
	}

}
