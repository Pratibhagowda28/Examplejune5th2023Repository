package com.java.encapsulation;

class Employee
{
	int empid;
	String empname;
	int salary;
	String job;
}
class Deptname
{
	int Deptno;
	String Deptname;
	int Salary;
	String job;	
}
class Insurance
{
	String Type;
	int id;
	String term;
	String validity;
}

public class MainDemo2 {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.empid=10;
		e1.empname="Kumar";
		e1.salary=50000;
		e1.job="Consultant";

		System.out.println("Emp id: "+e1.empid);
		System.out.println("Emp name: "+e1.empname);
		System.out.println("Emp salary: "+e1.salary);
		System.out.println("Emp job: "+e1.job);
		System.out.println("+++++++++++++++++++++++++++++++++");


		Deptname d1=new Deptname();
		d1.Deptno=15;
		d1.Deptname="KEB";
		d1.Salary=5000;
		d1.job="Analyst";

		System.out.println("Deptno: "+d1.Deptno);
		System.out.println("Dept name: "+d1.Deptname);
		System.out.println("salary: "+d1.Salary);
		System.out.println("Dept job: "+d1.job);
		System.out.println("+++++++++++++++++++++++++++++++++");

		Insurance i1=new Insurance();
		i1.Type="Vehicle Insurance";
		i1.id=105;
		i1.term="One Year";
		i1.validity="Two Year";

		System.out.println("Insurance type: "+i1.Type);
		System.out.println("Insurance ID: "+i1.id);
		System.out.println("Insurance Term: "+i1.term);
		System.out.println("Insurance Validity: "+i1.validity);
		System.out.println("+++++++++++++++++++++++++++++++++");
	}

}


