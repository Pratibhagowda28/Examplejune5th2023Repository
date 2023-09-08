package com.sgtesting.methodprograms;
class Callbyvalue
{
	void calculate(int x,int y)
	{
		x+=100;
		y*=10;
		System.out.println("In Method "+x);
		System.out.println("In Method "+y);
	}
	
}
public class CalculationDemo1 {

	public static void main(String[] args) {
		int x=5;int y=10;
		System.out.println("value of x: "+x);
		System.out.println("value of y: "+y);
		
		Callbyvalue c1=new Callbyvalue();
		c1.calculate(x,y);
		System.out.println("After execution "+x);
		System.out.println("After execution "+y);
		

	}

}
