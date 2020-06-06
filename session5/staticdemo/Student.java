package org.session5.staticdemo;

public class Student {
	private int id;
	private String name;
	public static final String SCHOOL = "nvcs";// when using final make variable in capitals.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
