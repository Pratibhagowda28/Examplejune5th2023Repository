package com.java.encapsulation;
class Basicmaths
{
	static Basicmaths obj=null;
	private Basicmaths()
	{

	}
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println("Addition result is: "+res);
	}
	void multiplication(int x,int y)
	{
		int res=x*y;
		System.out.println("The Multiplication result is: "+res);
	}
	public static Basicmaths getinstance()
	{
		if(obj==null)
		{
			obj=new Basicmaths();
		}
		return obj;
	}

}

public class Basicmaths1 {

	public static void main(String[] args) {
		Basicmaths o1=Basicmaths.getinstance();
		o1.addition(10,20);
		o1.multiplication(2,3);
		Basicmaths o2=Basicmaths.getinstance();
		o2.addition(10,20);
		o2.multiplication(2,3);
		Basicmaths o3=Basicmaths.getinstance();
		o3.addition(10,20);
		o3.multiplication(2,3);
	}

}
