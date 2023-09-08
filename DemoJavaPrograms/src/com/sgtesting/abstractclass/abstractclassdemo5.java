package com.sgtesting.abstractclass;
abstract class multileveldemo
{
	abstract void displaydacetype(String type);
	abstract void musictype(String type);
	abstract void instrumenttype(String type);
}
class multileveldemo2 extends multileveldemo
{
	void displaydacetype(String type)
	{
		System.out.println("Dance type is: "+type);
	}

	void musictype(String type)
	{
		System.out.println("Music type is: "+type);
	}
	void instrumenttype(String type)
	{
		System.out.println("Instrument type is: "+type);
	}
	
}
class multileveldemo3 extends multileveldemo2
{
	
}

public class abstractclassdemo5 {

	public static void main(String[] args) {
		multileveldemo3 o= new multileveldemo3();
		o.displaydacetype("Kathak");
		o.musictype("Karnatic");
		o.instrumenttype("Guitar");
	}

}
