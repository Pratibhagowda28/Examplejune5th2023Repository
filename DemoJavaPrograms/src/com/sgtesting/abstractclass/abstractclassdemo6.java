package com.sgtesting.abstractclass;
abstract class hybridinheritance
{
	abstract void collegename(String name);
	abstract void branchname(String name);
}
class hybridinheritance1 extends hybridinheritance
{
	void collegename(String name)
	{
		System.out.println("college name is: "+name);
	}
	void branchname(String name)
	{		
		System.out.println("branch name is: "+name);		
	}
}
class hybridinheritance2 extends hybridinheritance1
{
	
}
class hybridinheritance3 extends hybridinheritance
{
	void collegename(String name)
	{
		System.out.println("college name is: "+name);
	}
	void branchname(String name)
	{		
		System.out.println("branch name is: "+name);		
	}
}

public class abstractclassdemo6 {

	public static void main(String[] args) {
		hybridinheritance2 o=new hybridinheritance2();
		o.collegename("SIET");
		o.branchname("EEE");
		hybridinheritance3 o1=new hybridinheritance3();
		o1.collegename("SIT");
		o1.branchname("ECE");

	}

}
