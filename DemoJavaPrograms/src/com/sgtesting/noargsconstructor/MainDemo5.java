package com.sgtesting.noargsconstructor;

class Country
{
	String Countryname="INDIA";
	int NumberofStates=28;
	String Capitalcity="Delhi";
	String Presidentofcountry="DroupadiMurmu";
	Country()
	{
		System.out.println("The name of Country is: "+Countryname);
		System.out.println("Number of states: "+NumberofStates);
		System.out.println("The Capitalcity is: "+Capitalcity);
		System.out.println("The President of Country is: "+Presidentofcountry);
		System.out.println("------------------------------------------------------");
	}

}
class State
{
	String Statename="Karnataka";
	String Statecapitalcity="Bangalore";
	int NumberofDistricts=31;
	String Statecrop="Coconut";
	State()
	{
		System.out.println("The name of State is: "+Statename);
		System.out.println("Capital city is: "+Statecapitalcity);
		System.out.println("Number of Districts: "+NumberofDistricts);
		System.out.println("The State crop is: "+Statecrop);
		System.out.println("------------------------------------------------------");
	}
}
class District
{
	String Districtname="Tumkur";
	String Districtcrop="Ragi";
	int Numberoftaluqs=10;
	String Famousfood="Idly Sambhar";
	District()
	{
		System.out.println("The name of District is: "+Districtname);
		System.out.println("District crop is: "+Districtcrop);
		System.out.println("Number of Taluks: "+Numberoftaluqs);
		System.out.println("The Famous food is: "+Famousfood);
		System.out.println("------------------------------------------------------");
	}
}

public class MainDemo5 {

	public static void main(String[] args) {
		Country c1=new Country();
		State s1=new State();
		District d1=new District();
	}

}
