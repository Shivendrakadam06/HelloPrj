package com.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UserMain {
	private Map<Integer,User> umap;
	private Scanner sc;
	
	public UserMain() {
		sc=new Scanner(System.in);
		umap=new HashMap<Integer,User>();
	}
	
	
	public void insert()
	{
		System.out.println("Enter number of User u want ");
		int noofemployee=sc.nextInt();
		for(int x=1;x<=noofemployee;x++)
		{
			User u1=new User();
			System.out.println("Enter User ID");
			int uid=sc.nextInt();
			u1.setUserId(uid);
			
			System.out.println("Enter User name ");
			u1.setUserName(sc.next());
			System.out.println("Enter user password");
			u1.setPassword(sc.next());
			umap.put(uid,u1);
		}
	}
	
	public void validateUser() {
		boolean flag= false;
		System.out.println("enter the user id for validation");
		int uid=sc.nextInt();
		System.out.println("Enter User name ");
		String uname=sc.next();
		System.out.println("Enter user password");
		String upass=sc.next();
		
		Set<Map.Entry<Integer,User>> mapd=umap.entrySet();
		for(Map.Entry<Integer,User> u2:mapd) {
			u2.getKey();
			User ur= u2.getValue();
			
			if(uid==ur.getUserId()  && uname.equals(ur.getUserName()) && upass.equals(ur.getPassword())) {
			    flag=true;
			//	System.out.println("you are validate user");
				//break;
				}
			//else 
			//	{
				//	System.out.println("you are invalidate user");
			//
			//}
			
			
		}
		if (flag==true) {
			System.out.println("you are validate user");
		}else
		{
			System.out.println("you are invalidate user");
		}
		
	}
public static void main(String[] args) {
	UserMain um= new UserMain();
	um.insert();
	um.validateUser();
}
}
