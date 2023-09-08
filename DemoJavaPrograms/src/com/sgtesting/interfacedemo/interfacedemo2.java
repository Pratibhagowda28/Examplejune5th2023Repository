package com.sgtesting.interfacedemo;
interface university5
{
	void showuniversityname(String name);
	void showcollegename(String name);
}
interface library
{
	void showlibraryname(String name);
	
}
class enggcollege5 implements university5, library
{
	public void showuniversityname(String name)
	{
		System.out.println("University name: "+name);
	}
	public void showcollegename(String name)
	{
		System.out.println("College name is: "+name);
	}
	void displayaddress(String address)
	{
		System.out.println("Address: "+ address);
	}
public	void showlibraryname(String name)
	{
		System.out.println("Library name is: "+name);
	}
	
}

public class interfacedemo2 {

	public static void main(String[] args) {
		enggcollege5 o=new enggcollege5();
		o.showuniversityname("VTU");
		o.showcollegename("SIT");
		o.displayaddress("Batwadi tumkur");
		o.showlibraryname("Saraswathi");
		
	}

}
