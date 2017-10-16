package com.example.collection;

import java.util.Locale;
import java.util.ResourceBundle;

public class internationalizationExample {

	public static void main(String args[])
	{
		String Language;
		String Country;
		
		if(args.length!=2)
		{
			Language =new String("en");
			Country =new String("US");
		}
		else 
		{
			Language =new String(args[0]);
			Country =new String(args[1]);
		}
		
		Locale currentLocale;
		ResourceBundle message;
		currentLocale = new Locale(Language, Country);
		message =ResourceBundle.getBundle("com.example.collection.MessageBundle", currentLocale);
		
		System.out.println(message.getString("greeting"));
		System.out.println(message.getString("inquiry"));
		System.out.println(message.getString("farewell"));
	}
	

}
