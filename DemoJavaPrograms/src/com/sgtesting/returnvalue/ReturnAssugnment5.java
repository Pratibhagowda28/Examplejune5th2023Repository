package com.sgtesting.returnvalue;
//1d double array ,it has to return the second half of the elements.
class Doublearraydemo1
{
	double[] Doublesecondhalf(double a[])
	{
		double d[]=new double [a.length];
		for(int i=d.length/2;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		return d;
		
	}
}
public class ReturnAssugnment5 {

	public static void main(String[] args) {
		Doublearraydemo1 o=new Doublearraydemo1();
		double d[]= {1.1,1.2,1.3,1.4,1.5,1.6};
		for(int j=d.length/2;j<d.length;j++)
		{
			System.out.println(d[j]);
		}
		
	}

}
