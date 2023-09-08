package com.sgtesting.returnvalue;
//It has to return transpose of Matrix:
class Transpose
{
	int[][] Transposematrix(int a[][])
	{
		int z[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[0].length;j++)
			{
				 z[i][j]=a[i][j];
			}
		return z;
			
		
	}
}

public class ReturnAssignment3 {

	public static void main(String[] args) {
		Transpose o=new Transpose();
		int p[][]= {{1,2,3},{4,5,6},{7,8,9}};
		o.Transposematrix(p);
		for(int k=0;k<p.length;k++)
		{
			for(int l=0;l<p[0].length;l++)
			{
				System.out.print(p[l][k]+" ");
			}
			System.out.println();
		}
	}

}
