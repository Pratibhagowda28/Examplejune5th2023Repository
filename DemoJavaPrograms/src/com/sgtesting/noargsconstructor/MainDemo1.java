package com.sgtesting.noargsconstructor;

class Employee
{
	int empid=10;
	String empname="Kumar";
	int salary=50000;
	String job="consultant";
	Employee()
	{
		System.out.println("Emp id: "+empid);
		System.out.println("Emp name: "+empname);
		System.out.println("Emp salary: "+salary);
		System.out.println("Emp job: "+job);
		System.out.println("+++++++++++++++++++++++++++++++++");
	}	
}
class Deptname
{
	int Deptno=15;
	String Deptname="KEB";
	int Salary=5000;
	String job=	"Analyst";
	Deptname()
	{
		System.out.println("Deptno: "+Deptno);
		System.out.println("Dept name: "+Deptname);
		System.out.println("salary: "+Salary);
		System.out.println("Dept job: "+job);
		System.out.println("+++++++++++++++++++++++++++++++++");
	}
}
class Insurance
{
	String Type="Vehicle Insurance";
	int id=105;
	String term="One year";
	String validity="Two year";
	Insurance()
	{
		System.out.println("Insurance type: "+Type);
		System.out.println("Insurance ID: "+id);
		System.out.println("Insurance Term: "+term);
		System.out.println("Insurance Validity: "+validity);
		System.out.println("+++++++++++++++++++++++++++++++++");
	}
}

public class MainDemo1 {

	public static void main(String[] args) {

	//	Employee e1=new Employee();
		//Deptname d1=new Deptname();
		//Insurance i1=new Insurance();
	}

}
