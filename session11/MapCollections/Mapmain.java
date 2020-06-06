package org.session11.MapCollections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Mapmain {

	public static void main(String[] args) {
		Map<String, Integer>ratingsMap=new HashMap<>();
		ratingsMap.put("India", 1);
		ratingsMap.put("Australia", 2);
		ratingsMap.put("India", 4);
		System.out.println(ratingsMap);
		
		//ratingsMap.remove("India");
		//ratingsMap.clear();
		//System.out.println(ratingsMap);
		//iterating over an for each
		for(Map.Entry<String, Integer> entry:ratingsMap.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		//System.out.println("entering iterator");
		// using Itearator
		Iterator<Map.Entry<String, Integer>> it=ratingsMap.entrySet().iterator();
		while(it.hasNext())
		{
			
			//System.out.println(it.next());
			Map.Entry<String, Integer> entry=it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		Student sai = new Student("102", "Sai");
		Student saiKumar = new Student("103", "PavanSai");
		Student kiran = new Student("104", "Sai");
		Student mahesh = sai;
		Map<Student, Boolean>studentMap=new HashMap<>();
		studentMap.put(sai, true);
		studentMap.put(saiKumar, true);
		studentMap.put(kiran, true);
		studentMap.put(mahesh, true);
		System.out.println("size : "+studentMap.size());
		System.out.println(studentMap);
		Map<String, List<String>>countriesMap=new HashMap<>();
          List<String>usstates=Arrays.asList("NY","ohio","NJ");
          List<String>indiastates=Arrays.asList("TN","AP","TS");
          countriesMap.put("USA", usstates);
          countriesMap.put("INDIA", indiastates);
          System.out.println(countriesMap);
          System.out.println(countriesMap.get("USA"));
         
        
	
		
		
		
		
		
		
		
		
	
		
		
		
		
		
       
	}

}
