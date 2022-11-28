package com.jsp.developerdesignforcar;

public class Driver 
{
	public void drive(Car car)
	{
		car.start();
		car.accelerate();
		car.stop();
	}
	
	public void accessBlutooth(Car car)
	{
//		Swift swift =(Swift) car;
//		swift.Bluetooth();
		
		if (car instanceof Audi)
			((Audi)car).Bluetooth();
		
		if (car instanceof Swift)
			((Swift)car).Bluetooth();
		
	}
	
//	public void drive(Swift swift)
//	{
//		swift.start();
//		swift.accelerate();
//		swift.stop();
//	}
//	
//	public void drive(Audi audi)
//	{
//		 audi.start();
//		 audi.accelerate();
//		 audi.stop();
//	}
//	
//	public void drive(Benz benz)
//	{
//		benz.start();
//		benz.accelerate();
//		benz.stop();
//	}
}
