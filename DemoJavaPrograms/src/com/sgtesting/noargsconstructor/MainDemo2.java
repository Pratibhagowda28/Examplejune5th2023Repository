package com.sgtesting.noargsconstructor;

class Fourwheeler
{
	String Vehiclename="Amaze";
	String Seatingcapacity="Five";
	int Speedlimit=200;
	String Brandname="HONDA";
	Fourwheeler()
	{
		System.out.println("Vehiclename is: "+Vehiclename);
		System.out.println("Seating capacity is: "+Seatingcapacity);
		System.out.println("Speed limit is: "+Speedlimit);
		System.out.println("Brand name is: "+Brandname);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
	}
}
class Twowheeler
{
    String Vehiclename="RAY Z";
    String Seatingcapacity="Two";
    int Modelyear=2020;
    String Brandname="YAMAHA";
    Twowheeler()
    {
    	System.out.println("Vehiclename is: "+Vehiclename);
		System.out.println("Seating capacity is: "+Seatingcapacity);
		System.out.println("Year of manufacture is: "+Modelyear);
		System.out.println("Brand name is: "+Brandname);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
    		
}
class Heavyvehicle
{
	String vehiclename="Truck";
	String loadcapacity="Fivehundred Kgs";
	int modelyear=2020;
	String brandname="TATA";
	Heavyvehicle()
	{
		System.out.println("Vehiclename is: "+vehiclename);
		System.out.println("Seating capacity is: "+loadcapacity);
		System.out.println("Year of manufacture is: "+modelyear);
		System.out.println("Brand name is: "+brandname);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
	}
}

public class MainDemo2 {

	public static void main(String[] args) {

		Fourwheeler f1=new Fourwheeler();	
	    Twowheeler t1=new Twowheeler(); 
		Heavyvehicle h1=new Heavyvehicle();
		h1.vehiclename="Truck";
		h1.loadcapacity="Five Hundred Kgs ";
		h1.modelyear=2020;
		h1.brandname="TATA";
	}

}
