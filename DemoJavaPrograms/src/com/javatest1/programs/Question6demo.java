package com.javatest1.programs;
class demo10
{
	void displayname(String name)
	{
		System.out.println("Name: "+name);
	}
	{
		System.out.println("The Instance block");
	}
}
class demo11
{
	static
	{
		demo10 o=new demo10();
		o.displayname("Kumar");
		
		System.out.println("Static block");
	}
}

public class Question6demo {

	public static void main(String[] args) {
		demo11 o=new demo11();
	}

}
