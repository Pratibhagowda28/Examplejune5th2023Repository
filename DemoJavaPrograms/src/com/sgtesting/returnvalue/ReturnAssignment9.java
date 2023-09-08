package com.sgtesting.returnvalue;
class Reverse2dArray
{
	char[][] Reversearray(char ch[][])
	{
		for(int i=ch.length-1;i>=0;i--)
		{
			for(int j=ch[0].length-1;j>=0;j--)

			{
				System.out.print(ch[i][j]+" ");
			}
	    	System.out.println();

		}
		return ch;
	}
}

	public class ReturnAssignment9 {

		public static void main(String[] args) {
			Reverse2dArray o=new Reverse2dArray();
			char ch[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		   char ch1[][]= o.Reversearray(ch);
		
		  
	    	

		}

	}
