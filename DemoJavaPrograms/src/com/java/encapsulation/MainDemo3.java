package com.java.encapsulation;
class Fourwheeler
{
	String Vehiclename;
	String Seatingcapacity;
	int Speedlimit;
	String Brandname;
}
class Twowheeler
{
    String Vehiclename;
    String Seatingcapacity;
    int Modelyear;
    String Brandname;
}
class Heavyvehicle
{
	String vehiclename;
	String loadcapacity;
	int modelyear;
	String brandname;
}

public class MainDemo3 {

	public static void main(String[] args) {

		Fourwheeler f1=new Fourwheeler();
		f1.Vehiclename="Amaze";
		f1.Seatingcapacity="Five";
		f1.Speedlimit=200;
		f1.Brandname="Honda";
		
		System.out.println("Vehiclename is: "+f1.Vehiclename);
		System.out.println("Seating capacity is: "+f1.Seatingcapacity);
		System.out.println("Speed limit is: "+f1.Speedlimit);
		System.out.println("Brand name is: "+f1.Brandname);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		
	    Twowheeler t1=new Twowheeler();
	    t1.Vehiclename="RAY Z";
	    t1.Seatingcapacity="Two";
	    t1.Modelyear=2020;
	    t1.Brandname="YAMAHA";
	    

		System.out.println("Vehiclename is: "+t1.Vehiclename);
		System.out.println("Seating capacity is: "+t1.Seatingcapacity);
		System.out.println("Year of manufacture is: "+t1.Modelyear);
		System.out.println("Brand name is: "+t1.Brandname);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		 
		Heavyvehicle h1=new Heavyvehicle();
		h1.vehiclename="Truck";
		h1.loadcapacity="Five Hundred Kgs ";
		h1.modelyear=2020;
		h1.brandname="TATA";
		
		System.out.println("Vehiclename is: "+h1.vehiclename);
		System.out.println("Seating capacity is: "+h1.loadcapacity);
		System.out.println("Year of manufacture is: "+h1.modelyear);
		System.out.println("Brand name is: "+h1.brandname);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		
				
	}

}
