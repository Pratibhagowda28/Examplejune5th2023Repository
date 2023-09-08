package com.javatest1.programs;
class demo12
{
	void displayid(int id)
	{
		System.out.println("ID: "+id);
	}
	static void displayname(String name)
	{
		System.out.println("Name: "+name);
	}
}
class demo13
{
	demo13()
	{
		int id;String name;
		demo12 o=new demo12();
		o.displayid(20);
		o.displayname("Kumar");
	
		
	}
}

public class Question7demo {

	public static void main(String[] args) {
		demo13 o=new demo13();
		
	}

}
