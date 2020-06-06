package org.session10.Collections.SET;

public class Student implements Comparable<Object> {
	private String id;
	private String name;
	
	Student(String id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		
		return id.hashCode() + name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Student students=(Student)obj;
		return id.equals(students.getId()) && name.equals(students.getName());
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		Student studentTree=(Student)o;
	
		return  id.compareTo(studentTree.getId());
	}
	

	

}
