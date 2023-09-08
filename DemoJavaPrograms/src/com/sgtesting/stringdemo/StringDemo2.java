package com.sgtesting.stringdemo;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1="java";
		String s2="Java";
		String s3="java";
		String s4=new String("java");
		String s5=new String("Java");
		String s6=new String("java");
		System.out.println("(s1==s2):"+ (s1==s2));
		System.out.println("(s1==s3):"+ (s1==s3));
		System.out.println("(s2==s3):"+ (s2==s3));
		System.out.println("(s4==s1):"+ (s4==s1));
		System.out.println("(s4==s6):"+ (s4==s6));
		System.out.println("(s4==s5):"+ (s4==s5));


	}

}
