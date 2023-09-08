package com.sgtesting.stringdemo;

public class StringMethodsDemo {

	public static void main(String[] args) {

		findcharectercount();
		VerifyEmptyString();
		getcharbasedonindex();
		ExtractString();
		replacedemo();
		compareString();
		compareString2();
		existanceofstring();
		splitstring();
		findposition();
		converttostring();
		Lowercase();
		Uppercase();
		trimstr();
		trimstr();

	}
	private static void findcharectercount()
	{
		String s="Welcome";
		int v1=s.length();
		System.out.println("# of Charecters: "+v1);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	private static void VerifyEmptyString()
	{
		String s=new String();
		boolean v1=s.isEmpty();
		System.out.println("Is String Empty??: "+v1);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

	}
	;		private static void getcharbasedonindex()
	{
		String s="Welcome";
		char ch=s.charAt(3);
		System.out.println("Char at 3 index: "+ch);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

	}
	private static void ExtractString()
	{
		String s="Welcome";
		String v1=s.substring(3);
		System.out.println("# of Charecters: "+v1);
		String s1=s.substring(0, 3);
		System.out.println("# of Charecters: "+s1);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	private static void replacedemo()
	{
		String s="It was an old building";
		String s1=s.replace("was", "is");
		System.out.println("Replaced:"+ s1);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

	}
	private static void compareString()
	{
		String s1="Welcome";
		String s2="WELCOME";
		boolean b1=s1.equals(s2);
		System.out.println("whether s1 and s2 are equal: "+ b1);
		boolean b2=s1.equalsIgnoreCase(s2);
		System.out.println("whether s1 and s2 are equal: "+b2);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

	}
	private static void compareString2()
	{
		String s1="Welcome";
		String s2="WELCOME";
		int b1=s1.compareTo(s2);
		System.out.println("whether s1 and s2 are equal: "+ b1);
		int b2=s1.compareToIgnoreCase(s2);
		System.out.println("whether s1 and s2 are equal: "+b2);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	private static void existanceofstring()
	{
		String s="java supports oops concept";
		System.out.println("Starts with: "+s.startsWith("java"));
		System.out.println("End with: "+s.endsWith("concept"));
		System.out.println("Contains: "+s.contains("oops"));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

	}
	private static void splitstring()
	{
		String s1="Banana, Mango, Orange, kiwi";
		String str[]=s1.split(", ");
		for(String k:str)
		{
			System.out.println(k);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	private static void convertToCharArray()
	{
		String s="Welcome";
		char ch[]=s.toCharArray();
		for(char val:ch)
		{
			System.out.println(val);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

		}

	}
	private static void findposition()
	{
		String s="It is an old bridge";
		int pos1=s.indexOf("is",0);
		System.out.println("Position of is from right to left: "+pos1);
		int pos2=s.indexOf("is");
		System.out.println("Position of is from left to right: "+pos2);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	private static void converttostring()
	{
		int a=125;
		String s1=String.valueOf(a);
		System.out.println(s1);
		boolean b=true;
		String s2=String.valueOf(b);
		System.out.println(s2);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
	private static void Lowercase()
	{
		String s="SPRINGBOOT";
		System.out.println(s.toLowerCase());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

	}
	private static void Uppercase()
	{
		String s="springboot";
		System.out.println(s.toUpperCase());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

	}
	private static void trimstr()
	{
		String s="   Testing   ";
		String s1=s.trim();
		System.out.println("Before trimming: "+s.length());
		System.out.println("After trimming: "+s1.length());
	}

















}


