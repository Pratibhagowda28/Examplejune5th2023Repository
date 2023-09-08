package com.testing.polymorpiysm;
abstract class birds
{
	abstract void birdscolor();
}
class peacock extends birds
{
	void birdscolor()
	{
		System.out.println("The peacock color is Green");
	}

}
class crow extends birds
{
	void birdscolor()
	{
		System.out.println("The crow color is black");
	}

}
class dove extends birds
{
	void birdscolor()
	{
		System.out.println("The dove color is white");
	}

}
class woodpecker extends birds
{
	void birdscolor()
	{
		System.out.println("The woodpecker color is brown");
	}

}


public class Polymorphismdemo4 {

	public static void main(String[] args) {
		birds obj=null;
		peacock o1=new peacock();
		crow o2=new crow();
		dove o3=new dove();
		woodpecker o4=new woodpecker();
		
		
		obj=o1;
		o1.birdscolor();
		obj=o2;
		o2.birdscolor();
		obj=o3;
		o3.birdscolor();
		obj=o4;
		o4.birdscolor();
		
		
		
		
		
		
		
		
		
	}

}
