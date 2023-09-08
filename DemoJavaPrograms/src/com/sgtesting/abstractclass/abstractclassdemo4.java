package com.sgtesting.abstractclass;
abstract class displaystatename
{
	abstract void statename(String name);
	abstract void districtname(String name);	
}
class displaynames extends displaystatename
{
	void statename(String name)
	{
		System.out.println("State name is: "+name);
	}
	void districtname(String name)
	{
		System.out.println("district name is: "+name);
	}	
}

public class abstractclassdemo4 {

	public static void main(String[] args) {
		displaynames o=new displaynames();
		o.statename("Karnataka");
		o.districtname("Tumkur");
	}

}
