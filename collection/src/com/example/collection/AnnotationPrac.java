package com.example.collection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class AnnotationPrac {

	@Retention(RetentionPolicy.RUNTIME)
	@interface Meal
	{	
		String name();
		String MainDish();
	}

	@Meal(name="breakfast",MainDish="cereal")
	//@Meal(name="breakfast1",MainDish="cereal1")
	public void evaluate()
	{
		Class a = AnnotationPrac.class;
		try {
			Method m = AnnotationPrac.class.getMethod("evaluate", null);
			Meal meal = m.getAnnotation(Meal.class);
			System.out.println(meal.name());
			System.out.println(meal.MainDish());
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Meal meal = (Meal) a.getAnnotation(Meal.class);
		
		System.out.println("Gm");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationPrac ap =new AnnotationPrac();
		ap.evaluate();
		SingletonExample.getObject().display();
		
	}

}
