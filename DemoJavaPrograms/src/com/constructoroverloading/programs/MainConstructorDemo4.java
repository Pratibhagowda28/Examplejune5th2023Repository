package com.constructoroverloading.programs;
class Employee
{
	Employee(String name,String officelocation)
	{
		System.out.println("Employee name is "+ name);
		System.out.println("University location: "+officelocation);
		
	}
	Employee(int salary,int numofworkingdays)
	{
		System.out.println("Salary: "+ salary);
		System.out.println("Number of workingdays: "+numofworkingdays);
		
	}
	Employee(int id)
	{
		System.out.println("ID: "+id);
	
	}

	Employee(String job,int deptno)
	{
		System.out.println("Job: "+ job);
		System.out.println("Department num: "+deptno);
		
	}
}
public class MainConstructorDemo4 {

	public static void main(String[] args) {
		Employee u1=new Employee("Akul","Belgaum");
		Employee u2=new Employee(20000,25);
		Employee u3=new Employee(401);
		Employee u4=new Employee("Analyst",201);

	}

}
