package com.twodimensionarray.demo;

public class StringArrayReverseDemo {

	public static void main(String[] args) {
		
		String s1[][]= {{"one","two","Three"},{"four","Five","six"}};
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
