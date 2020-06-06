package org.session4.objectcommunication;

public class Main {
	public static void main(String[] args) {
		Student sai = new Student();
		sai.setAge(20);
		sai.setGrade(6);
		sai.setId(101622866);
		Address saiAddress = new Address();
		saiAddress.setAptno(9);
		saiAddress.setCity("dayton");
		// s1.setAddress(a1);
		sai.setAddress(saiAddress);
		System.out.println("The address is :" + sai.getAddress().getAptno());
		Student chandu = new Student();
		chandu.setAge(26);
		chandu.setGrade(8);
		chandu.setId(101622366);
		Address chanduAddress = new Address();
		chanduAddress.setAptno(402);
		chanduAddress.setCity("frankfort");
		chandu.setAddress(chanduAddress);
		System.out.println("chandu's data is :" + chandu.getAddress().getAptno());
		System.out.println("chandu address is :"+chandu.getAddress().getCity());
		Address adress=new Address();
		sai.setAddress(adress);
		System.out.println(sai.getAddress().getCity());
	
		

	}

}
