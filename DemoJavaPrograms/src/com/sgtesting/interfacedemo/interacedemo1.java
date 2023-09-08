package com.sgtesting.interfacedemo;
interface university
{
	void showuniversityname(String name);
	void showcollegename(String name);
}
class enggcollege implements university
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
	
}

public class interacedemo1 {

	public static void main(String[] args) {
		enggcollege o=new enggcollege();
		o.showuniversityname("VTU");
		o.showcollegename("SIT");
		o.displayaddress("Batwadi tumkur");
		
				
	}

}
