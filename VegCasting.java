package com.jsp.castingpack;

import java.util.Scanner;

class Vegetable
{
	
}

class carrot extends Vegetable
{
	public void prepareCarrotHalwa()     //specific method
	{
		System.out.println("Halwa is a traditional sweet of India");	
	}
}

class Potato extends Vegetable
{
	public void prepareFrenchFries()       //specific method
	{
		System.out.println("Frech fries with more oil is a good for health");	
	}	
}

class Shopkeeper
{
	public Vegetable sell(String vegName)
	{
		if(vegName.equalsIgnoreCase("Carrot")) return new carrot();
		if(vegName.equalsIgnoreCase("Potato")) return new Potato();
		
		System.out.println(vegName + "Not available");
		return null;
	}
	
}

public class VegCasting {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the vegetable");
		String vegName=scn.next();
		
		Shopkeeper shop=new Shopkeeper();
		Vegetable veg= shop.sell(vegName);
		
		if(veg instanceof carrot)
			((carrot)veg).prepareCarrotHalwa();   //downcasting
		
		if(veg instanceof Potato)
			((Potato)veg).prepareFrenchFries();     //downcasting
	}

}
