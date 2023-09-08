package com.sgtesting.iopackage;
import java.io.File;

public class FolderOperationsDemo {

	public static void main(String[] args) {

		Createfolder1();
		CreateNestedFolder();
		Renamefolder1();
		//Deletefolder();
		Foldercollections();

	}



private static void Createfolder1()
{

	File f1=new File("D:\\Demo\\Test\\ReactJS");
	boolean v1=f1.mkdir();
	System.out.println("Folder has created: "+v1);
}
private static void CreateNestedFolder()
{

	File f1=new File("D:\\Demo\\Test\\D1\\D2\\D3\\D4\\D5\\D6");
	boolean v2=f1.mkdirs();
	System.out.println("Nested folders has created");
}
private static void Renamefolder1()
{
	File f1=new File("D:\\Demo\\Test\\ReactJS");
	File f2=new File("D:\\Demo\\Test\\ReactJSnew");
	boolean b1=f1.renameTo(f2);
	System.out.println("Has it Renamed: "+b1);
}
private static void Deletefolder()
{
	File f2=new File("D:\\Demo\\Test\\ReactJSnew");
	boolean b2=f2.delete();
	System.out.println("Has it Deleted: "+b2);

}
private static void Foldercollections()
{
	try
	{
		File f1=new File("D:Demo\\Test");
		File f2[]=f1.listFiles();
		for(int i=0;i<f2.length;i++)
		{
			if(f2[i].isDirectory()==true)
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