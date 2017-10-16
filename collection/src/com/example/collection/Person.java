package com.example.collection;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer {

	private static String name;
	
	public Person(String name) {
		// TODO Auto-generated constructor stub
		
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Person.name = name;
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Updated");
	}

}
