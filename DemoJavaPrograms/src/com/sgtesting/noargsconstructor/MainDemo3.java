package com.sgtesting.noargsconstructor;

class Fruits
{
	String Fruitname="Appple";
	String Fruitfamily="Rosaceae";
	int Priceperkg=200;
	String Fruitcolor="Red";
	Fruits()
	{
		System.out.println("The Fruit name is: "+Fruitname);
		System.out.println("The Fruit family name is: "+Fruitfamily);
		System.out.println("Price per kg is: "+Priceperkg);
		System.out.println("The Fruit Color is: "+Fruitcolor);
		System.out.println("----------------------------------------");
	}
}
class Flowers
{
	String Flowername="Marigold";
	String Flowercolor="Yellow";
	int priceperkg=100;
	String Flowerfamily="Daisy";
	Flowers()
	{

		System.out.println("The Flower name is: "+Flowername);
		System.out.println("The Flower color is: "+Flowercolor);
		System.out.println("Price per kg is: "+priceperkg);
		System.out.println("The Flower family is: "+Flowerfamily);
		System.out.println("----------------------------------------");	
	}
}
class Vegetables
{
	String Vegetablename="Carrot";
	String Vegetablefamily="Aiaceae";
	int Priceperkg=100;
	String Vegetablecolor="Orange";
	Vegetables()
	{
		System.out.println("The vegetable name is: "+Vegetablename);
		System.out.println("The Vegetable family is: "+Vegetablefamily);
		System.out.println("Price per kg is: "+Priceperkg);
		System.out.println("The Vegetable color is: "+Vegetablecolor);
		System.out.println("----------------------------------------");
	}
}


public class MainDemo3 {

	public static void main(String[] args) {
		Fruits f1=new Fruits();	
		Flowers f2=new Flowers();
		Vegetables v1=new Vegetables();
	}

}
