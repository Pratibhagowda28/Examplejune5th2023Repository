package com.twodimensionarray.demo;

public class TwoDIntegerDemo {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int rc=a.length;
		int cc=a[0].length;
		System.out.println("The size of the array is: "+a.length+"*"+a[0].length);
		for(int i=1;i<a.length-1;i++)
		{
			System.out.println("The Second Row Elements are: ");
			for(int j=0;j<a[i].length;j++)
			{

				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=2;i<a.length;i++)
		{
			System.out.println("The Third Row Elements are: ");
			for(int j=0;j<a[i].length;j++)
			{ 

				System.out.print(a[i][j]+" ");
			}
		}
	}

}
