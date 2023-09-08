package com.sgtesting.inheritance;
class maths1
{
	int x,y,z;
	{
	System.out.println(x);

	System.out.println(y);

	System.out.println(z);
	}


}
class maths2 extends maths1
{
	int a,b,c;
	{
		System.out.println(a);

		System.out.println(b);

		System.out.println(c);

	}
	
	
}

public class Mathsdemo1 {

	public static void main(String[] args) {
		maths2 o=new maths2();
		o.a=20;
		o.b=30;
		o.c=40;
		o.x=40;
		o.y=50;
		o.z=60;
		


	}

}
