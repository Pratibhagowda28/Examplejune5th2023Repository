package com.java.encapsulation;
class Fruits
{
	String Fruitname;
	String Fruitfamily;
	int Priceperkg;
	String Fruitcolor;
}
class Flowers
{
	String Flowername;
	String Flowercolor;
	int priceperkg;
	String Flowerfamily;
}
class Vegetables
{
	String Vegetablename;
	String Vegetablefamily;
	int Priceperkg;
	String Vegetablecolor;
}


public class MainDemo4 {

	public static void main(String[] args) {
		Fruits f1=new Fruits();
		f1.Fruitname="Apple";
		f1.Fruitfamily="Rosaceae";
		f1.Priceperkg=200;
		f1.Fruitcolor="Red";
		
		System.out.println("The Fruit name is: "+f1.Fruitname);
		System.out.println("The Fruit family name is: "+f1.Fruitfamily);
		System.out.println("Price per kg is: "+f1.Priceperkg);
		System.out.println("The Fruit Color is: "+f1.Fruitcolor);
		System.out.println("----------------------------------------");
		
		Flowers f2=new Flowers();
		f2.Flowername= "Marigold";
		f2.Flowercolor="Yellow";
		f2.priceperkg=100;
		f2.Flowerfamily="Daisy";
		
		System.out.println("The Flower name is: "+f2.Flowername);
		System.out.println("The Flower color is: "+f2.Flowercolor);
		System.out.println("Price per kg is: "+f2.priceperkg);
		System.out.println("The Flower family is: "+f2.Flowerfamily);
		System.out.println("----------------------------------------");
		
		Vegetables v1=new Vegetables();
		v1.Vegetablename="Carrot";
		v1.Vegetablefamily="Aiaceae";
		v1.Priceperkg=100;
		v1.Vegetablecolor="Orange";
		
		System.out.println("The vegetable name is: "+v1.Vegetablename);
		System.out.println("The Vegetable family is: "+v1.Vegetablefamily);
		System.out.println("Price per kg is: "+v1.Priceperkg);
		System.out.println("The Vegetable color is: "+v1.Vegetablecolor);
		System.out.println("----------------------------------------");
	
	}

}
