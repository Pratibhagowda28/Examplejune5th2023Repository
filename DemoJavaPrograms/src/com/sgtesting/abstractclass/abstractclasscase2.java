package com.sgtesting.abstractclass;
abstract class college1
{
	abstract void showcollegename(String name);
	abstract void displaycityname(String name);
	void showbranches(String branches[])
	{
		System.out.println("branchnames: ");
		for(int i=0;i<branches.length;i++) {
			System.out.println(branches[i]);
		}
	}
}
class medicalcollege1 extends college1
{
	void showcollegename(String name)
	{
		System.out.println("The college name is: "+name);
	}
	void displaycityname(String name)
	{
		System.out.println("The city name is: "+name);
	}
	void showaddress(String address)
	{
		System.out.println("The address is: "+address);
	}
}

public class abstractclasscase2 {

	public static void main(String[] args) {
		college1 o=new medicalcollege1();
		o.showcollegename("SIT");
		o.displaycityname("TUMKUR");
		//o.showaddress("Batwadi tumkur");
		String a[]= {"EEE","ECE","CSE","IEM"};

		o.showbranches(a);
	}

}
