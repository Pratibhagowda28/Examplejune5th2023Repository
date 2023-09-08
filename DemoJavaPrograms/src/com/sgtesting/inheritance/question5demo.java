package com.sgtesting.inheritance;
class  studentdemo
{
	studentdemo(String name,int id)
	{
		System.out.println("The name of cstudent is: "+name);
		System.out.println("The id: "+id);
	}
	
}
class libraryclg extends studentdemo
{
	libraryclg(String name,int id)
	{
		super(name,id);		
	}
}

public class question5demo {

	public static void main(String[] args) {
		libraryclg o=new libraryclg("Kumar",21);
	}

}
