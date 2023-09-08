package com.twodimensionarray.demo;

public class TwoDStringArray {

	public static void main(String[] args) {
		String s1[][]= {{"one","two","Three"},{"four","Five","six"},{"seven","eight","nine"}};
		int rc=s1.length;
		int cc=s1[0].length;
		System.out.println("The Size of the Array is:"+s1.length+"*"+s1[0].length);
		System.out.println("The Elements of second column are:");
		for(int i=0;i<s1.length;i++)
		{
			
			for(int j=1;j<s1[0].length-1;j++)
			{
				System.out.println(s1[i][j]);
			}
		
		}
		
	}

}
