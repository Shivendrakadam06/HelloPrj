package com.day3.io;
import java.io.*;
import java.util.Scanner;
public class FileDemo {
	public static void main(String[] args) {
		File fobj= new File("E:\\Filedemo\\data.txt");
		File fobj1= new File("E:\\Filedemo\\demo\\demo1");
		
		//if(fobj.isDirectory()) {
		///	System.out.println("this is a folder");
		//}else {
		//	System.out.println("this is a file ");
		//}
		
		//fobj1.mkdirs();
		//try {
		// Scanner dr = new Scanner(fobj);  
        // while (dr.hasNextLine()) {  
          //   String fileData = dr.nextLine();  
         //    System.out.println(fileData);  
       //  }}
         //catch(FileNotFoundException exception) {
        	 // System.out.println("Unexcpected error occurred!");
       //  }
      
	//}
        		try
        		{
        		FileInputStream inputs=new FileInputStream
        				("E:\\Filedemo\\data.txt");
        		int i;
        		while((i=inputs.read())!=-1)
        		{
        			char data=(char)i;
        			System.out.print(data);
        		}
        		}
        		catch(IOException ex)
        		{
        			System.out.println("Unable to read data");
        		}
        		try
        		{
        		String data="This is my first java programa";
        		FileOutputStream output=new FileOutputStream("E:\\Filedemo\\hello.txt");
        		byte val[]=data.getBytes();
        		output.write(val);
        		System.out.println("Data written in file");
        		}
        		catch(Exception ex)
        		{
        			System.out.println(ex.getMessage());
        		}
        	}

        }
        	  
	

