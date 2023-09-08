package com.twodimensionarray.demo;

public class LongTwoDArrayDemo {

	public static void main(String[] args) {
		long l1[][]= {{10,20,30},{40,50,60}};
		
		int i=0;
		do
		{
			int j=0;
			do
			{
				System.out.print(l1[i][j]+" ");	
				j++;
			}
			while(j<l1[0].length);
			System.out.println();
			i++;
		}
		while(i<l1.length);



	}


}
