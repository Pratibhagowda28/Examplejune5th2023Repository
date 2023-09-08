package com.sgtesting.returnvalue;
class OneDArrayReverse
{
	int[] Reversedisplay(int a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		return a;
	}
	
}


public class ReturnAssignment7 {

	public static void main(String[] args) {
		OneDArrayReverse o=new OneDArrayReverse();
		int a[]= {1,2,3,4,5,6};
		int res[]=o.Reversedisplay(a);
		
		for(int j=res.length-1;j>=0;j--)
		{
			
			System.out.println(res[j]);
		}
		
	}

}
