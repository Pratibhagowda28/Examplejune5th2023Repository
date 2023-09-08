package com.java.encapsulation;
//using this operators for instance variables,when both instance variables and parameters
//names are same.
class employeetwo
{
	int empno;
	String ename;
	String jobname;
	int salary;
	employeetwo(int empno,String ename,String jobname,int salary)
	{
		this.empno=empno;
		this.ename=ename;
		this.jobname=jobname;
		this.salary=salary;
		
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
public class MainDemo9 {

	public static void main(String[] args) {
		employeetwo e1=new employeetwo(100,"kumar","Analyst",50000);
		e1.display();

	}

}
