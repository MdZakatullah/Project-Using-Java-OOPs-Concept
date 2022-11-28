package com.jsp.castingpack;

class Animal
{
	public void drink()
	{
		System.out.println("water is the need of animals");
	}
	public void sound()
	{
		
	}
	public void movement()
	{
		
	}
	
	class Lion extends Animal
	{
		@Override
		public void sound()
		{
			System.out.println("Lion Roars");
		}
		@Override
		public void movement()
		{
			System.out.println("Lion Runs/walk/jump");
		}
		public void eatfood()
		{
			System.out.println("hunts for food");
		}
	}
	
	class Snake extends Animal
	{
		@Override
		public void sound()
		{
			System.out.println("HHHsssssssssss");	
		}
		@Override
		public void movement()
		{
			System.out.println("crawing/Nagin Dance");
		}
		public void venomuse()
		{
			System.out.println("use of medicinal");
		}
	}

}

public class GamingApp {

	public static void main(String[] args) 
	{
//		Animal animal=new Lion();   
//		animal.drink();
//		animal.sound();
//		animal.movement();
//		
//		Lion lion=(Lion) animal;
//		lion.eatfood();
//		
//		Animal animal1=(Animal) new Snake();    
//		animal1.drink();
//		animal1.sound();
//		animal1.movement();
//		
//		((Snake)animal1).venomuse();
//
	}

}
