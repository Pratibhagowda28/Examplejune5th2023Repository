package com.sgtesting.returnvalue;
class Maths1
{
	void Primenumber()
	{
		for(int num=50;num<=100;num++)
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
				
				System.out.println(num+" is a prime number");
			}
			
		}
	}
}

public class PrimeNumberDemoReturn {

	public static void main(String[] args) {
		Maths1 o=new Maths1();
		o.Primenumber();
		
	
	}

}
