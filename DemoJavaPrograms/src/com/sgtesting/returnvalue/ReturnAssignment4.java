package com.sgtesting.returnvalue;
//1d char array, it has to return first half of the elements.
class OneDCharArray
{
	char[] Display(char x[])
	{
		char ch[]=new char[x.length];
		for(int i=0;i<x.length/2;i++)
		{
			System.out.println(ch[i]);
		}
		return ch;
	}
}

public class ReturnAssignment4 {

	public static void main(String[] args) {
		OneDCharArray o=new OneDCharArray();
		char a[]= {'a','b','c','d','e','f','g','h'};
		for(int i=0;i<a.length/2;i++)
		{
			System.out.println(a[i]);
		}
	}

}
