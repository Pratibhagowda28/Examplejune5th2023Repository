package com.javatest1.programs;
class demo8
{
	{
		System.out.println("The First Instance block");
	}
	static
	{
		System.out.println("The First static block");
    }
}
class demo9
{
	demo9(String name)
	{
		demo8 o=new demo8();
		System.out.println("NAme:"+name);
	}
	
}

public class Question5demo {

	public static void main(String[] args) {
    demo9 o=new demo9("Kumar");

	}

}
