package com.sgtesting.inheritance;
class demosamplehierarical
{
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println("Addition result is: "+ res);
	}
}
class demosamplehierarical1 extends demosamplehierarical
{
	void substraction(int x,int y)

	{
		int res=x-y;
		System.out.println("Substraction result is: "+res);
	}
}
class demosamplehierarical2 extends demosamplehierarical
{
	void multiplication(int x,int y)
	{
		int res=x*y;
		System.out.println("multiplication result is: "+res);
	}
}

public class question3demo {

	public static void main(String[] args) {
		demosamplehierarical1 o=new demosamplehierarical1();
		o.addition(5, 10);
		o.substraction(50, 10);
		demosamplehierarical2 o1=new demosamplehierarical2();
		o1.addition(10, 20);
		o1.multiplication(10, 5);
	}

}
