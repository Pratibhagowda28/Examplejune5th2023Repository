package com.sgtesting.abstractclass;
abstract class Sample1
{
	static void displaycityname(String cityname)
	{
		System.out.println("The name of the city is: "+cityname);
	}
	static void displayareaname(String areaname)
	{
		System.out.println("The name of the area is: "+areaname);
	}
}
class Sample2 extends Sample1
{
	
}

public class abstractclassdemo1 {

	public static void main(String[] args) {
		Sample2.displaycityname("Bangalore");
		Sample2.displayareaname("Vijayanagar");
	}

}
