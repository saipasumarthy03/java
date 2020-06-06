package org.session9.StringANdStringBuffer;

public class StringBufferMain {
	
	public static void main(String[] args) {
		String fName="sai";
	    fName=fName.concat("Pasumarthy");
	    System.out.println(fName);
	    String s=fName+ "pasumarthy";
	    System.out.println(s);
	    String s1=s+"hiu";
	    System.out.println(s1);
	    String s2=s1.concat("how");
	    System.out.println(s2.concat(s).concat(  fName));
	   
	    
	    //StringBuffer
	    StringBuffer sb=new StringBuffer(10);
	    StringBuffer sb1=new StringBuffer("sai");
	    sb1.append("pasumarthy");
	    System.out.println(sb1);
	    System.out.println(sb.capacity());
	   sb1.setLength(15);
	   System.out.println(sb1);
	   sb1.setLength(5);
	   System.out.println(sb1);
	   sb1.setLength(6);
	   System.out.println(sb1);
	   System.out.println("String is :"+sb1.toString());
	  // System.out.println(sb1.append("hello"));
	   String k=sb1.toString();
	   System.out.println(sb1.append("sai"));
	   System.out.println(k);
		  
		  
	   
	    
	    
	    
	    
		
		
	}

}
