package com.twodimensionarray.demo;

public class CharArrayReverseDemo {

	public static void main(String[] args) {
		char ch[][]= {{'A','B','c'},{'D','E','F'}};
		int rc=ch.length;
		int cc=ch[0].length;
		for(int i=ch.length-1;i>=0;i--)
		{
			for(int j=ch[0].length-1;j>=0;j--)
			{
				System.out.print(ch[i][j]+" ");
				
			}
		
		System.out.println();
		}

	}

}
