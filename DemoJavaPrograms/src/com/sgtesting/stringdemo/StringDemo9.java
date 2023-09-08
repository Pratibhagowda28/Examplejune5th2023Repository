package com.sgtesting.stringdemo;

public class StringDemo9 {

	public static void main(String[] args) {

		
			String s=new String("WELCOME");
			for(int j=0;j<s.length()-1;j++)
			{
				System.out.println(s.substring(0, (j+1)));
			}
			
			for(int i=s.length()-1;i>=0;i--)
			{
				System.out.println(s.substring(0, (i+1)));
			}

	}

}
