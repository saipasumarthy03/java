package org.session7.inheritance;

public class PersonMain {
	public static void main(String[] args) {
		Person sai = new Person();
		sai.setName("sai");
		sai.setCity("dayton");
		System.out.println(sai.getCity());
		Person chandu = new Person();
		chandu.setName("chandu");
		chandu.login();
		System.out.println(chandu.getName());
		Faculty kumar = new Faculty();
		kumar.teaches();
		kumar.login();
		kumar.test();
		sai.login();
		kumar.printSomething("mahesh");
		Student abhi = new Student();
		abhi.printSomething("abhinav");
		kumar.printSomething("mahesh");
		abhi.print(20);
		Person.key();
		String[] sub = { "physics", "maths" };
		Student pretty = new Student("pretty", 20, "hyd", "madhapur", sub);
		System.out.println(pretty.getId());
		Student pinky = new Student();
		System.out.println(pretty);
		sai.login();

	}

}
