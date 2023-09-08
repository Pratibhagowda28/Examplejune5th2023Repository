package com.sgtesting.Parameterisedconstructor;

class Fourwheeler
{
	String Vehiclename;
	String Seatingcapacity;
	int Speedlimit;
	String Brandname;
	Fourwheeler(String vname,String scap ,int slimit,String bname)
	{
		Vehiclename=vname;
		Seatingcapacity=scap;
		Speedlimit=slimit;
		Brandname=bname;

		System.out.println("Vehiclename is: "+Vehiclename);
		System.out.println("Seating capacity is: "+Seatingcapacity);
		System.out.println("Speed limit is: "+Speedlimit);
		System.out.println("Brand name is: "+Brandname);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		
	}
	
}
class Twowheeler
{
    String Vehiclename;
    String Seatingcapacity;
    int Modelyear;
    String Brandname;
    Twowheeler(String vname1,String scap1,int myear,
    		String bname1)
    {
    	Vehiclename=vname1;
    	Seatingcapacity=scap1;
    	Modelyear=myear;
    	Brandname=bname1;
    
    
    	System.out.println("Vehiclename is: "+Vehiclename);
		System.out.println("Seating capacity is: "+Seatingcapacity);
		System.out.println("Year of manufacture is: "+Modelyear);
		System.out.println("Brand name is: "+Brandname);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
    		
}
class Heavyvehicle
{
	String vehiclename;
	String loadcapacity;
	int modelyear;
	String brandname;
	Heavyvehicle(String vname2,String lcap,int myear1,String bname1)
	{
		
		vehiclename=vname2;
		loadcapacity=lcap;
		modelyear=myear1;
		brandname=bname1;
		
		System.out.println("Vehiclename is: "+vehiclename);
		System.out.println("Seating capacity is: "+loadcapacity);
		System.out.println("Year of manufacture is: "+modelyear);
		System.out.println("Brand name is: "+brandname);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
	}
		
}

public class MainDemo2 {

	public static void main(String[] args) {

		Fourwheeler f1=new Fourwheeler("Amaze","five",200,"HONDA");	
	    Twowheeler t1=new Twowheeler("RAY Z","Two",2020,"YAMAHA"); 
		Heavyvehicle h1=new Heavyvehicle("TRUCK","200 Kgs",2020,"TATA");
	

	}

}
