package com.sgtesting.stringdemo;
class student 
{
	String firstname;
	int age;
	student(String name,int sage)
	{
		firstname=name;
		age=sage;
	}
	public String toString()
	{
		return "Student name is "+ firstname+ "and age is"+ age;
	}
}

public class StringDemo3 {

	public static void main(String[] args) {
		student obj=new student("Kumar",25);
	    System.out.println(obj);
		
	}

}
