package com.sgtesting.inheritance;
//multilevel inheritance.
class multilevelinheritancedemo
{
	multilevelinheritancedemo(String ename,int id)
	{
		System.out.println("The name of city is: "+ename);
		System.out.println("The id is: "+id);
	}

	multilevelinheritancedemo(String job)
	{
		System.out.println("job is: "+job);
	}
	multilevelinheritancedemo(int salary)
	{
		System.out.println("Salary is : "+salary);
	}	
	
}
class multilevelinheritancedemo1 extends multilevelinheritancedemo
{
	multilevelinheritancedemo1(String ename,int id)
	{
		super(ename,id);
		
	}
	multilevelinheritancedemo1(String job)
	{
		super(job);
		
	}
	multilevelinheritancedemo1(int salary)
	{
		super(salary);
		
	}
	
	
}


public class question4demo {

	public static void main(String[] args) {
		multilevelinheritancedemo1 o=new multilevelinheritancedemo1("Ram",21);
		multilevelinheritancedemo1 o1=new multilevelinheritancedemo1("Analyst");
		multilevelinheritancedemo1 o2=new multilevelinheritancedemo1(20000);
		
	}

}
