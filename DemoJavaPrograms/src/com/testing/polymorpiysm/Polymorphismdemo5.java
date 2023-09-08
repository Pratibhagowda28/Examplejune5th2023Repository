package com.testing.polymorpiysm;
abstract class University
{
	abstract void course();
}
class BSc extends University
{
	void course()
	{
		System.out.println("The course name is BSc");
	}
}
class Bcom extends University
{
	void course()
	{
		System.out.println("The course name is Bcom");
	}
}
class BA extends University
{
	void course()
	{
		System.out.println("The course name is BA");
	}
}
class BCA extends University
{
	void course()
	{
		System.out.println("The course name is BCA");
	}
}

public class Polymorphismdemo5 {

	public static void main(String[] args) {
		University obj=null;
		BSc o1=new BSc();
		Bcom o2=new Bcom();
		BA o3=new BA();
		BCA o4=new BCA();
		
		obj=o1;
		o1.course();
		obj=o2;
		o2.course();
		obj=o3;
		o3.course();
		obj=o4;
		o4.course();
		
		
		
		
		
	}

}
