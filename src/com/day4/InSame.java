package com.day4;

public class InSame {

	public static void main(String[] args) {
		LoginForm lf = new LoginForm();
		Thread th = new Thread(lf);
		th.start();
	}

}
