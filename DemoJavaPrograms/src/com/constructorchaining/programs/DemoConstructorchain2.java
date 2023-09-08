package com.constructorchaining.programs;
class Project
{
	Project(String projectname,int projectteamstrength)
	{
		System.out.println("project Name: "+projectname);
		System.out.println("project Team Strength: "+projectteamstrength);
	}
	Project(int id)
	{

		System.out.println("project ID: "+id);
	}
	Project(String duration)
	{
		this("JAVA",20);
		System.out.println("project Duration: "+duration);
	}
}

public class DemoConstructorchain2 {


	public static void main(String[] args) {
		Project p1=new Project("Three years");
		Project p2=new Project(20);
	}

}
