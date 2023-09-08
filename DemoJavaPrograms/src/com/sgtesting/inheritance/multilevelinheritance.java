package com.sgtesting.inheritance;
class multilevel1
{
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class multilevel2 extends multilevel1
{
	void substraction(int x,int y)
	{
		int res=x-y;
		System.out.println(res);
	}
}
class multilevel3 extends multilevel2
{
	void multiplication(int x,int y)
	{
		int res=x*y;
		System.out.println(res);
	}
}

public class multilevelinheritance {

	public static void main(String[] args) {
		multilevel3 o=new multilevel3();
		o.multiplication(20, 30);
		o.substraction(50, 20);
		o.addition(20, 30);
	}

}
