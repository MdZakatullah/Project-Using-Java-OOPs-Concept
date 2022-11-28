package com.jsp.singleton;

import java.util.Scanner;

class Theatre
{
	int seats=50;
	private static Theatre t=null;   //static reference
	
	private Theatre()       //private constructor
	{
		
	}
	
	public static Theatre getinsatance()    //factory method
	{
		if(t==null) t=new Theatre();
		return t;	
	}
	public void reserveseat(int numTickets)
	{
		if(numTickets>seats)
		{
			System.out.println(numTickets+" are not avialable");    
			System.out.println(seats+ " are available");
			return;
		}
	}
}

class BookingApp
{
	public void bookTickets()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("How many tickets?");
		int tickets=scan.nextInt();
		Theatre theatre=Theatre.getinsatance(); //X new Theatre();
		theatre.reserveseat(tickets);
	}
}


public class BookMyShow {

	public static void main(String[] args)
	{
		BookingApp cust1=new BookingApp();
		cust1.bookTickets();
		
		BookingApp cust2=new BookingApp();
		cust1.bookTickets();
		
		BookingApp cust3=new BookingApp();
		cust1.bookTickets();
	}
}
