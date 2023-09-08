package com.constructoroverloading.programs;
class Maths1
{
	Maths1(int x,int y,String action)
	{
		switch(action)
		{
		case "add":
			System.out.println("The addition result is:"+ (x+y));
			break;
		case "sub":
			System.out.println("The Substraction result is:"+(x-y));
			break;
		case "mult":
			System.out.println("The multiplication result is:"+(x*y));
			break;
		case "div":
			System.out.println("The division result is:"+(x/y));
			break;
		case "mod":
			System.out.println("The modulus result is:"+(x%y));
			break;
		default:
			System.out.println("Invalid input");
			
		}
	}
}

public class MainConstructorDemo6 {

	public static void main(String[] args) {
		
Maths1 m1=new Maths1(10,20,"add");
Maths1 m2=new Maths1(50,20,"sub");
Maths1 m3=new Maths1(10,20,"mult");
Maths1 m4=new Maths1(20,2,"div");
Maths1 m5=new Maths1(20,5,"mod");

	}

}
