package com.jsp.developerdesignforcar;

public class Swift extends Car
{
	@Override
	public void start() 
	{
		System.out.println("Key Start");
		
	}
	
	@Override
	public void accelerate() 
	{
		System.out.println("Half Clutch Drive");
		
	}
	
	@Override
	public void stop() 
	{
		System.out.println("key Stop");
		
	}
	
	public void Bluetooth()      //specific method
	{
		System.out.println("JBL bluetooth for Swift Car");
	}

}
