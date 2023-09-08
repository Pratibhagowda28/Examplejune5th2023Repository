package com.sgtesting.returnvalue;
class Maths2
{
	boolean primenumber(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=flag+1;
				break;
			}
		}

		if(flag==0)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
}

public class primeNumberDemo2 {

	public static void main(String[] args) {
		Maths2 o=new Maths2();
		for(int k=50;k<=100;k++)
		{
			if(o.primenumber(k)==true)
			{
				System.out.print(k+" ");
			}
		}
		System.out.println();

		for(int j=150;j<=250;j++)
		{
			if(o.primenumber(j)==true)
			{
				System.out.print(j+" ");
			}
		}
		System.out.println();
		for(int m=150;m<=250;m++)
		{
			if(o.primenumber(m)==false)
			{
				System.out.print(m+" ");
			}
		}
		System.out.println();


		for(int p=90;p<=180;p++)
		{
			if(o.primenumber(p)==true)
			{
				System.out.print(p+" ");
			}
		}System.out.println();

	}
}