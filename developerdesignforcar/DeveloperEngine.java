package com.jsp.developerdesignforcar;

public class DeveloperEngine {

	public static void main(String[] args)
	{
		Driver driver1=new Driver();
		driver1.drive(new Benz());
		
		driver1.accessBlutooth(new Audi());
		
		System.out.println("***************************");

		
		driver1.drive(new Swift());
		
		System.out.println("***************************");
		
    	driver1.drive(new Audi());
		
		System.out.println("***************************");
		
		//driver1.drive(new Benz());
		

	}

}
