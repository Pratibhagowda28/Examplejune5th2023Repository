package com.sgtesting.iopackage;

import java.io.FileReader;

public class CharecterStreamFileReader {

	public static void main(String[] args) {
		readcontent();

	}
	private static void readcontent()
	{
		FileReader fr=null;
		int n=0;
		try
		{
			fr=new FileReader("D:\\Demo\\Test\\Welcome.txt");
			while(true)
			{
				n=fr.read();
				if(n==-1)
				{
					break;
				}
				char ch=(char)n;
				System.out.print(ch);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
