package com.sgtesting.inheritance;
class Employee1
{
	Employee1(String name,int id,int salary)
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
	}
}
class Department extends Employee1
{
	Department(String name,int id,int salary,int age)

	{
		super(name,id,salary);
		System.out.println(age);

	}
}
class Employee3 extends Department
{
	Employee3(String name,int id,int salary,int age,String office)
	{
		super(name,id,salary,age);

		System.out.println(office);
	}
}

public class Questioninheritance1 {

	public static void main(String[] args) {
		Employee3 o=new Employee3("Santhosh",20,5000,200,"H.P");




	}

}
