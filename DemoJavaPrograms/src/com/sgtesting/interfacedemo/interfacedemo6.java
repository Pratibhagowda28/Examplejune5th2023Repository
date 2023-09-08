package com.sgtesting.interfacedemo;
//one interface can extends another interface at multilevel.
interface hospital
{
	void displayhospitalname(String name);
	
}
interface ambulancedept extends hospital
{
	void displayambulancedeptname(String name);
}
class radiology implements ambulancedept
{
	public void displayambulancedeptname(String name)
	{
		System.out.println("Department name: "+name);
	}
	public void displayhospitalname(String name)
	{
		System.out.println("Hospital name: "+name);
	}
}

public class interfacedemo6 {

	public static void main(String[] args) {
		radiology o=new radiology();
		o.displayhospitalname("Siddaganga");
		o.displayambulancedeptname("ambulance");
	}

}
