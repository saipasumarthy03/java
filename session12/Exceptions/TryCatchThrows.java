package org.session12.Exceptions;

import java.util.Arrays;
import java.util.List;

public class TryCatchThrows {

	static void checkAgeRuntime(int age) { 
	    if (age < 18) {
	      throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
	    } else {
	      System.out.println("Access granted - You are old enough!"); 
	    }
	}
	List<String>orderIds=Arrays.asList("1","2","3","4");
	public    String checkOrderList(String order) throws OrderNotFoundException {
		//if order not found
		if(!orderIds.contains(order)){
			throw new OrderNotFoundException(" order is not found");
			
		}
		else {
			for (String oid: orderIds) {
				if(oid.equals(order))
					System.out.println("order is found");
			}
		}
		return null;
	}
	    
	  public static void main (String [] args) {

		try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		    }
		checkAgeRuntime(19);
		TryCatchThrows t=new TryCatchThrows();
		try {
			t.checkOrderList("5");
		} catch (OrderNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		  }
	
		
	

}
