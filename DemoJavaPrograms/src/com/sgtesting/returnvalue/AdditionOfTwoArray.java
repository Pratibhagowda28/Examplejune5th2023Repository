package com.sgtesting.returnvalue;
//without using return value.
class Additionofarray1
{
	void addition(int x[][],int y[][])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				int res=x[i][j]+y[i][j];
				System.out.print(res+" ");
			}
			System.out.println();
		}
	}
}

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		Additionofarray1 o=new Additionofarray1();
		
		int x[][]= {{1,2,3},{4,5,6}};
		int y[][]= {{1,2,3},{4,5,6}};
		o.addition(x,y);
	}

}
