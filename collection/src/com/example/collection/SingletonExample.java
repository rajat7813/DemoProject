package com.example.collection;

public class SingletonExample {

	private static SingletonExample se = new SingletonExample();
	SingletonExample se1 =new SingletonExample();

	
	private SingletonExample() {
		// TODO Auto-generated constructor stub
	}
	public static SingletonExample getObject()
	{
		return se;
	}
	
	
	public void display()
	{
		System.out.println("Done!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SingletonExample se =new SingletonExample();
		SingletonExample.getObject().display();
	}

}
