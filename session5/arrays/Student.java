package org.session5.arrays;

public class Student {
	private int id;
	private String name;
	private Subject[] subjectsEnrolled;

	public Subject[] getSubjectsEnrolled() {
		return subjectsEnrolled;
	}

	public void setSubjectsEnrolled(Subject[] subjectsEnrolled) {
		this.subjectsEnrolled = subjectsEnrolled;
	}

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
