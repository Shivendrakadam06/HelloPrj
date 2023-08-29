package com.day3.io;
import java.io.*;
public class FileDisplay {
	
	public static void main(String[] args) {
		File fobj= new File("E:\\Filedemo\\");
		String[] fileList = fobj.list();
		
		 for(String name:fileList){
	            System.out.println(name);
	        }
	}

}
