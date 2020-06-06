package org.returnMultipleAddress;

public class Address {
private String city;
private String country;
private String state;
private String type;

public String getCompleteAddress() {
	return city + country + state;
}
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
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

}
