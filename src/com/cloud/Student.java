package com.cloud;

import java.util.Objects;

public class Student {
	private int studentid;

	
	//hashCode is unique number which is generated for object
//	if(student1.equals(student2))
	/*
	 * student1=current object that means this
	 * student2= is storing in obj
	 */

	@Override
	public int hashCode() {
		return Objects.hash(score, studentid, studentname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return score == other.score && studentid == other.studentid && Objects.equals(studentname, other.studentname);
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	private String studentname;
	private int score;

}
