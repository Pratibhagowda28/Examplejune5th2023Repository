package com.sgtesting.iopackage;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;

public class Assignment3 {

	public static void main(String[] args) {
		Readfirsthalf();
	}
	private static void Readfirsthalf()
	{
		try
		{
			File f=new File("D:\\Demo\\Test\\Welcome.txt");
		FileReader f1=new FileReader(f);
		BufferedReader br=new BufferedReader(f1);
		StringBuffer sb=new StringBuffer();
		String line;
		while((line=br.readLine()) != null)
		{
			sb.append(line);

			sb.append("\n");
			
		}
		f1.close();
		System.out.println("Contents of file");
		System.out.println(sb);
		
		
		
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
