package com.java.encapsulation;
//constructor chaining can be achieved by using this operator with paraneter passing


class Department
{
	Department(String dname)
	{
		
		System.out.println("Department name is "+dname);

	}
	Department(int deptno)
	{
		this("Accouting");
		System.out.println("Department no: "+deptno);
	}
}

	public class MainDemo11 {

		public static void main(String[] args) {
			
		Department d1=new Department(20);


		}

	}
