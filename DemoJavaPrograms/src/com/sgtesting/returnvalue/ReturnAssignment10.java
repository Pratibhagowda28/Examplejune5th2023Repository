package com.sgtesting.returnvalue;
class OneDArraytoTwoDarray
{
	int[][] Display(int x[])
	{
		
		int a[][]=new int[2][3];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=x[k];
				k=k+1;
			}
		}
		return a;
	}
}

public class ReturnAssignment10 {

	public static void main(String[] args) {
		OneDArraytoTwoDarray o=new OneDArraytoTwoDarray();
		int arr[]= {1,2,3,4,5,6};
		
		int b[][]=o.Display(arr);
		for(int m[]:b)
		{
			for( int n:m)
{
	System.out.println(n+" ");
}
		}
	}

}
