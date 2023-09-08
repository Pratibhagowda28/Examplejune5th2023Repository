package com.sgtesting.stringdemo;

public class StringBufferDemo2 {

	public static void main(String[] args) {

		appendstring();
		insertString();
		deletestring();
		Reversestring();
	}

	private static void appendstring()

	{
		StringBuffer s1=new StringBuffer("java");
		System.out.println(s1);
		s1.append(" programming");
		System.out.println(s1);
		s1.append(" language");
		System.out.println(s1);
		System.out.println("---------------------------------------------------------");
	}

	private static void insertString()
	{
		StringBuffer s1=new StringBuffer("java language");
		s1.insert(5, "programming ");
		System.out.println(s1);
		System.out.println("---------------------------------------------------------");

	}
	private static void deletestring()
	{
		StringBuffer s1=new StringBuffer("java programming language");
		StringBuffer s2=s1.delete(5, 16);
		System.out.println(s2);
		System.out.println("---------------------------------------------------------");

	}
	private static void Reversestring()
	{
		StringBuffer s1=new StringBuffer("WELCOME");
		StringBuffer s2=s1.reverse();
		System.out.println(s2);
		System.out.println("---------------------------------------------------------");
	}
}


