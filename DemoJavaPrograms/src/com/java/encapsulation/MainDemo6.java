package com.java.encapsulation;
class Country
{
    String Countryname;
    int NumberofStates;
    String Capitalcity;
    String Presidentofcountry;

}
class State
{
	String Statename;
	String Statecapitalcity;
	int NumberofDistricts;
	String Statecrop;
}
class District
{
	String Districtname;
	String Districtcrop;
	int Numberoftaluqs;
	String Famousfood;
}

public class MainDemo6 {

	public static void main(String[] args) {
		Country c1=new Country();
		c1.Countryname="INDIA";
		c1.NumberofStates=28;
		c1.Capitalcity="Delhi";
		c1.Presidentofcountry="DroupadiMurmu";
		
		System.out.println("The name of Country is: "+c1.Countryname);
		System.out.println("Number of states: "+c1.NumberofStates);
		System.out.println("The Capitalcity is: "+c1.Capitalcity);
		System.out.println("The President of Country is: "+c1.Presidentofcountry);
		System.out.println("------------------------------------------------------");
		
		State s1=new State();
		s1.Statename="Karnataka";
		s1.Statecapitalcity="Bangalore";
		s1.NumberofDistricts=31;
		s1.Statecrop="Coconut";
		

		System.out.println("The name of State is: "+s1.Statename);
		System.out.println("Capital city is: "+s1.Statecapitalcity);
		System.out.println("Number of Districts: "+s1.NumberofDistricts);
		System.out.println("The State crop is: "+s1.Statecrop);
		System.out.println("------------------------------------------------------");
		
		District d1=new District();
		d1.Districtname="Tumkur";
		d1.Districtcrop="Ragi";
		d1.Numberoftaluqs=10;
		d1.Famousfood="Idly Sambhar";
		

		System.out.println("The name of District is: "+d1.Districtname);
		System.out.println("District crop is: "+d1.Districtcrop);
		System.out.println("Number of Taluks: "+d1.Numberoftaluqs);
		System.out.println("The Famous food is: "+d1.Famousfood);
		System.out.println("------------------------------------------------------");
	}

}
