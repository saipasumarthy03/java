package org.session5.loops;

public class LoopMain {
	public static void main(String[] args) {
		int [] numbers= {1,2,3,4,5};
		for( int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
		//enhanced for loop
		for(int number : numbers)
		{
			System.out.println(number);
		}
		//while loop
		int k=0;
		while(k<numbers.length) {
			System.out.println(
					numbers[k]);
			k++;
		}
	//do while
		/*int j=0;
		do {
			System.out.println(numbers[j]);
		}while(j<numbers.length);*/
		
		
			
		
		

}
	}