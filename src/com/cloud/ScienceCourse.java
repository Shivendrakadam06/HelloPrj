package com.cloud;

public class ScienceCourse extends Course  {
	public ScienceCourse()
	{
		//super();//it will call the constructor of super class.
		System.out.println("This is Science Course class");
	}
	
	public void sciencecoursedetails() {
		super.coursedetails();
		System.out.println("derived class course");
	}
	public static void main(String[] args) {
		
		ScienceCourse scobj=new ScienceCourse();
		scobj.sciencecoursedetails();
	}

}