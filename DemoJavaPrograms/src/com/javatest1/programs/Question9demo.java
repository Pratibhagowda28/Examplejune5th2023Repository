package com.javatest1.programs;
class demo16
{
	{
		System.out.println("Instance block");
	}
	demo16(String name)
	{
		System.out.println("Name: "+name);
	}
}
class demo17
{
	static
	{
		System.out.println("Static block");
		demo16 o=new demo16("Mahesh");
	}
}

public class Question9demo {

	public static void main(String[] args) {
		demo17 o=new demo17();
		
	}

}
