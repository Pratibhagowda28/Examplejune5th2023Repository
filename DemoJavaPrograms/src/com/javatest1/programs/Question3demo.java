package com.javatest1.programs;
class demo5
{
	static 
	{
		System.out.println("First Static block");
	}
	static 
	{
		System.out.println("Second Static block");
	}
	static 
	{
		System.out.println("Third Static block");
	}
}

public class Question3demo {

	public static void main(String[] args) {
		demo5 o=new demo5();
	}

}
