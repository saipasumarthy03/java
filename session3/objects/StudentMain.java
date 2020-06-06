package org.session3.objects;

public class StudentMain {
	public static void main(String[] args) {
		//object1
		Student s1=new Student();
		s1.sname="sai";///.>>>to set values in to object
		s1.sage=23;
		s1.status=true;
		s1.sid=2;
		
		//object2
		Student s2=new Student();
		s2.sname="chandu";
		s2.sage=26;
        s2.status=true;
        s2.sid=1;
        
        s2.sid=3;/// Takes the updated value
        
        System.out.println("name of s1 is :" +s1.sname);////.> to get the values
        System.out.println("ID of s2 is : " + s2.sid );
        
        /// calling the methods
        s1.print();
        s2.print();
        
        
	}
	
}
	
