package com.cloud;

public class StudentA extends Marks {
private int sub1;
	private int sub2;
	private int sub3;
	public StudentA(int sub1, int sub2, int sub3) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	@Override
	public void getPercentage() {
		double total=sub1+sub2+sub3;
		double percentage=(total/300)*100;
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
		System.out.println("percentage of student is "+percentage);
		
	}
	public static void main(String[] args) {
		Marks m=null;
		m= new StudentA(45, 45, 70);
		m.getPercentage();
	}
	

}
