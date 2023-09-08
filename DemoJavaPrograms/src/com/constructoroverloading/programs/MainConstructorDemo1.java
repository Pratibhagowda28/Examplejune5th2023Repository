package com.constructoroverloading.programs;
class University
{
	University(String name,String location,String type)
	{
		System.out.println("University name is "+ name);
		System.out.println("University location: "+location);
		System.out.println("University type: "+type);
		
	}
	University(int numofbranches,int numofstudents)
	{
		System.out.println("Number of branches: "+ numofbranches);
		System.out.println("Number of Students: "+numofstudents);
		
	}
	University(int yearofestablished)
	{
		System.out.println("Established in year: "+yearofestablished);
	
	}

	University(String toppername,String president)
	{
		System.out.println("Toppername "+ toppername);
		System.out.println("President: "+president);
		
	}
}
public class MainConstructorDemo1 {

	public static void main(String[] args) {
		University u1=new University("VTU","Belgaum","OPEN");
		University u2=new University(10,20000);
		University u3=new University(1960);
		University u4=new University("Archana","Ramesh");

	}
}



