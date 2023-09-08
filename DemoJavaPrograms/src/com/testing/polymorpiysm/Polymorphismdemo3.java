package com.testing.polymorpiysm;
abstract class songtypes
{
	abstract void musictype();
}
class folk extends songtypes
{
	void musictype() 
	{
		System.out.println("Folk songs");
	}
}
class classical extends songtypes
{
	void musictype() 
	{
		System.out.println("classical songs");
	}
}
class western extends songtypes
{
	void musictype() 
	{
		System.out.println("western songs");
	}
}
class karnatic extends songtypes
{
	void musictype() 
	{
		System.out.println("karnatic songs");
	}
}

public class Polymorphismdemo3 {

	public static void main(String[] args) {
		songtypes obj=null;
		folk o1=new folk();
		classical o2=new classical();
		western o3=new western();
		karnatic o4 =new karnatic();
		
		obj=o1;
		o1.musictype();
		obj=o2;
		o2.musictype();
		obj=o3;
		o3.musictype();
		obj=o4;
		o4.musictype();
		
		
		
		
		
	}

}
