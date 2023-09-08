package com.twodimensionarray.demo;

public class AdditionOfTwoDArray {

	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6}};
		int b[][]={{7,8,9},{1,2,3}};
		int z[][]=new int [a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				z[i][j]=a[i][j]+b[i][j];
				System.out.print(z[i][j]+" ");
       }
			System.out.println();

		}
		
		for(int k=0;k<a.length;k++)
		{
			for(int l=0;l<a[0].length;l++)
			{
				System.out.print(z[k][l]+" ");
			}
			System.out.println();
		}


	}

}


