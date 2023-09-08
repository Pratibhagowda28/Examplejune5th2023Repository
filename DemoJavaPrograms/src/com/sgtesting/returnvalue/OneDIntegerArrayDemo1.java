package com.sgtesting.returnvalue;
//write a method,the method has to return 1d integer array,Read the elements from return value.
class IntegerArrayDemo1
{
	int[] integerarray()
	{
		int a[]= {1,2,3,4,5};
		return a;
		
	}
}
public class OneDIntegerArrayDemo1 {

	public static void main(String[] args) {
		IntegerArrayDemo1 o=new IntegerArrayDemo1();
		int x[]=o.integerarray();
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}

}
