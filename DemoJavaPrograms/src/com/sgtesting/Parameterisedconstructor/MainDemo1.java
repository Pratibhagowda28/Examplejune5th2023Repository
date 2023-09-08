package com.sgtesting.Parameterisedconstructor;
class Employee
{
	int empid;
	String empname;
	int salary;
	String job;
	Employee(int eid,String ename,int sal,String ejob)
	{
		empid=eid;
		empname=ename;
		salary=sal;
		job=ejob;
		{
		System.out.println("Emp id: "+empid);
		System.out.println("Emp name: "+empname);
		System.out.println("Emp salary: "+salary);
		System.out.println("Emp job: "+job);
		System.out.println("+++++++++++++++++++++++++++++++++");
		}
	}	
}
class Deptname
{
	int Deptno;
	String Deptname;
	int Salary;
	String job;
	Deptname(int dno,String dname,int sal, String djob)
	{
		Deptno=dno;
		Deptname=dname;
		Salary=sal;
		job=djob;
	{
		System.out.println("Deptno: "+Deptno);
		System.out.println("Dept name: "+Deptname);
		System.out.println("salary: "+Salary);
		System.out.println("Dept job: "+job);
		System.out.println("+++++++++++++++++++++++++++++++++");
	   
	}
	}
}
class Insurance
{
	String Type;
	int id;
	String term;
	String validity;
	Insurance(String Itype,int Iid, String Iterm,String val)
	{
		Type=Itype;
		id=Iid;
		term=Iterm;
		validity=val;
		
	{
		System.out.println("Insurance type: "+Type);
		System.out.println("Insurance ID: "+id);
		System.out.println("Insurance Term: "+term);
		System.out.println("Insurance Validity: "+validity);
		System.out.println("+++++++++++++++++++++++++++++++++");
	}
	}
}

public class MainDemo1 {

	public static void main(String[] args) {

	    Employee e1=new Employee(10,"Kumar",50000,"Analyst");
		Deptname d1=new Deptname(11,"KEB",50000,"Asst. Engineer");
		Insurance i1=new Insurance("Health Insurance",1001,"Two years","Five years");

	}

}
