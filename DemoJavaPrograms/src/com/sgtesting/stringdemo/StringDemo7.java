package com.sgtesting.stringdemo;

public class StringDemo7 {

	public static void main(String[] args) {

		{
			String s1=new String("The temple is at the top of the hill");
			char v1[] = s1.toCharArray();
			int count =0;
			for(char c:v1) {
				count++;
			}
			System.out.println(count);
		}
	}

}
