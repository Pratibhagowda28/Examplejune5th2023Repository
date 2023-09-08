package com.java.encapsulation;
//if we can assign parameter value to an instance variable in this case the value
//stored in a instance variable can be used across the whole class.
class employeeone
{
	int empno;String ename;String jobname;int salary;
	employeeone(int eno,String name,String job,int sal)
	{
		empno=eno;ename=name;jobname=job;salary=sal;
		System.out.println("Employee number: "+empno);
		System.out.println("Employee name: "+ename);
		System.out.println("Employee jobname: "+jobname);
		System.out.println("Employee salary: "+salary);

	}

	void display()
	{
		System.out.println("Employee number: "+empno);
		System.out.println("Employee name: "+ename);
		System.out.println("Employee jobname: "+jobname);
		System.out.println("Employee salary: "+salary);
	}
}

	public class MainDemo8 {

		public static void main(String[] args) {

			employeeone e1=new employeeone(100,"kumar","Analyst",50000);
					e1.display();
		}

	}
