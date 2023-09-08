package com.sgtesting.returnvalue;
class AdditionOfArray
{
	int[][] addition1(int x[][],int y[][])
	{
		int z[][]=new int[x.length][x[0].length];
	
	for(int i=0;i<x.length;i++)
	{
		for(int j=0;j<x[i].length;j++)
		{
			z[i][j]=x[i][j]+y[i][j];
		}
		
	}
	return z;
}
}



public class AdditionOfArrayDemo1 {

	public static void main(String[] args) {
		AdditionOfArray o=new AdditionOfArray();
		int a[][]={{1,2,3},{4,5,6}};
		int b[][]={{7,8,9},{4,5,6}};
		int res[][]=o.addition1(a,b);
		//read transpose of mtarix:
		for(int n=0;n<res.length;n++)
		{
		    for(int k=0;k<res[0].length;k++)
		    {
		    	System.out.print(res[n][k]+" ");
		    }
		    System.out.println();
		}
		
		
	}

}
