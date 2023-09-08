package com.sgtesting.interfacedemo;
//an interface can extends another interface.
interface dance
{
	void showdancetype(String type);
	
}
interface music extends dance
{
	void showmusictype(String type);
	
}
class instrument implements dance,music
{
	public void showdancetype(String type)
	{
		System.out.println("Dance type: "+ type);
	}
	public void showmusictype(String type)
	{
		System.out.println("Music type: "+type);
	}
	void Instrumenttype(String name)
	{
		System.out.println("Instrument type: "+name);
	}
	
}

public class interfacedemo3 {

	public static void main(String[] args) {
		instrument o=new instrument();
		o.showdancetype("Bharathanatyam");
		o.showmusictype("Classical");
		o.Instrumenttype("Guitar");
	}

}
