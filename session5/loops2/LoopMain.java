package org.session5.loops2;

public class LoopMain {

	public static void main(String[] args) {
		int []numbers= {1,2,3,4,5,6};
		// for
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			
		}
		// for each loop
		for (int i : numbers) {
			System.out.println(i);
			
		}
		
		// while
		int k=0;
		while(k<numbers.length)
		{
			System.out.println(numbers[k]);
			k++;
		}
		//do while
		int j=0;
		do {
			System.out.println(numbers[j]);
			j++;
		}while(j<numbers.length);
	}
}
;