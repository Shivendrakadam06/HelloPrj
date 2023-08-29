package com.cloud;

public class Businessman extends Person{
	
	public void runBusiness() {
		 	super.talk();
			super.eat();
			super.walk();
			System.out.println("run business");
	}

}
