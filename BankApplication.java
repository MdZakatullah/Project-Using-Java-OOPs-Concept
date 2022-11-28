package com.miniProject.casting1;

import java.util.Scanner;

class Bank
{
	public double rateOFIntersetForHomeLoans()
	{
		return 0.0;
	}	
}

class SBI extends Bank
{
	@Override
	public double rateOFIntersetForHomeLoans()
	{
		return 0.10;
	}	
}

class HDFC extends Bank
{
	@Override
	public double rateOFIntersetForHomeLoans()
	{
		return 0.15;
	}
}

class ICICI extends Bank
{
	@Override
	public double rateOFIntersetForHomeLoans()
	{
		return 0.18;
	}	
}

class Salesman
{
	public void salesForLoans(Bank bank,double amount)
	{
		double rateOfInterset = bank.rateOFIntersetForHomeLoans();
		double roiAmount=(rateOfInterset * amount);
		 int percent= (int) (rateOfInterset *100);
		 
		 System.out.println(percent + " % is the percent of interest for the amount " +amount);
		 System.out.println(roiAmount+" interest to be paid.");
		 double totalAmount = (amount + roiAmount);
		 System.out.println("Total amount "+ totalAmount+ " to be paid.");
		
	}
}


public class BankApplication {

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the amount for loans");
		double amount = scn.nextDouble();
		
		Salesman sales = new Salesman();
		sales.salesForLoans(new ICICI(), amount);
	}
}
