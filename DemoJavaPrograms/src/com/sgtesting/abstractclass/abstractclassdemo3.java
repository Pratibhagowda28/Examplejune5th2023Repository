package com.sgtesting.abstractclass;
abstract class staticblockdemo
{
	static 
	{
		System.out.println("The first static block");
	}
	static
	{
		System.out.println("The second static block");
	}
}
class staticblockdemo2 extends staticblockdemo
{
	
}


public class abstractclassdemo3 {

	public static void main(String[] args) {
		staticblockdemo2 o=new staticblockdemo2();
		
	}

}
