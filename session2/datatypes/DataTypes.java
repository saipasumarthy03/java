package org.session2.datatypes;

public class DataTypes {
	//integral datatypes
	byte age=28;
	short age_s =145;
	int  age_i = 190;
	long age_l= 200;
	
	//floating datatypes
	float pi=3.14f;
	double d=345.345;
	
	//boolean
	boolean b =true;
	
	//character
	char gender='m';
	
	// can i assign one datatype to other
	 //smaller to larger
	short age_b_s= age;//implicit
	//larger to smaller
	byte age_b= (byte) age_s;//explicit
	
	// how can i assign integral datatype to float datatype
	public static void main(String[] args) {
		int age_sss=200;
		byte age_si= (byte) age_sss;
		System.out.println(age_si);
		 //String name ="sai";
		// int a= (int)name;
		  
		 
		 
		
	}
}
