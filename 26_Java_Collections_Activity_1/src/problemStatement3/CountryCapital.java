package problemStatement3;

import java.util.ArrayList;
import java.util.HashMap;

public class CountryCapital {
HashMap<String,String> CountryMap=new HashMap<>();
public HashMap<String,String> storeCountryCapital(String CountryName,String Capital)
{
	CountryMap.put(CountryName,Capital);
	return CountryMap;
}
public String retrieveCapital(String CountryName)
{
	if(CountryMap.containsKey(CountryName))
		return CountryMap.get(CountryName);
	return null;
}
public String retrieveCountry(String capitalName)
{
	if(CountryMap.containsValue(capitalName))
	{
		for (String key : CountryMap.keySet()) {
			if (capitalName.equals(CountryMap.get(key))) 
				return key;
		}

	}

	return null;
}
public HashMap<String,String> reverseKeyAndValue()
{
	HashMap<String,String> hm=new HashMap<>();
	for (String key : CountryMap.keySet()) {
		hm.put(CountryMap.get(key),key);
	}
	return hm;
}
public ArrayList<String> listOfCountries()
{ArrayList<String> ar=new ArrayList<>();
for (String key : CountryMap.keySet()) {
	ar.add(key);
}
return ar;
	
}
}