package com.day3.io;

import java.io.*;
import java.util.*;
public class ProductWriteData {
	FileOutputStream outputstream;
	ObjectOutputStream ooutput;
	Scanner sc;
	public ProductWriteData()
	{
		
	}
	public void writeData()
	{
		sc=new Scanner(System.in);
		try {
			outputstream=new FileOutputStream("E:\\Filedemo\\fileoutput.txt");
		
		ooutput=new ObjectOutputStream(outputstream);
		Product p1=new Product();
		p1.setProductid(1);
		p1.setProductname("Mouse");
		p1.setPrice(900);
		ooutput.writeObject(p1);
		System.out.println("Data written");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
public void readData()
	{
		try
		{
		
		FileInputStream input=new FileInputStream("E:\\Filedemo\\fileoutput.txt");
		ObjectInputStream iinput=new ObjectInputStream(input);
		Product p=(Product)iinput.readObject();
		System.out.println("Product name is "+p.getProductname());
		System.out.println("Product price is "+p.getPrice());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	public static void main(String[] args) {
		ProductWriteData pwrite=new ProductWriteData();
		pwrite.writeData();
		pwrite.readData();
	}

}
