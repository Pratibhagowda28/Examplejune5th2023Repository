package com.sgtesting.returnvalue;
//2d array,assign elements in to 1d array.
class TwodArrayDemo
{
	int[] twodtoonedarray(int a[][])
	{

		int x[]=new int[a.length*a[0].length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				x[k]=a[i][j];
				k++;
			}


		}
		return x;

	}
}
	public class ReturnAssignment6 {

		public static void main(String[] args) {
			TwodArrayDemo o=new TwodArrayDemo();
			int a[][]= {{1,2,3},{4,5,6}};
			int x[]=o.twodtoonedarray(a);
			for(int m=0;m<x.length;m++)
			{
				System.out.print(x[m]+" ");
			}

			System.out.println();
		}

	}
