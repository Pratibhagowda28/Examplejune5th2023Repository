package com.constructorchaining.programs;

class Product
{
	Product(String pname,int price)
	{

		System.out.println("Product name is "+pname);
		System.out.println("Price "+price);
	}
	Product(int prodid)
	{
		this("Lenovo",2000);
		System.out.println("Product id: "+prodid);
	}
}	
public class DemoConstructorchain1 {

	public static void main(String[] args) {

		Product p1=new Product(200);
	}

}
