package com.javatest1.programs;
class demo18
{
	void displaydancename(String name)
	{
		System.out.println("The dance name: "+name);
	}
	void displaydancefees(int fees)
	{
		System.out.println("Fees: "+fees);
	}
}
class demo19
{
	demo19()
	{
		demo18 o=new demo18();
		o.displaydancename("classical");
		o.displaydancefees(2000);
	}
}
public class Question10demo {

	public static void main(String[] args) {
		demo19 o=new demo19();
	}

}
