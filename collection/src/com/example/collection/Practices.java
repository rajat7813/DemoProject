package com.example.collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class Practices {

	public Practices() {
	}

	public static void main(String[] args) throws ParseException {
		long l= System.currentTimeMillis();
		Date d =new Date(l);
		System.out.println(d);
		
	/*	Calendar Cal=Calendar.getInstance();
		Cal.add(Calendar.DATE, +15);
		System.out.println("Date afetr 15 Days"+ Cal.getTime());
		Cal.add(Calendar.YEAR, +5);
		System.out.println(Cal.getTime());
		*/
		String  s ="Hi hw // you doing";
		StringTokenizer st =new StringTokenizer(s);
		while (st.hasMoreTokens()) {
		System.out.println(st.nextToken());
		}
		
		
		try {
		SimpleDateFormat format =new SimpleDateFormat("dd/MM/yyyy");
		Date da =format.parse("30/SEP/2017");
		System.out.println(da);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Date not given ok");
		}
		
	}

}
