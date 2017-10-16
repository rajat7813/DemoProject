package com.example.collection;

public class StudentVO {
	
	int rollno;
	String name;
	
	
	public StudentVO() {
		}
	public StudentVO(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
