package org.session5.loops2;

public class BreakAndContinue {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;// comes out from the loop
			}
			System.out.println(i);
		}

		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				continue;// it continues to the next the iteration.
			}
			System.out.println(i);
		}

	}

}
