package com.sgtesting.inheritance;
class student

{
	student(String firstname,int age)
	{
		System.out.println(firstname);
		System.out.println(age);		
	}
}
class library extends student
{
	library(String firstname,int age)
	{
		super(firstname,age);
	}
	
}

public class specialcasedemo {

	public static void main(String[] args) {
		library o=new library("Santhosh",20);
		library o1=new library("ram",25);
		
	}

}
