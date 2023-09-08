package com.sgtesting.inheritance;
//hybridinheritance
class demosample1
{
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println("Addition result is: "+ res);
	}
}
class demosample2 extends demosample1
{
	void substraction(int x,int y)

	{
		int res=x-y;
		System.out.println("Substraction result is: "+res);
	}
}
class demosample3 extends demosample2
{
	void multiplication(int x,int y)
	{
		int res=x*y;
		System.out.println("multiplication result is: "+res);
	}
}
class demosample4 extends demosample1
{
	void division(int x,int y)
	{
		int res=x/y;
		System.out.println("division result is: "+res);
	}
}


public class Question2demo {

	public static void main(String[] args) {
		demosample3 o1 = new demosample3();
		o1.addition(10, 20);
		o1.substraction(20, 10);
		o1.multiplication(10, 10);


		demosample4 o2 = new demosample4();
		o2.division(50, 10);
		o2.addition(20, 10);
	}

}
