package com.jsp.developerdesignforcar;

public class Benz extends Car
{
	@Override
	public void start() 
	{
		System.out.println("Touch Start");
		
	}
	
	@Override
	public void accelerate() 
	{
		System.out.println("Automated Drive");
		
	}
	
	@Override
	public void stop() 
	{
		System.out.println("Touch Stop");
		
	}
}
