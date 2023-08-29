package com.cloud;

public class StudentApp {

	public static void main(String[] args) {
		Student student1=new Student();
		Student student2=new Student();
		student1.setStudentid(1);
		student1.setStudentname("Aman");
		student1.setScore(90);
		student2.setStudentid(1);
		student2.setStudentname("Aman");
		student2.setScore(90);
		if(student1.equals(student2))
		{
			System.out.println("They are equals");
		}
		else
		{
			System.out.println("They are not equals");
		}
	}

}
