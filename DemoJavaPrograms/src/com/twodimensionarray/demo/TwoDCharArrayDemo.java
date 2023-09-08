package com.twodimensionarray.demo;

public class TwoDCharArrayDemo {

	public static void main(String[] args) {
		char ch[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		int rc=ch.length;
		int cc=ch[0].length;
		System.out.println("The Size of the Array is:"+ch.length+"*"+ch[0].length);
		System.out.println("The Elements of first column are:");
		for(int i=0;i<ch.length;i++)
		{
			
			for(int j=0;j<ch[0].length-2;j++)
			{
				System.out.println(ch[i][j]);
			}
		
		}
		System.out.println("The Elements of Third column are:");
		 for(int i=0;i<ch.length;i++)
		 {
			 
			 for(int j=2;j<ch[0].length;j++)
			 {
				 System.out.println(ch[i][j]);
			 }
		 }
	}

}
