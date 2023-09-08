package com.sgtesting.interfacedemo;
//we cannot create an object or instance for interface, instead we can give object reference.
interface dance1
{
	void showdancetype(String type);
	
}
class instrument1 implements dance1
{
	public void showdancetype(String type)
	{
		System.out.println("Dance type: "+ type);
	}
  void showmusictype(String type)
	{
		System.out.println("Music type: "+type);
	}
}

public class interfacedemo4 {

	public static void main(String[] args) {
		dance1 o=new instrument1();
		o.showdancetype("folk");
		
	}

}
