package com.sgtesting.interfacedemo;
interface collegesiet
{
	void showcollegename(String name);
}
interface branch 
{
	
	void displaybranch(String branch);
}

class librarysiet implements collegesiet,branch
{
	public void showcollegename(String name)
	{
		System.out.println("College name: "+name);
	}
	public void displaybranch(String branch)
	{
		System.out.println("College name: "+branch);
	}
	
}

public class interfacedemo5 {

	public static void main(String[] args) {
	
		librarysiet o1=new librarysiet();
		o1.showcollegename("CIT");
		o1.displaybranch("EEE");
	
	}

}
