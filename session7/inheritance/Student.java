package org.session7.inheritance;

import java.util.Arrays;

public class Student extends Person {

	private String[] subjects;

	public Student() {
		// creating default constructor
		super();
	}

	public Student(String name, int id, String city, String state, String[] subjects) {
		super(name, id, city, state);
		this.subjects = subjects;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public void login() {
		super.login();// here super class login method is executed first.super-parentclass
		System.out.println("student login successfully started");
	}

	public static void printSomething(String name)

	{
		System.out.println("my name in student class is: " + name);
	}
	// cannot override the method signature

	public void print(int age) {
		System.out.println(age);
	}

	@Override
	public String toString() {
		return super.toString() + "Student [subjects=" + Arrays.toString(subjects) + "]";
	}
	

}
