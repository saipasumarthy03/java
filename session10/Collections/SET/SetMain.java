package org.session10.Collections.SET;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.session11.MapCollections.Student;

public class SetMain {
	public static void main(String[] args) {
		Set<String> cars = new HashSet<String>();
		cars.add("honda");
		cars.add("maruti");
		cars.add("mercedes");
		cars.add("honda");
		System.out.println(cars.size());// duplicates are not allowed in set

		Set<Student> students = new HashSet<>();
		Student sai = new Student("102", "Sai");
		Student saiKumar = new Student("103", "PavanSai");
		Student kiran = new Student("104", "Sai");
		Student mahesh = sai;
		System.out.println(sai.hashCode());
		System.out.println(kiran.hashCode());
		System.out.println(mahesh.hashCode());
		System.out.println(saiKumar.hashCode());

		students.add(sai);
		students.add(kiran);
		students.add(saiKumar);
		students.add(mahesh);
		System.out.println(students.size());
		System.out.println(students);

		// LinkedhashSet
		Set<Student> studentslink = new LinkedHashSet<Student>();
		studentslink.add(sai);
		studentslink.add(kiran);
		studentslink.add(saiKumar);
		
		System.out.println(studentslink);
		
		System.out.println(studentslink.size());
		
		// Treeset
		Set<Student> studentsTree = new TreeSet<Student>();
		studentsTree.add(sai);
		studentsTree.add(kiran);
		studentsTree.add(saiKumar);
		System.out.println(studentsTree);
		
		Set<Student> studentsc = new TreeSet<Student>(new StudentIDComparator());
	
		
		studentsc.add(sai);
		studentsc.add(kiran);
		studentsc.add(saiKumar);
		System.out.println(studentsc);
		
		List<Student> studentsA = new ArrayList<>();

		studentsA.add(sai);
		studentsA.add(kiran);
		studentsA.add(saiKumar);
		studentsA.add(mahesh);
		System.out.println("hdsdh");
		//Collections.sort(studentsA);
		System.out.println(studentsA );
		
	   
	    Collections.sort(studentsA, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});


			
	    	
	    
	
	 
	}
}
