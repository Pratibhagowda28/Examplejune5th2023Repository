package com.java.encapsulation;


	class person
	{
		String name;
		int age;
	}
	class birds
	{
		String name;
		int numofwings;
	}
	class domesticanimal
	{
		String breedname;
		String Quantityofmilkgiven;
	}
	class product
	{
		String Productname;
		int Productid;
	}
	public class MainDemo1 {

	public static void main(String[] args) {
		
		person p3=new person();
		p3.name="Cherish";
		p3.age=2;
	   
	    System.out.println("The person name is "+p3.name);
	    System.out.println("The Person age is: "+p3.age);
	    System.out.println("++++++++++++++++++++++++++++");
	    
	    birds b1=new birds();
	    b1.name="parrot";
	    b1.numofwings=2;
	    
	    System.out.println("The bird name is "+b1.name);
	    System.out.println("The number of wings: "+b1.numofwings);
	    System.out.println("++++++++++++++++++++++++++++");
	    
	    domesticanimal d1=new domesticanimal();
	    d1.breedname="Cow";
	    d1.Quantityofmilkgiven="Ten Litres";
	    
	    
	    System.out.println("The Animal name is "+d1.breedname);
	    System.out.println("The Quantity of milk: "+ d1.Quantityofmilkgiven);
	    System.out.println("++++++++++++++++++++++++++++");
	    
	    product p2=new product();
	    p2.Productname="Samsung";
	    p2.Productid=1001;
	    
	    
	    System.out.println("The Product name is "+p2.Productname);
	    System.out.println("The Product id: "+ p2.Productid);
	    System.out.println("++++++++++++++++++++++++++++");
	}
}

	    
	

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		

	
