package org.universityPortal;

public class Faculty extends Person {
	private int salary;
	
	public Faculty()
	{
		
	}
	public Faculty(String name,int age, int id,String city,String state,int salary)
	{
		super(name,age,id,city,state);
		this.salary=salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public void login()
	{
		System.out.println("Faculty login sucessfully done");
	}
	

}
