package org.session9.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import org.session7.inheritance.Employee;

public class ListMain {

	public static void main(String[] args) {
		List<String> colorsList = new ArrayList<String>();
		colorsList.add("red");
		colorsList.add("blue");
		colorsList.add("green");
		colorsList.add("orange");
		System.out.println(colorsList);
		System.out.println(colorsList.size());
		System.out.println(colorsList.get(0));
		colorsList.remove(3);
		
		
		List<Integer>numbers1=new ArrayList<Integer>();
		numbers1.add(1);
		numbers1.add(2);
		numbers1.add(3);
		numbers1.add(4);
		System.out.println(numbers1);
		System.out.println(numbers1.get(0));
		

		List<Integer>numbers2=new LinkedList<Integer>();
		numbers2.add(1);
		numbers2.add(2);
		numbers2.add(3);
		numbers2.add(4);
		System.out.println(numbers2);
		System.out.println(numbers2.get(3));
		
		List<Integer>numbers3=new Vector<Integer>();
		numbers3.add(1);
		numbers3.add(2);
		numbers3.add(3);
		numbers3.add(4);
		System.out.println(numbers3);
		System.out.println(numbers3.get(3));
		
		List<Employee>employees=new ArrayList<Employee>();
		Employee sai=new Employee(20, 23);
		Employee chandu=new Employee(22, 23);
		employees.add(chandu);
		employees.add(sai);
		System.out.println(employees.toString());
		
		
		
		
		
		
		
		
		
		colorsList.clear();
		System.out.println(colorsList);
		
		//wrapper class
		//List<int>numbers=new ArrayList<>();// not possible because primitive data types are not supported
		 List<Integer>numbers=new ArrayList<Integer>();
		 numbers.add(1);
		 numbers.add(2);
		 System.out.println(numbers);
		 // to covert one datatype to another
		 String s="10";
		 int si=Integer.parseInt(s);
		 System.out.println(si);
		 String b=Integer.toString(si);
		 System.out.println(b);
		 int i=234;
		 System.out.println(Integer.reverse(i));
		 
	
		

	}

}
