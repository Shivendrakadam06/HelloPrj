package com.day3;

import java.util.Scanner;

public class StringVo {
private Scanner sc;
	public StringVo()
	{
		sc= new Scanner(System.in);
	}
	public void checkvowel() throws DoesNotContainVowelException  
	{
		int vCount = 0;
		System.out.println("enter String");
		String str=sc.next();
		 for(int i = 0; i < str.length(); i++) {    
	               
	            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
	            	vCount++;
	            	//      System.out.println("String contain vowels"); 
	                 
	                } 
	}
		 if (vCount>0) {
			 System.out.println("String contain vowels"); 
			 
		 }else {
			 throw new DoesNotContainVowelException();
		 }
	}
	public static void main(String[] args) throws DoesNotContainVowelException {
		StringVo sv=new StringVo();
		sv.checkvowel();
	}
}
