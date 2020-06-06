package org.session10.Collections.SET;

import java.util.Comparator;

import org.session11.MapCollections.Student;

public class StudentIDComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

	
}
