package org.universityPortal;

public class PersonMain {
	public static void main(String[] args) {
		Student sai =new Student("sai",22,100,"Dayton","Ohio",90);
		Student chandu=new Student("Chandraveer",25,101,"Frankfort","Kentucky",99);
		Student abhi=new Student("Abhinav",28,102,"Nj","New jersey",98);
		Student pinky=new Student("Priyanka",30,103,"Mason","Arizona",100);
		Student mouni=new Student("Mounika",24,104,"Dayton","Ohio",98);
		System.out.println(sai.getSubjectTotal());
		System.out.println(chandu.getSubjectTotal());
		System.out.println(abhi.getSubjectTotal());
		System.out.println(pinky.getSubjectTotal());
		System.out.println(mouni.getSubjectTotal());
		Faculty pretty=new Faculty("Pretty",25,90,"Hyderabad","TG",50000);
		Faculty krishna=new Faculty("Krishna",30,91,"Rajamundhry","AP",60666);
		Faculty swetha=new Faculty("Swetha",36,92,"utmand","pennyslyvaniava",100000);
		Faculty chandra=new Faculty("Chandu",25,93,"Cinccinati","ohio",350000);
		Faculty arjun=new Faculty("Arjun",15,94,"Matukundh","colombia",9090909);
		
		 double average;
		
		 Student[] student=new Student[5];
		 student[0]=sai;
		 student[1]=chandu;
		 student[2]=abhi;
		 student[3]=pinky;
		 student[4]=mouni;
		 int result=0;
		for( int i=0;i<student.length;i++)
		{
		Student student1=student[i];
		result=result+student1.getSubjectTotal();	
			 }
		 System.out.println(result); 
		 average=(result/student.length);
	     System.out.println(average);
	     
	     
	     
	    
	     
	     
	     
	     
	     
	    
			
			
			
		 
		
		
		
		
		
		
		
		
				
		
	

}
}
