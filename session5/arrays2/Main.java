package org.session5.arrays2;

import org.session5.staticdemo.main;

public class Main {

	static int[] numbers = { 1, 2, 3, 4, 5 };

	public static void printNumbers(int[] numberspassed) {
		for (int i = 0; i < numberspassed.length; i++) {

			System.out.println(numbers[i]);
		}
	}

	public static void main(String[] args) {
		Student sai = new Student();
		sai.setName("Sai");
		sai.setId(1);
		Subject[] subject = new Subject[3];
		subject[0] = new Subject();
		subject[0].setName("Physics");
		subject[0].setId(102);
		subject[0].setCode("ph");

		subject[1] = new Subject();
		subject[1].setName("Maths");
		subject[1].setId(101);
		subject[1].setCode("M");

		subject[2] = new Subject();
		subject[2].setName("Chemistry");
		subject[2].setId(103);
		subject[2].setCode("CH");

		sai.setSubjectsEnrolled(subject);

		System.out.println(sai.getName());
		System.out.println(sai.getId());
		Subject[] saiSubjects = sai.getSubjectsEnrolled();
		for (int i = 0; i < saiSubjects.length; i++) {

			Subject subject1 = subject[i];
			System.out.println(subject1.getCode());
			System.out.println(subject1.getName());
			System.out.println(subject1.getId());

		}

		Student chandu = new Student();
		chandu.setName("Chandraveer");
		chandu.setId(2);
		Subject[] subjects = new Subject[2];
		subjects[0] = new Subject();
		subjects[0].setName("Maths");
		subjects[0].setId(101);
		subjects[0].setCode("M");

		subjects[1] = new Subject();
		subjects[1].setName("Physics");
		subjects[1].setId(103);
		subjects[1].setCode("PH");
		chandu.setSubjectsEnrolled(subjects);
		Subject[] chanduSubjects = chandu.getSubjectsEnrolled();
		for (int i = 0; i < chanduSubjects.length; i++) {
			Subject subject1 = subjects[i];
			System.out.println(subject1.getCode());
			System.out.println(subject1.getId());
		}

		printNumbers(numbers);

	}
}
