package com.sgtesting.stringdemo;

public class StringDemo4 {

	public static void main(String[] args) {
		String s1=new String("Mysore and Bangalore");

		String s2[]=s1.split(" ");
		for(String kk:s2)
		{
			System.out.println(kk);
		}
		System.out.println("++++++++++++++++++++++");
		for(int i=s2.length-1;i>=0;i--)
		{
			System.out.print(s2[i]+" ");	
		}
		
		
	}

}
