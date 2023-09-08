package com.sgtesting.stringdemo;

public class StringDemo8 {

	public static void main(String[] args) {
		String s=new String("WELCOME");
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.substring(0, (i+1)));
		}
	}

}


