package org.session7.inheritance;

public class Person {
	private String name;
	private int id;
	private String city;
	private String state;
	
	
	public Person()
	{
		// creating default constructor
		System.out.println("i am called from child class  using super keyword");
	}
	
	public Person(String name, int id, String city, String state) {
	
	this.name=name;
	this.id=id;
	this.city=city;
	this.state=state;
	
		
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	public void login()
	{
		System.out.println("hai i am in parent class");
		test();// in order to call test method which is private
	}
	public final void logout()
	{
		
	}
	private void test()
	{
		System.out.println("i am inside test method");
	}
	public static void printSomething(String name)
	{
		System.out.println("my name is : "+name);
	}
	public void print()
	{
		
	}
	public static void key()
	{
	System.out.println("sai");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", city=" + city + ", state=" + state + "]";
	}




}
