package com.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String,Integer> employeeAge = new HashMap<>();
		employeeAge.put("John", 44);
		employeeAge.put("Joe", 24);
		employeeAge.put("Lisa", 34);
		employeeAge.put("Lauren", 25);
		employeeAge.put("Steven", 47);
		
				for(Entry <String,Integer> emp: employeeAge.entrySet() ) {
					
					
					System.out.println(emp.getKey() +" = " +emp.getValue());
				}
				System.out.println("**************************************************************");
				
				System.out.println(employeeAge.get("Lisa"));
				System.out.println(employeeAge.containsKey("Steven"));
				System.out.println(employeeAge.containsKey("Nate"));

	}

}
