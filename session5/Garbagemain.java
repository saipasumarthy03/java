package org.session5;

public class Garbagemain {
public static void main(String[] args) {
	AddressGrabage a1=new AddressGrabage();
	a1.setName("sai");
	a1.setAge(21);
	
	AddressGrabage a2=new AddressGrabage();
	a2.setName("mandeep");
	a2.setAge(20);
	
	
	
	//how to break links programatically?
	
	a1=null;
	//a2=null;
	 a1=new AddressGrabage();
	 a1.setName("sai");
	 a1.setAge(29);
	 AddressGrabage a3= a1;
	System.out.println(a3.getAge());
	System.out.println(a3.getName());
	 a2=a1;
	 System.out.println("the value is :" +a2.getAge());			
	 
	
	
	
	
	
	
	
}


}
