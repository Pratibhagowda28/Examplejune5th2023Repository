package com.sgtesting.iopackage;

import java.io.FileOutputStream;

public class FileoutputStream {


	public static void main(String[] args) {
		Writecontent();
	
	}
	private  static void Writecontent()
	{
		FileOutputStream fout = null;
				
		try
		{
			fout = new FileOutputStream("D:\\Test\\Welcome1.txt");
		    String str="Java is a programming language";
			str+="it supports oops concept";
			byte b[]=str.getBytes();
		    fout.write(b);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}