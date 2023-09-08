package com.sgtesting.returnvalue;
//It has to return factorial of given number:
class factorialdemo
{
	int factorial(int num)
	{
		int fact=1;
		for(int i=num;i>1;i--)
		{
			fact=fact*i;
		}

		return fact;
	}
}

public class ReturnAssignment1 {

	public static void main(String[] args) {
		factorialdemo o=new factorialdemo();
		int res=o.factorial(5);
		System.out.println("The result of factorial: "+res);

	}

}
