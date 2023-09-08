package com.sgtesting.methodprograms;

class Callbyreference1
{
	int x,y;
	void calculate(Callbyreference1 o)
	{
		o.x+=20;
		o.y*=10;
		System.out.println(o.x);
		System.out.println(o.y);
	}
}
public class CallbyReference {

	public static void main(String[] args) {
		Callbyreference1 o=new Callbyreference1();
		o.x=5;
		o.y=10;
		o.calculate(o);
		System.out.println(o.x);
		System.out.println(o.y);
		

	}

}
