package com.javatest1.programs;
class demo1
{
	int id;
	int salary;
	static String name;
	static String job;
}
class demo2
{
    demo2(int id, int salary)
    {   
    	//id=21;
    	//salary=2000;
    	demo1.name="Santhosh";
    	demo1.job="Analyst";
    	System.out.println("ID: "+id);
    	System.out.println("Salary: "+salary);
    	System.out.println("NAme: "+demo1.name);
    	System.out.println("NAme: "+demo1.job);

    	
    }    
}

public class Question1demo {

	public static void main(String[] args) {
		demo2 o=new demo2(21,2000);
		
	}

}
