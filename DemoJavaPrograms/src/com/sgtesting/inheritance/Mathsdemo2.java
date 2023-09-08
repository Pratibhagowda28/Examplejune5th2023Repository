package com.sgtesting.inheritance;
class Maths
{
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class Mathstwo extends Maths
{
	void substraction(int x,int y)
	{
		int res=x-y;
		System.out.println(res);
	}

}


public class Mathsdemo2 {

	public static void main(String[] args) {
		Mathstwo o=new Mathstwo();
		o.substraction(40, 20);
		o.addition(20, 30);

	}

}
