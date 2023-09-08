package com.sgtesting.Parameterisedconstructor;

class Desktop
{
	String Desktopname;
	String Brandname;
	int Priceinrupees;
	String Desktopcolor;
	Desktop(String dname,String bname,int pinrupee,String dcolor)
	{
		Desktopname=dname;
		Brandname=bname;
		Priceinrupees=pinrupee;
		Desktopcolor=dcolor;
		
		System.out.println("The Desktop name is: "+Desktopname);
		System.out.println("The Brand name is: "+Brandname);
		System.out.println("Price in rupees: "+Priceinrupees);
		System.out.println("The Desktop Color is: "+Desktopcolor);
		System.out.println("----------------------------------------");
	}
}
class Laptop
{
	String Laptopname;
	String LaptopBrand;
	int priceinrupees;
	String Laptopcolor;
	Laptop(String lname,String lbrand,int pinrupee,String Lcolor)
	{
		Laptopname=lname;
		LaptopBrand=lbrand;
		priceinrupees=pinrupee;
		Laptopcolor=Lcolor;
		
		System.out.println("The Laptop name is: "+Laptopname);
		System.out.println("The Laptop Brand is: "+LaptopBrand);
		System.out.println("Price in rupees: "+priceinrupees);
		System.out.println("The Laptop color is: "+Laptopcolor);
		System.out.println("----------------------------------------");
	}
}
class Mobilephone
{
	String Mobilephonename;
	String Brandname;
	int Priceinrupees;
	String color;
	Mobilephone(String mname,String bname,int mprice,String mcolor)
	{
		Mobilephonename=mname;
		Brandname=bname;
		Priceinrupees=mprice;
	    color=mcolor;
		
		System.out.println("The Mobilephone name is: "+Mobilephonename);
		System.out.println("The Brand name is: "+Brandname);
		System.out.println("Price in rupees: "+Priceinrupees);
		System.out.println("The Mobilephone color is: "+color);
		System.out.println("----------------------------------------");


	}

}

public class MainDemo4 {

	public static void main(String[] args) {
		Desktop d1=new Desktop("i5 3gen","Dell",100000,"Black");		
		Laptop l1=new Laptop("i3 5thgen","Dell",80000,"Grey");
		Mobilephone m1=new Mobilephone("VIVO","Samsung",20000,"blue");
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
