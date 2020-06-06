package org.session13.RunTimeExceptions;


public class StepService {
	public static void step1() {
		System.out.println("In step1");
	}

	public static void step2() {
		
		System.out.println("In step2");
	}

	public static void step3() {
		System.out.println("In step 3");
		throw new StepFailedException("cannot reach to step4");
	}

	public static void step4() {
		System.out.println("In step4");
	}

	public static void main(String[] args)  {
		step1();
		step2();
		step3();
		step4();
	}

}
