package com.example.collection;

public enum Ranks {

	ACE,DEUCE,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING;
	
	private int value;  
	private Ranks(int value){  
	this.value=value;  
	} 
	
	private Ranks() {
		// TODO Auto-generated constructor stub
	}
}
