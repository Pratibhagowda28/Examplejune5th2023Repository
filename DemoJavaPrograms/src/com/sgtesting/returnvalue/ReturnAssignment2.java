package com.sgtesting.returnvalue;
//It has to return substraction of two matrices.
class Substractiondemo
{
	int[] substraction1(int a[],int b[])
	{
		int z[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			z[i]=a[i]-b[i];
		}
		
		return z;	
	}
}

public class ReturnAssignment2 {

	public static void main(String[] args) {
		Substractiondemo o=new Substractiondemo();
		int a[]= {10,20,30,40,50,60};
		int b[]= {1,2,3,4,5,6};
		int res[]=o.substraction1(a,b);
		for(int i=0;i<res.length;i++)
		{
        System.out.println(res[i]);
		}
	}

}
