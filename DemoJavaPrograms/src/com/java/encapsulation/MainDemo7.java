package com.java.encapsulation;
//If a class doesnot have any instance variables, even though we can define parameterized
//constructor.
class customer 
{
	customer(String customername,int customerid)
	{
		System.out.println("Customer name: "+customername);
		System.out.println("Customer id: "+customerid);
	}
}
public class MainDemo7 {

	public static void main(String[] args) {
		customer c1=new customer("Kumar",102);
		customer c2=new customer("Prabha",103);

	}

}
