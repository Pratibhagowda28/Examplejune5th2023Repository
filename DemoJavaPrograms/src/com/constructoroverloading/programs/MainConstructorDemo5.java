package com.constructoroverloading.programs;
//factorial of given number & verify given number is prime or not

class Maths
{
	
	Maths(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
	System.out.println("the factorial of given num is: "+fact);
	}	
	Maths()
	{
	int num=17;
	int flag=0;
	
	for(int i=2;i<=num;i++)
	{
		if(num%2==0)
		{
			flag=flag+1;
			break;
		}
	}
	if(flag==0)
	{
	System.out.println("The given number is Prime number");
	}
	else
	{
		System.out.println("The given number is not a Prime number");	
	}
	}

		
}
public class MainConstructorDemo5 {

	public static void main(String[] args) {
		Maths m1=new Maths(5);
		Maths m2=new Maths();
	}

}
