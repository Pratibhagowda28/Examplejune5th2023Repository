package com.sgtesting.stringdemo;

public class StringDemo5 {

	public static void main(String[] args) {
		String s1=new String("PROGRAM");
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.substring(0,(i+1)));
		}
	}

}
