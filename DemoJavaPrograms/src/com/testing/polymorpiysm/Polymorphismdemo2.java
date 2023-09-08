package com.testing.polymorpiysm;
abstract class Animalsounds
{
	abstract void sounds();
}
class dog extends Animalsounds
{
	void sounds()
	{
		System.out.println("It makes bow wow");
	}
}
class cat extends Animalsounds
{
	void sounds()
	{
		System.out.println("It makes meow meow");
	}
}
class sheep extends Animalsounds
{
	void sounds()
	{
		System.out.println("It makes baa baa");
	}
}
class cow extends Animalsounds
{
	void sounds()
	{
		System.out.println("It makes moo moo");
	}
}

public class Polymorphismdemo2 {

	public static void main(String[] args) {
		Animalsounds obj=null;
		dog o1=new dog();
		cat o2=new cat();
		sheep o3=new sheep();
		cow o4=new cow();
		
		obj=o1;
		o1.sounds();
		
		obj=o2;
		o2.sounds();
		
		obj=o3;
		o3.sounds();
		
		obj=o4;
		o4.sounds();		
	}

}
