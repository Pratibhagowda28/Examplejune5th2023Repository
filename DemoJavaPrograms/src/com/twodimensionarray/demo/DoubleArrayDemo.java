package com.twodimensionarray.demo;

public class DoubleArrayDemo {

	public static void main(String[] args) {
		Double d1[][]= {{12.3,12.4,12.5},{12.6,12.7,12.8},{12.9,13.1,13.2}};
		int rc=d1.length;
		int cc=d1[0].length;
		int i=0;
		while(i<d1.length)
		{
			int j=0;
			while(j<d1[0].length)
			{
				System.out.print(d1[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
