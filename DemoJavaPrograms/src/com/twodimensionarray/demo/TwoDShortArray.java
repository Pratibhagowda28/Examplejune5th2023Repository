package com.twodimensionarray.demo;

public class TwoDShortArray {

	public static void main(String[] args) {
		short s1[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int rc=s1.length;
		int cc=s1[0].length;

		for(int i=s1.length-1;i>=0;i--)
		{
			for(int j=s1[0].length-1;j>=0;j--)
			{
				System.out.print(s1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
