package com.sgtesting.iopackage;
import java.io.File;

public class FileOperationsDemo {

	public static void main(String[] args) {
		Createfile();
		Renamefile1();
		Deletefile();
		filecollections();
		

	}
	private static void Createfile()
	{
		try
		{
			File f1=new File("D:\\Demo\\Test\\Sample.txt");
			f1.createNewFile();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Renamefile1()
	{

		File f1=new File("D:\\Demo\\Test\\Sample.txt");
		File f2=new File("D:\\Demo\\Test\\Sample1.txt");
		f1.renameTo(f2);

	}
	private static void Deletefile()
	{
		File f2=new File("D:\\Demo\\Test\\Sample1.txt");
		boolean b1=f2.delete();
		System.out.println("File has deleted successfully: "+b1);
	}
	private static void filecollections()
	{
		try
		{
			File f1=new File("D:Demo\\Test");
			File f2[]=f1.listFiles();
			for(int i=0;i<f2.length;i++)
			{
				if(f2[i].isFile()==true)
				{
					System.out.println(f2[i].getPath());
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


