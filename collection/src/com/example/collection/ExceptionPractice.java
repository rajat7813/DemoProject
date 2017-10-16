package com.example.collection;

public class ExceptionPractice {

/*	*//**public void divide(int a, int b) throws CustomException {
	
		int res;

		
		if(b == 0)
		{
			throw new CustomException("");
			//System.out.println("ok");
		}
		else
		{
			res  = a/b;
			throw new CustomException("Check for divisibility");
		}
		 
		/*catch (CustomException e) {
			
			throw new CustomException("not divisible");
			System.out.println(e);
			
		}*//*
		catch (Exception e) {
			// TODO: handle exception
		}
}	

	*/
	public static void main(String args[]) throws CustomException {
		
	//	ExceptionPractice ep =new ExceptionPractice();
	
		try{
			//ep.divide(5, 0);
		int a=10/0;
		throw new CustomException("error");
			
		
			
			
		}
		catch(CustomException e) {
			// TODO: handle exception
			//throw new CustomException("in Main");
			System.out.println("in mAin");
		}
		}
}
