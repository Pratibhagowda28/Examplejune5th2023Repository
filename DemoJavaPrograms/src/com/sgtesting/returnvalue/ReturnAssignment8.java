package com.sgtesting.returnvalue;
//Given 2 1D double1 array,perform multiplication and return.
class MultiplicationDemo
{
	double[] Arraymutiplication(double d1[],double d2[])

	{
		double d3[]=new double[d1.length];

		for(int i=0;i<d1.length;i++)
	
				{
					d3[i]=d1[i]*d2[i];
				}					

			return d3;

	}
}
public class ReturnAssignment8 {

	public static void main(String[] args) {
		MultiplicationDemo o=new MultiplicationDemo();
		double d1[]= {1.2,2.2,3.2,4.2,5.1,6.2};
		double d2[]= {1.2,2.2,3.2,4.2,5.1,6.3};
		double d3[]=o.Arraymutiplication(d1,d2);

		for(int k=0;k<d3.length;k++)
		{
			System.out.println(d3[k]);
		}


	}

}
