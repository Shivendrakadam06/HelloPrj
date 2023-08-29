package com.cloud;

public class StudentB extends Marks  {
	private int sub1;
	private int sub2;
	private int sub3;
	private int sub4;
	public StudentB(int sub1, int sub2, int sub3, int sub4) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
	}
	@Override
	public void getPercentage() {
		double total=sub1+sub2+sub3+sub4;
		double percentage= (total/400)*100;
		System.out.println("percentage of student is "+percentage);
		
	}
	public static void main(String[] args) {
		Marks m=null;
		m= new StudentB(45, 89, 47, 12);
		m.getPercentage();
	}
	
}
