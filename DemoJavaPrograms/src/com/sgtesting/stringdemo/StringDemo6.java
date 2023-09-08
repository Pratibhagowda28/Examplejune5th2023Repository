package com.sgtesting.stringdemo;
//The temple is at the top of the hill.

public class StringDemo6 {

	public static void main(String[] args) {
		String s1=new String("The temple is at the top of the hill");
		String s2[]=s1.split(" ");
		for(String k:s2)
		{
			System.out.println(k);
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println("The nuber of words: "+s2.length);
	}

}
