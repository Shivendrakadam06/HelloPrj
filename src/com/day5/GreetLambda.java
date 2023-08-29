package com.day5;

public class GreetLambda {
public static void main(String[] args) {
	  Greeting gr=(s)->System.out.println(s);
	  
	  gr.greet("Good morning");
	  gr.greet("happy birthday");
	  gr.greet("happy new year");
	
	
	
}
}
