package com.constructoroverloading.programs;
class Student
{
	Student(String name)
	{
		System.out.println("Student name is "+ name);
		
	}
	Student(int branch)
	{
		System.out.println("Branch: "+ branch);
	
		
	}
	Student(double result)
	{
		System.out.println("Result: "+result);
	
	}

	Student(String section,int id)
	{
		System.out.println("section "+ section);
		System.out.println("id: "+id);
		
	}
}
public class MainConstructorDemo3 {

	public static void main(String[] args) {
		Student u1=new Student("Ram");
		Student u2=new Student("EEE");
		Student u3=new Student(67.23);
		Student u4=new Student("c scection",101);



	}

}
