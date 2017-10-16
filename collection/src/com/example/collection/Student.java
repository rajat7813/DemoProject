package com.example.collection;

import java.util.Comparator;

public class Student implements Comparator<StudentVO> {

	

	public Student() {
		// TODO Auto-generated constructor stub
	}
/*	@Override
	public int compare(Student obj1,Student obj2) {
		// TODO Auto-generated method stub
		return obj1.getName().compareTo(obj2.getName());
	}
	@Override*/
	public int compare(StudentVO obj1,StudentVO obj2 ) {
		
		return obj1.getName().compareTo(obj2.getName());
		// TODO Auto-generated method stub
		
	}


}
