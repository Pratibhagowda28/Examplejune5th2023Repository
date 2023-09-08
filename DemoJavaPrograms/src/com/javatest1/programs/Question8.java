package com.javatest1.programs;
class demo14
{
	demo14(String name,int id)
	{
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
	}
	demo14(int salary)
	{
		System.out.println("Salary: "+salary);
	}
}
class demo15
{
	{
		demo14 o=new demo14("Kumar",20);
		demo14 o1=new demo14(200000);
		System.out.println("Instance block");
		
	}
}
public class Question8 {

	public static void main(String[] args) {
		demo15 o=new demo15();
		
	}

}
