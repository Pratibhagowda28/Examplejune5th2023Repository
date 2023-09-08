package com.sgtesting.inheritance;
class hybriddemo1
{
	void addition(int x, int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class hybriddemo2 extends hybriddemo1
{
	void substraction(int x, int y)
	{
		int res=x-y;
		System.out.println(res);
	}
}
class hybriddemo3 extends hybriddemo2
{
	void multiplication(int x, int y)
	{
		int res=x*y;
		System.out.println(res);
	}
}
class hybriddemo4 extends hybriddemo1
{
	void division(int x, int y)
	{
		int res=x/y;
		System.out.println(res);
	}
}


public class hybridinheritance {

	public static void main(String[] args) {
		hybriddemo3 o=new hybriddemo3();
		o.multiplication(10,10);
	    o.substraction(50, 20);
	    o.addition(10, 20);
	    hybriddemo4 o1=new hybriddemo4();
	    o1.division(50,5);
	    o1.addition(20, 30);
	    
	    
	    
	    
	    
	}
	

}
