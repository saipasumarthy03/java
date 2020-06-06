package org.session5.arrays;

public class Main {
	public static void printNumbers(int[] numberspassed)
	{
		for(int i=0;i <numberspassed.length;i++) {
			System.out.println("numbers passed are :"+numberspassed[i]);
			
			
		}
			
	}
	public static void main(String[] args) {
		/*
		 * int[] numbers = { 1, 2, 3, 4, 5 }; // System.out.println(numbers[0]); int[]
		 * items = new int[10]; items[0] = 1; // System.out.println(items[0]); // multi
		 * int[][] matrix = { { 1, 2, 3 }, { 1, 2, 3 } }; //
		 * System.out.println(matrix[1][2]); Main[] classes = new Main[10];
		 * System.out.println(classes[1]); classes[1] = new Main();
		 * 
		 * System.out.println(classes[1]);
		 */
		int[] numbers = { 1, 2, 3, 4, 5 };

		/*Student sai = new Student();
		sai.setId(1);
		sai.setName("sai");
		Subject[] subject = new Subject[1];
		subject[1] = new Subject();
		subject[1].setCName("physics");
		subject[1].setCid(1);
		sai.setSubjectsEnrolled(subject);
		
		//what courses does sai enrolled to!!!
		//sai.getSubjectsEnrolled();
		//System.out.println(sai.getSubjectsEnrolled());
		Subject[] subjectsEnrolled = sai.getSubjectsEnrolled();
		Subject subject1 = subjectsEnrolled[1];
		subject1.getCid();
		subject1.getName(); 
		System.out.println(subject1.getName()); */
		
		/*Subject subject2 = subjectsEnrolled[2];
		subject2.getCid();
		subject2.getName(); */
		printNumbers(numbers);
		
	}
}
