package com.sgtesting.abstractclass;
abstract class sample3
{
	void displayfirsthalf(int a[])
	{
		System.out.println("The firsthalf elements are:");

		for(int i=0;i<a.length/2;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

	void displaysecondhalf(int a[])
	{
		System.out.println("The secondhalf elements are:");

		for(int i=a.length/2;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
class sample4 extends sample3
{

}

public class Abstractclassdemo2 {

	public static void main(String[] args) {
		sample4 o=new sample4();
		int x[]= {1,2,3,4,5,6,7,8};
		o.displayfirsthalf(x);
		o.displaysecondhalf(x);
	}

}
