package com.day6.defaultmethod;

public interface Details {
 public void personaldetails();
 public default void  educationaldetails() {
	 System.out.println("in interface educational details ");
 }
 
}
