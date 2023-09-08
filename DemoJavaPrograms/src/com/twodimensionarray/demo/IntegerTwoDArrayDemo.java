package com.twodimensionarray.demo;

public class IntegerTwoDArrayDemo {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60}};
		int rc=a.length;
		int cc=a[0].length;
		
		int i=0;
		while(i<a.length)
		{
			int j=0;
			while(j<a[0].length)
			{
				System.out.print(a[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}
			

	}

}
