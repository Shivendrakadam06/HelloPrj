package com.cloud;

public class MathTeacher extends Person {
	public void teachMath() {
		super.talk();
		super.eat();
		super.walk();
		System.out.println("teaching math");
	}

}
