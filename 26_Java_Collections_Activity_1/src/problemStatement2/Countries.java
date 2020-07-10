package problemStatement2;

import java.util.HashSet;
import java.util.Iterator;

public class Countries {
HashSet<String> Country=new HashSet<>();
public HashSet<String> storeCountryNames(String CountryName)
{
	Country.add(CountryName);
	return Country;
}
public String retrieveCountry(String CountryName)
{
if(Country.contains(CountryName))
	return CountryName;
else
	return null;
}

}
