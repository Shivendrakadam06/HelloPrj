package com.cloud;

import java.util.Scanner;

public class StudentArray {
	private Student studentarr[];
	private Scanner scobj;
	public StudentArray()
	{
		
		scobj=new Scanner(System.in);
		studentarr=new Student[5];
		
	}
	public void acceptDetails()
	{
	
		for(int x=0;x<3;x++)
		{
			Student s=new Student();
			System.out.println("Enter studentid ");
			s.setStudentid(scobj.nextInt());
			System.out.println("Enter Student name ");
			s.setStudentname(scobj.next());
			System.out.println("Enter score");
			s.setScore(scobj.nextInt());
			studentarr[x]=s;
		}
	}

	public void check() {
		Student s1=new Student();
		System.out.println("Enter studentid ");
		s1.setStudentid(scobj.nextInt());
		System.out.println("Enter Student name ");
		s1.setStudentname(scobj.next());
		System.out.println("Enter score");
		s1.setScore(scobj.nextInt());
		
		for(int x=0;x<studentarr.length;x++) {
			if(s1.equals(studentarr[x]))
			{
				System.out.println("They are equals");
				break;
			}else {
				studentarr[4]=s1;
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		StudentArray sa = new StudentArray();
		sa.acceptDetails();
		sa.check();
		
	}
		
		
		
		
	}


