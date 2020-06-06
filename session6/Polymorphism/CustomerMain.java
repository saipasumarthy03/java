package org.session6.Polymorphism;

public class CustomerMain {
	public static void main(String[] args) {
		
		/*Customer sai=new Customer();
		sai.setAge(20);
		sai.setCity("dayton");
		sai.setName("sai");
		sai.setStreet("medford");*/
		// if we want for another object we do the same thing in order to avoid those things we are using constructor overloading
		
		
		Customer sai=new Customer(20,"sai","dayton");
		Customer harsha= new Customer("dayton","harsha",24);
		Customer bhuma=new Customer(26 ,"bhuma","khammam","mamatha road");
		System.out.println(sai.toString());
		
		Customer k=new Customer();
		
		
		sai.info();
		harsha.info();
		bhuma.info();
		System.out.println(k.getHno());
		
		
		
		
		
	}
	

}
