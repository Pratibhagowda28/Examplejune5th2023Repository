package com.java.encapsulation;
class Desktop
{
	String Desktopname;
	String Brandname;
	int Priceinrupees;
	String Desktopcolor;
}
class Laptop
{
	String Laptopname;
	String LaptopBrand;
	int priceinrupees;
	String Laptopcolor;
}
class Mobilephone
{
	String Mobilephonename;
	String Brandname;
	int Priceinrupees;
	String color;
}


public class MainDemo5 {

	public static void main(String[] args) {
		Desktop d1=new Desktop();
		d1.Desktopname="i5 8thgen";
		d1.Brandname="Dell";
		d1.Priceinrupees=100000;
		d1.Desktopcolor="black";
		
		System.out.println("The Desktop name is: "+d1.Desktopname);
		System.out.println("The Brand name is: "+d1.Brandname);
		System.out.println("Price in rupees: "+d1.Priceinrupees);
		System.out.println("The Desktop Color is: "+d1.Desktopcolor);
		System.out.println("----------------------------------------");
		
		Laptop l1=new Laptop();
		l1.Laptopname="i3 5th gen";
		l1.LaptopBrand="Dell";
		l1.priceinrupees=80000;
		l1.Laptopcolor="Grey";
	
		System.out.println("The Laptop name is: "+l1.Laptopname);
		System.out.println("The Laptop Brand is: "+l1.LaptopBrand);
		System.out.println("Price in rupees: "+l1.priceinrupees);
		System.out.println("The Laptop color is: "+l1.Laptopcolor);
		System.out.println("----------------------------------------");
		
		Mobilephone m1=new Mobilephone();
		m1.Mobilephonename="VIVO";
		m1.Brandname="Samsung";
		m1.Priceinrupees=20000;
		m1.color="blue";
		
		System.out.println("The Mobilephone name is: "+m1.Mobilephonename);
		System.out.println("The Brand name is: "+m1.Brandname);
		System.out.println("Price in rupees: "+m1.Priceinrupees);
		System.out.println("The Mobilephone color is: "+m1.color);
		System.out.println("----------------------------------------");
	}

}
