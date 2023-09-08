package com.java.encapsulation;
//constructor overloading.
//defining more than one constructors in a class having same name. differentiated based on the number of 
//parameters,datatype and sequence of datatype.

class customer1
{
	customer1(String customername,String location)
	{
		System.out.println(customername);
		System.out.println(location);
	}
	customer1()
	{
		System.out.println("This is a no args constructor");
	}
	customer1(String location)
	{
		System.out.println(location);
	}
}
public class MainDemo10 {

	public static void main(String[] args) {
		customer1 c1=new customer1("Kumar","bangalore");
		customer1 c2=new customer1();
		customer1 c3=new customer1("Mangalore");

	}

}
