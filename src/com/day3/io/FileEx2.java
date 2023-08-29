package com.day3.io;
import java.io.*;
public class FileEx2 {
public static void main(String[] args) {
	try
	{
	FileInputStream inputs=new FileInputStream
			("E:\\Filedemo\\data.txt");
	FileOutputStream output=new FileOutputStream("E:\\Filedemo\\copy.txt");
	int i;
	while((i=inputs.read())!=-1)
	{
		output.write(i);
		

	}
	}
	catch(IOException ex)
	{
		System.out.println("Unable to read data");
	}
	
}
}


