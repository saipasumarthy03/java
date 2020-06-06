package org.session12.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import org.session5.AddressGrabage;

public class WeakIdentity {
	public static void main(String[] args) {
		Map<String, AddressGrabage>strongMap=new HashMap<>();
		Map<String, AddressGrabage>weakMap=new WeakHashMap<>();
		AddressGrabage a1=new AddressGrabage("sai",20);
		AddressGrabage a2=new AddressGrabage("harsha",20);
		String s1=new String("sai");
		String s2=new String("harsha");
		strongMap.put(s1, a1);
		weakMap.put(s2, a2);
		s1=null;
		s2=null;
		System.gc();
		System.out.println(strongMap);
		System.out.println(weakMap);
		
		
		
		
		
	}

}
