package org.universityPortal;

public class Person {
	private int id;
	private String city;
	private String state;
	private String name;
	private int age;
	public Person()
	{
		
	}
	public Person(String name,int age, int id,String city,String state)
	{
		this.name=name;
		this.age=age;
		this.id=id;
		this.city=city;
		this.state=state;
	}
	
	public void showAverage()
	{
		
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
		System.out.println("login is successfull");
	}
	public final void logout()
	{
		
	}
	public String toString()
	{
		return "Person [name=" + name + ",Age ="+ age +", id=" + id + ", city=" + city + ", state=" + state + "]";
	}

}
