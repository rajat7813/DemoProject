package com.example.collection;

import java.util.ArrayList;
import java.util.Collections;

public class collection {

	public collection() {
	
	}

	public static void main(String[] args) {

/*			ArrayList arraylist = new ArrayList();
			arraylist.add("My");
			arraylist.add("Name");
			arraylist.add("is");
			System.out.println(arraylist);
			arraylist.add("Rajat");
			arraylist.add("Aora");
			arraylist.remove(2);
			System.out.println(arraylist);
			
			ArrayList arraylist1 =new ArrayList();
			arraylist1.add("Google");
			arraylist1.add("Sopra");
			System.out.println(arraylist1);
			arraylist1.addAll(arraylist);
			System.out.println(arraylist1);

			Iterator itr =arraylist1.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
		
			if(arraylist1.contains("name"))
			{
				System.out.println("True");
			}
			else 
			{
				System.out.println("False");
			}
			*/	
/*			List<?> l =new ArrayList<String>();
			
			Map map =new HashMap();
			map.put(1,"Rajat");
			map.put(2,"Harshit");
			map.put(3,"Aman");
			map.put(4,"Preity ");
			map.put(5,"Priyanshi");
			map.put(6,"Mayank");
				
	//		System.out.println(map);
			
			Set s2 =map.entrySet();
			Iterator itr2 =s2.iterator();

			while(itr2.hasNext())
			{
				
				Map.Entry entry =(Map.Entry)itr2.next();
				System.out.println(entry.getValue());
			
				}
			}
			*/
	/*		Set s = new TreeSet();
			s.add("My");
			s.add("Name");
			s.add("Name");
			s.add("is");
			s.add("Rajat");
			s.add("Aora");
			s.add("Aora");
	//		s.add(200);
	//		s.add(100);

			
			Iterator itr1 =s.iterator();

			while(itr1.hasNext())
			{
				System.out.println(itr1.next());
			}
			
			
			if(s.contains("Name"))
			{
				System.out.println("True");
			}
			*/

/*		Login l1 =new Login();
		Login l2 =new Login();
		Login l3 =new Login();
		l1.setUserId("rajat");
		l1.setPassword(123456);
		l2.setUserId("harshit");
		l2.setPassword(123457);
		l3.setUserId("preity");
		l3.setPassword(123458);
		
		List<Login> ln = new ArrayList<Login>();
		ln.add(l1);
		ln.add(l2);
		ln.add(l3);
		
		for(Login l:ln)
		{
			System.out.println(l.getUserId()+" "+l.getPassword());
		}*/
		
		StudentVO s1 =new StudentVO();
		StudentVO s2 =new StudentVO();
		StudentVO s3 =new StudentVO();
		StudentVO s4 =new StudentVO();
		s1.setName("Raghav");
		s1.setRollno(1);
		s2.setName("Harshit");
		s2.setRollno(2);
		s3.setName("Mayank");
		s3.setRollno(3);
		s4.setName("Preity");
		s4.setRollno(4);
		
		ArrayList<StudentVO> al = new ArrayList<StudentVO>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
	/*	
		for(StudentVO s:al)
		{
			System.out.println(s.getName()+" "+s.getRollno());
		}
		Collections.sort(al,new Student());
		
		for(StudentVO s:al)
		{
			System.out.println(s.getName()+" "+s.getRollno());
		}*/
	}
}

