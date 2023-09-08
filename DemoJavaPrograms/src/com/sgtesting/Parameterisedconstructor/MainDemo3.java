package com.sgtesting.Parameterisedconstructor;



class Fruits
{
	String Fruitname;
	String Fruitfamily;
	int Priceperkg;
	String Fruitcolor;
	Fruits(String fname,String ffamily,int perkg,String fcolor)
	{
		Fruitname=fname;
		Fruitfamily=ffamily;
		Priceperkg=perkg;
		Fruitcolor=fcolor;

		System.out.println("The Fruit name is: "+Fruitname);
		System.out.println("The Fruit family name is: "+Fruitfamily);
		System.out.println("Price per kg is: "+Priceperkg);
		System.out.println("The Fruit Color is: "+Fruitcolor);
		System.out.println("----------------------------------------");
	}
}

class Flowers
{
	String Flowername;
	String Flowercolor;
	int priceperkg;
	String Flowerfamily;
	Flowers(String fname1, String fcolor1,int pperkg,String ffamily1)
	{
		Flowername=fname1;
		Flowercolor=fcolor1;
		priceperkg=pperkg;
		Flowerfamily=ffamily1;

		System.out.println("The Flower name is: "+Flowername);
		System.out.println("The Flower color is: "+Flowercolor);
		System.out.println("Price per kg is: "+priceperkg);
		System.out.println("The Flower family is: "+Flowerfamily);
		System.out.println("----------------------------------------");	
	}
}
class Vegetables
{
	String Vegetablename;
	String Vegetablefamily;
	int Priceperkg;
	String Vegetablecolor;
	Vegetables(String vname,String vfamily,int pperkg1,String vcolor)
	{
		Vegetablename=vname;
		Vegetablefamily=vfamily;
		Priceperkg=pperkg1;
		Vegetablecolor=vcolor;
		
		System.out.println("The vegetable name is: "+Vegetablename);
		System.out.println("The Vegetable family is: "+Vegetablefamily);
		System.out.println("Price per kg is: "+Priceperkg);
		System.out.println("The Vegetable color is: "+Vegetablecolor);
		System.out.println("----------------------------------------");
	}
}


public class MainDemo3 {

	public static void main(String[] args) {
		Fruits f1=new Fruits("Appple","Rosaceae",200,"Red");	
		Flowers f2=new Flowers("Marigold","Yellow",100,"Daisy");
		Vegetables v1=new Vegetables("Carrot","Aiaceae",100,"Orange");


	}

}
