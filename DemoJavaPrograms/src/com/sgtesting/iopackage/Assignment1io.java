package com.sgtesting.iopackage;
import java.io.File;
public class Assignment1io {

	public static void main(String[] args) {
		Createsubfolders();

	}
	private static void Createsubfolders()
	{		
		try
		{
			for(int i=1;i<=10;i++)
			{
				File f1=new File("D:\\Demo\\Test\\folder1");
				File f2=new File(f1,"folder"+i);
				f2.mkdirs();
			}

		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
