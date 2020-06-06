package org.objectCommunicaton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee sai=new Employee();
		sai.id=1;
		sai.name="Sai";
		sai.address.state="Ohio";
		sai.address.country="USA";
		sai.address.city="Dayton";
		sai.address.zipcode=45410;
		System.out.println(sai.address.city);

		
		Seller chandu=new Seller();
		Address a=new Address();
		a.state="kentucky";
		chandu.address=a;
		
	}

}
