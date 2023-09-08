package com.javatest1.programs;
class demo6
{
	static
	{
		System.out.println("First Static block");
	}
}
class demo7
{
	static
	{	demo6 o=new demo6();	
		System.out.println("Second Static block");
	}
}

public class Question4demo {

	public static void main(String[] args) {

		demo7 o=new demo7();
		

	}

}
