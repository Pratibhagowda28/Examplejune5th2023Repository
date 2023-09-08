package com.sgtesting.noargsconstructor;



class Desktop
{
	String Desktopname="i5 8thgen";
	String Brandname="Dell";
	int Priceinrupees=100000;
	String Desktopcolor="Black";
	Desktop()
	{
		System.out.println("The Desktop name is: "+Desktopname);
		System.out.println("The Brand name is: "+Brandname);
		System.out.println("Price in rupees: "+Priceinrupees);
		System.out.println("The Desktop Color is: "+Desktopcolor);
		System.out.println("----------------------------------------");
		
	}
}
class Laptop
{
	String Laptopname="i3 5thgen";
	String LaptopBrand="Dell";
	int priceinrupees=80000;
	String Laptopcolor="Grey";
	Laptop()
	{
		System.out.println("The Laptop name is: "+Laptopname);
		System.out.println("The Laptop Brand is: "+LaptopBrand);
		System.out.println("Price in rupees: "+priceinrupees);
		System.out.println("The Laptop color is: "+Laptopcolor);
		System.out.println("----------------------------------------");
	}
}
class Mobilephone
{
	String Mobilephonename="VIVO";
	String Brandname="Samsung";
	int Priceinrupees=20000;
	String color="blue";
	Mobilephone()
	{
		System.out.println("The Mobilephone name is: "+Mobilephonename);
		System.out.println("The Brand name is: "+Brandname);
		System.out.println("Price in rupees: "+Priceinrupees);
		System.out.println("The Mobilephone color is: "+color);
		System.out.println("----------------------------------------");
	}
}


public class MainDemo4 {

	public static void main(String[] args) {
		Desktop d1=new Desktop();		
		Laptop l1=new Laptop();
		Mobilephone m1=new Mobilephone();
	}
		 
}
