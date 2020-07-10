package problemStatement2;

import java.util.HashSet;

public class CountriesTest {
	public static void main(String args[])
	{
	Countries c=new Countries();
	HashSet<String> hs=c.storeCountryNames("India");
	HashSet<String> hs1=c.storeCountryNames("Pakistan");
	HashSet<String> hs2=c.storeCountryNames("China");
	HashSet<String> hs3=c.storeCountryNames("Ireland");
	HashSet<String> hs4=c.storeCountryNames("France");
	String res1=c.retrieveCountry("India");
	String res2=c.retrieveCountry("Russia");
	if(res1==null)
	{
		System.out.println("India doesnt exist");
		
	}
	else
	{
		System.out.println("India exists");
	}
	if(res2==null)
	{
		System.out.println("Russia doesnt exist");
		
	}
	else
	{
		System.out.println("Russia exists");
	}
	

}
}