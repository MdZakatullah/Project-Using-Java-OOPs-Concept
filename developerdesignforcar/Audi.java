package com.jsp.developerdesignforcar;

public class Audi extends Car
{
	@Override
	public void start() 
	{
		System.out.println("Button Start");
		
	}
	
	@Override
	public void accelerate() 
	{
		System.out.println("Full Clutch Drive");
		
	}
	
	@Override
	public void stop() 
	{
		System.out.println("Botton Stop");
		
	}
	
	public void Bluetooth()      //specific method
	{
		System.out.println("BOSS bluetooth for Audi Car");
	}


}
