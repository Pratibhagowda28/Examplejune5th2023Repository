package com.testing.polymorpiysm;
abstract class geometricfigure
{
	abstract void area();
}
class square extends geometricfigure
{
	void area()
	{
		int side=2;
		System.out.println("The area of square:"+ (side*side));
	}
}
class Rectangle extends geometricfigure
{
	void area()
	{
		int length=5;
		int breadth=10;
		System.out.println("The area of Rectangle:"+ (length*breadth));
	}
}
class circle extends geometricfigure
{
	void area()
	{
		double radius=12.35;
		System.out.println("The area of square:"+ (3.14*(radius*radius)));
	}
}


public class Polymorphismdemo1 {

	public static void main(String[] args) {
		geometricfigure figure=null;
		square o1=new square();
		Rectangle o2=new Rectangle();
		circle o3=new circle();
		
		figure=o1;
		figure.area();
		
	    figure=o2;
	    figure.area();
	    
	    
	    figure=o3;
	    figure.area();
	}

}
