package org.session6.Polymorphism;

public class Customer {
	private int age;
	private String name;
	private String city;
	private String street;
	private int hno;
	
	

	public int getHno() {
		return hno;
	}

	//public void setHno(int hno) {
		//this.hno = hno;
	//}

	public Customer()// default constructor
	{
	}

	/// constructor overloading
	public Customer(int age, String name, String city) {
		this.age = age;
		this.name = name;
		this.city = city;
	}

	public Customer(String city, String name, int age) {
		this.name = name;
		this.name = name;
		this.age = age;

	}

	public Customer(int age, String name, String city, String street) {
		this.age = age;
		this.name = name;
		this.city = city;
		this.street = street;
	}

	void info() {
		System.out.println("age is "  + age +"," + "name is :" + name + "," + "city is: " + city);
	}

	@Override
	public String toString() {
		return "Customer [age=" + age + ", name=" + name + ", city=" + city + ", street=" + street + ", hno=" + hno
				+ "]";
	}
	

	/*
	 * public int getAge() { return age; } public void setAge(int age) { this.age =
	 * age; } public String getName() { return name; } public void setName(String
	 * name) { this.name = name; } public String getCity() { return city; } public
	 * void setCity(String city) { this.city = city; } public String getStreet() {
	 * return street; } public void setStreet(String street) { this.street = street;
	 * }
	 */

}
