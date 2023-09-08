package com.methodoverloading.programs;
//Methods having same name ,differs from no. of parameters,datatype,and sequence of datatype.
class maths1
{
	void addition(int x,int y)
	{
		int result=x+y;
		System.out.println("The addition result is: "+result);
	}
	void adddition(int x)
	{
		int res=x+25;
		System.out.println("The addition result is: "+res);
	}
	void addition(int x,int y,int z)
	{
		int res=x+y+z;
		System.out.println("The addition result is: "+res);

	}
	void addition(int a[])
	{
		int res=0;
		for(int i=0;i<a.length;i++)
		{
			res=res+a[i];
		}
			System.out.println("The addition result is: "+res);
		
		


	}
}

public class Mathematics1 {

	public static void main(String[] args) {
		maths1 o=new maths1();
		o.addition(10,20);
		o.adddition(10);
		o.addition(3, 2, 6);
		int a[]= {1,2,3,4,5,6};
		o.addition(a);
	}

}
