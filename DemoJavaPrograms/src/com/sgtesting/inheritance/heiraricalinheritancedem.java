package com.sgtesting.inheritance;
class mathsdemo5
{
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
		
	}
}
class mathsdemo6 extends mathsdemo5
{
	void substraction(int x,int y)
	{
		int res=x-y;
		System.out.println(res);
		
	}
}
class mathsdemo7 extends mathsdemo5
{
	void multiplication(int x,int y)
	{
		int res=x*y;
		System.out.println(res);
		
	}
}

public class heiraricalinheritancedem {

	public static void main(String[] args) {
		mathsdemo6 o=new mathsdemo6();
		o.substraction(20, 10);
		o.addition(20, 10);
		mathsdemo7 o2=new mathsdemo7();
		o2.multiplication(10,20);
		o2.addition(20, 10);
		
		
		
		
	}

}
