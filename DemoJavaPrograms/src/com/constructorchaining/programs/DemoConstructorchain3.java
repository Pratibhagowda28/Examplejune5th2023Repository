package com.constructorchaining.programs;
class Customer
{
	Customer(String pname,String location)
	{

		System.out.println("Product name is "+pname);
		System.out.println("Location: "+location);
	}
	Customer(int customerid)
	{
		this("Dell","Delhi");
		System.out.println("customer id: "+customerid);
	}
}	
public class DemoConstructorchain3 {

	public static void main(String[] args) {
		Customer c1=new Customer(201);

	}

}
