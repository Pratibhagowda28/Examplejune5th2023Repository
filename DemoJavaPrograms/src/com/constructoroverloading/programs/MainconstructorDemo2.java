package com.constructoroverloading.programs;
class College
{
	College(String name,String location)
	{
		System.out.println("College name is "+ name);
		System.out.println("College location: "+location);
		
		
	}
	College(int numofbranches,int numofstudents)
	{
		System.out.println("Number of branches: "+ numofbranches);
		System.out.println("UNumber of Students: "+numofstudents);
		
	}
	College(int yearofestablished)
	{
		System.out.println("Established in year: "+yearofestablished);
	
	}

	College(String toppername,String president,int fees)
	{
		System.out.println("Toppername "+ toppername);
		System.out.println("President: "+president);
		System.out.println("fees: "+fees);
	}
}
public class MainconstructorDemo2 {

	public static void main(String[] args) {
		College c1=new College("SSPUCW","TUMKUR");
		College c2=new College(10,50000);
		College c3=new College(1960);
		College c4=new College("Archana","Ramesh",20000);



	}

}
