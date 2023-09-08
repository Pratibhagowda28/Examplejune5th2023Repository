package com.sgtesting.interfacedemo;
interface demo1
{
	void displayfruitsname(String name);
	
}
interface demo2
{
	void displayvegetablename(String name);
}
interface demo3
{
	void displaynutsname(String name);
}
abstract class lentils
{
	abstract void showlentilname(String name);
}
class allroundfamily extends lentils implements demo1,demo2,demo3

{
	public void displayfruitsname(String name)
	{
		System.out.println("The Fruit name is: "+name);	
	}
	public void displayvegetablename(String name)
	{
		System.out.println("The vegetable name is: "+name);	

	}
	public void displaynutsname(String name)
	{
		System.out.println("The nuts name is: "+name);	

	}
	void showlentilname(String name)
	{
		System.out.println("The lentil name is: "+name);
	}
	
}

public class interfacedemo7 {

	public static void main(String[] args) {
		allroundfamily o=new allroundfamily();
		o.displayfruitsname("Mango");
		o.displayvegetablename("Carrot");
		o.displaynutsname("Cashew");
		o.showlentilname("Channa");
		
		
		
	}

}
