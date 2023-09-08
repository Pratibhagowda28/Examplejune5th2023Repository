package com.sgtesting.iopackage;

import java.io.File;

public class Assignment2iojava {

	public static void main(String[] args) {
		Createsubfolders();
	}
	private static void Createsubfolders()
	{		
		try
		{
			
				File f1=new File("D:\\Demo\\Test");
				String str[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
				for(int i=0;i<str.length;i++)
				{
					File f2=new File(f1,str[i]);
					f2.mkdirs();
				}
				
			

		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
