package com.twodimensionarray.demo;

public class TwoDbyteArrayDemo {

	public static void main(String[] args) {
		byte b1[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int rc=b1.length;
		int cc=b1[0].length;
		
		for(int i=0;i<b1.length;i++)
		{
			for(int j=0;j<b1[0].length;j++)
			{
				System.out.print(b1[i][j]+" ");
			}
			System.out.println();
		}

	}

}
