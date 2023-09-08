package com.sgtesting.inheritance;
class capitalcitydemo
{
	void display(String cityname)
	{
		System.out.println("Capital city is: "+cityname);
	}
}
class metrocity extends capitalcitydemo
{
	metrocity(String place)
	{
		super.display(place);
	}
	void display(String cityname)
	{
		System.out.println( "metro city is: "+cityname);
	}
}

public class Superclassdemo {

	public static void main(String[] args) {
		metrocity o=new metrocity("Bangalore");
		o.display("Chennai");
	}

}
