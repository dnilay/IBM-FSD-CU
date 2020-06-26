package com.jpassion.di;

public class Address {
	
	private String city = "Boston";
	private String country = "U.S.A.";
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String retrieveAddressInfo(){
		return getCountry() + " " + getCity();
	}
}
