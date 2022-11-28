package com.jsp.association;

class SimOperator
{
	String simName;
	SimOperator(String simName)
	{
		this.simName=simName;
	}
	void callingImplementation()
	{
		System.out.println(this.simName+ " calling implementation defined");
	}
}

class Battery
{
	String batteryName;
	Battery(String batteryName)
	{
		this.batteryName=batteryName;
	}
}

class Phone
{
	String phoneName;
	Battery battery;
	Phone(String phoneName, Battery battery)
	{
		this.phoneName=phoneName;
		this.battery=battery;
	}
		
	void Call(SimOperator s)
	{
		s.callingImplementation();
	}
	
}


public class PhoneAssociation {

	public static void main(String[] args)
	{
		Battery b= new Battery("Li-ion");
     	Phone phone = new Phone("Samsung",b);
		SimOperator sim =new SimOperator("Airtel");
		phone.Call(sim);

	}

}
