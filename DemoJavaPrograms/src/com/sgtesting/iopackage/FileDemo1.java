package com.sgtesting.iopackage;
import java.io.File;


public class FileDemo1 {

	public static void main(String[] args) {
		File f1=new File("D:\\Demo\\Test\\Welcome.txt");
		//Display the name of the file.
		String name=f1.getName();
		System.out.println("The name of the file is: "+name);
		//Display filepath.
		String path=f1.getPath();
		System.out.println("The path of the file: "+path);
		String path1=f1.getAbsolutePath();
		System.out.println("The path of the file: "+path1);
		//Verify is it a file.
		boolean b1=f1.isFile();
		System.out.println("Is it a file: "+b1);
		//Verify is it a folder.
		boolean b2=f1.isDirectory();
		System.out.println("Is it a folder: "+b2);
		//Verify it has read permission.
		boolean b3=f1.canRead();
		System.out.println("It has read permission: "+b3);
		//Verify it has write permission.
		boolean b4=f1.canWrite();
		System.out.println("It has write permission: "+b4);
		//Verify it has read permission.
		boolean b5=f1.canExecute();
		System.out.println("It has read permission: "+b5);
		//Display parent folder.
		String path2=f1.getParent();
		System.out.println("The parent folder: "+path2);


	}
	

}
