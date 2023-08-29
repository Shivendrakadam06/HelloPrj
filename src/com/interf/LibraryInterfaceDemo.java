package com.interf;

public class LibraryInterfaceDemo {
public static void main(String[] args) {
	KidUsers kd= new KidUsers(10, "fiction");
	kd.registerAccount();
	kd.requestBook();
	
	//AdultUser au=new AdultUser(25, "fiction");
	//au.registerAccount();
	//au.requestBook();
}
}
