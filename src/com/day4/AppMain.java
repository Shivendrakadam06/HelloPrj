package com.day4;

public class AppMain {
	public static void main(String[] args) {
		Table tobj=new Table();
		Thread1 th1=new Thread1(tobj);
		Thread2 th2=new Thread2(tobj);
		th1.start();
		th2.start();
	}

}