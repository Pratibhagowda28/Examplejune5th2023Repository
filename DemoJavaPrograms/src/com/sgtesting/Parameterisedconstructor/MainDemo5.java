package com.sgtesting.Parameterisedconstructor;


class Country
{
	String Countryname;
	int NumberofStates;
	String Capitalcity;
	String Presidentofcountry;
	Country(String cname,int nofstates,String ccity,String president)
	{
		Countryname=cname;
		NumberofStates=nofstates;
		Capitalcity=ccity;
		Presidentofcountry=president;
	
		System.out.println("The name of Country is: "+Countryname);
		System.out.println("Number of states: "+NumberofStates);
		System.out.println("The Capitalcity is: "+Capitalcity);
		System.out.println("The President of Country is: "+Presidentofcountry);
		System.out.println("------------------------------------------------------");
	}

}
class State
{
	String Statename;
	String Statecapitalcity;
	int NumberofDistricts;
	String Statecrop;
	State(String sname,String sccity,int nod,String scrop)
	{
		Statename=sname;
		Statecapitalcity=sccity;
		NumberofDistricts=nod;
		Statecrop=scrop;
		
		System.out.println("The name of State is: "+Statename);
		System.out.println("Capital city is: "+Statecapitalcity);
		System.out.println("Number of Districts: "+NumberofDistricts);
		System.out.println("The State crop is: "+Statecrop);
		System.out.println("------------------------------------------------------");
	}
}
class District
{
	String Districtname;
	String Districtcrop;
	int Numberoftaluqs;
	String Famousfood;
	District(String dname,String dcrop,int notaluk,String ffood)
	{
		Districtname=dname;
		Districtcrop=dcrop;
		Numberoftaluqs=notaluk;
		Famousfood=ffood;
		
		System.out.println("The name of District is: "+Districtname);
		System.out.println("District crop is: "+Districtcrop);
		System.out.println("Number of Taluks: "+Numberoftaluqs);
		System.out.println("The Famous food is: "+Famousfood);
		System.out.println("------------------------------------------------------");
	}
}

public class MainDemo5 {

	public static void main(String[] args) {
		Country c1=new Country("INDIA",28,"Delhi","DroupadiMurmu");
		State s1=new State("Karnataka","Bangalore",31,"Coconut");
		District d1=new District("Tumkur","Ragi",10,"Idly Sambhar");
	

			}

		}
