package problemStatement3;

import java.util.ArrayList;
import java.util.HashMap;

public class CountryCapitalTest {

	public static void main(String[] args) {
		CountryCapital cc = new CountryCapital();
		HashMap<String, String> h1 = cc.storeCountryCapital("India", "Delhi");
		HashMap<String, String> h2 = cc.storeCountryCapital("Japan", "Tokyo");
		System.out.println("Capital of India:" + cc.retrieveCapital("India"));
		System.out.println("Country whose capital is Tokyo:" + cc.retrieveCountry("Tokyo"));
		System.out.println("capital-country map");
		HashMap<String, String> m2 = cc.reverseKeyAndValue();
		for (String key : m2.keySet()) {
			System.out.println(key + ":" + m2.get(key));
		}
		System.out.println("List of Countries");
		ArrayList<String> countries = cc.listOfCountries();
		System.out.println(countries);
	}

}
