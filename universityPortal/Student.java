package org.universityPortal;

import java.util.Arrays;

public class Student extends Person {
	private int subjectTotal;
	
	
	
	public Student()
	{
		
	}
	public Student(String name,int age, int id,String city,String state,int subjectTotal)
	{
		super(name,age,id,city,state);
		this.subjectTotal=subjectTotal;
	}
	public int getSubjectTotal() {
		return subjectTotal;
	}

	public void setSubjectTotal(int subjectTotal) {
		this.subjectTotal = subjectTotal;
	}
	
	@Override
	public void login()
	{
		System.out.println("student successfully logged in");
	}
	
	@Override
	public String toString()
	{
		return super.toString()+ "Student[subjecttotal=" + subjectTotal + "]";
	}
	public void showAverage()
	{
		int average;
		average=(subjectTotal/5);
	}
	

}
