package com.Stringimp;

public class StringOp {
	public static void main(String args[]) {
		String str="Welcome to Java World";
		String str1="welcome";
		char ch=str.charAt(5);
		System.out.println(ch);  
		
		String str3=str.concat(" Let us learn"); 
		System.out.println(str3); 
		
		String replaceString=str.replace('a','e'); 
		System.out.println(replaceString);  
		System.out.println(str.substring(4,10));
	}

}
