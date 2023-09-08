package com.sgtesting.methodprograms;
//verify the given charecter is vowel or not;
class Vowelornotdemo
{
	void vowelornot(char ch)
	{
		switch(ch)
		{
		case 'A':
			System.out.println("This is vowel");
			break;
		case 'E':
			System.out.println("This is vowel");
			break;
		case 'I':
			System.out.println("This is vowel");
			break;
		case 'O':
			System.out.println("This is vowel");
			break;
		case 'U':
			System.out.println("This is vowel");
			break;
			default:
				System.out.println("This is not vowel");
		}
	}
}
public class DemoVowelsornot {

	public static void main(String[] args) {
		Vowelornotdemo v1=new Vowelornotdemo();
		v1.vowelornot('A');
		v1.vowelornot('E');
		v1.vowelornot('I');
		v1.vowelornot('O');
		v1.vowelornot('U');
	}

}
