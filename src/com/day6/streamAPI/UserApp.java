package com.day6.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class UserApp {
	private Scanner sc;
	private List<User> url;

	public UserApp() {
		sc=new Scanner(System.in);
		url= new ArrayList<User>();
	}
	 public void insert() {
		 System.out.println("Enter no of user u want to enter ");
			int noofuser=sc.nextInt();
			for(int x=1;x<=noofuser;x++) {
				User u= new User();
				System.out.println("Enter Username ");
				u.setuName(sc.next());
				System.out.println("enter password ");
				u.setUpass(sc.next());
				url.add(u);
			}
	 }
	  
	 public void validate() {
		 System.out.println("Enter your user name");
		 String str=sc.next();
		 System.out.println("Enter your password here");
		 String str2 = sc.next();
	Optional<User> udata= url.stream().filter(p-> p.getuName().equals(str) && p.getUpass().equals(str2) ).findFirst();
	if(udata.isEmpty())
	{
		System.out.println("nbot valid");
	}
	else
	{
		System.out.println("Vali user");
	}
	 }
	 public static void main(String[] args) {
		UserApp ua = new UserApp();
		ua.insert();
		ua.validate();
	}
}
