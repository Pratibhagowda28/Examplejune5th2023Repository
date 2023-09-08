package com.sgtesting.iopackage;

import java.io.FileWriter;

public class CharecterStreamFileWriter {

	public static void main(String[] args) {
		 Writecontent();
		 

	}private static void Writecontent()
	{
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("D:\\Demo\\Test\\Welcome1.txt");
			String str="Java is Programming language";
			str+="It supports OOPS concept";
			char ch[]=str.toCharArray();
			fw.write(ch);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
