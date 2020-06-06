package org.session7.inheritance;

public class Employee {
	private int id;
	private int age;
	private int salary;
	
	
	public Employee(int id,int age)
	{
		this.id=id;
		this.age=age;
	}
	
	public Employee(int id,int age, int salary)
	{
		this(id,age);
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", salary=" + salary + "]";
	}
	
	

}
