package com.sgtesting.returnvalue;
//the return value of a method,we can use it within the body of other method.
class calculation
{
	int addition(int x,int y)
	{
		return(x+y);
		
	}
	int substraction(int x,int y)
	{
		return(x-y);
	}
	void multiplication()
	{
		int x=this.addition(20,30);
		int y=this.substraction(10,5);
		int res=x*y;
		System.out.println(res);
	}
}

public class CalculationDemo2 {

	public static void main(String[] args) {
		calculation o=new calculation();
		o.multiplication();
		

	}

}
