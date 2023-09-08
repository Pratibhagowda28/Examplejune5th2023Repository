package com.sgtesting.inheritance;
class student1
{
	student1(String name,int age)
	{
		System.out.println(name);
		System.out.println(age);
	}
}
class library1 extends student1
{
	String bookname;
	library1(String name,int age,String bookname)
	{
		super(name,age);
		this.bookname=bookname;
		System.out.println(bookname);
		
	}
}

public class inheritancedemo1 {

	public static void main(String[] args) {
		library1 o=new library1("Santhosh",20,"CoreJava");
		
		
	}

}
