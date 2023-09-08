package com.javatest1.programs;
//class demo1 has 2 instance methods,demo 2 has 1 instance method,
//execute demo 1 instance method in demo 2 instance method.
class demo3
{
	void method1()
	{
		int age=20;
		int salary=2000;
		System.out.println("age: "+age);
		System.out.println("Slary: "+salary);
	}
	void method2()
	{
		String name="Santhosh";
		String job="Clerk";
		System.out.println("Name: "+name);
		System.out.println("Job: "+job);
	}
}
class demo4
{
	void method3()
	{
		String dept="KEB";
		System.out.println("Department name: "+ dept);
		demo3 o=new demo3();
		o.method1();
		o.method2();
	}			
}

public class Question2demo {

	public static void main(String[] args) {
		demo4 o1=new demo4();
		o1.method3();
	}

}
