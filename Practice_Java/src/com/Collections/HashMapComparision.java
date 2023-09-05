package com.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapComparision {
	 public static <K, V> boolean compareMaps(Map<K, V> companyOne, Map<K, V> employees) {
	        if (companyOne.size() != employees.size()) {
	        	System.out.println("False - Both HashMaps are not equal in size");
	            return false;
	        }

	        for (K key : companyOne.keySet()) {
	            if (!employees.containsKey(key)) {
	            	System.out.println("False");
	                return false;
	            }
	            if (!companyOne.get(key).equals(employees.get(key))) {
	            	System.out.println("False");
	                return false;
	            }
	        }
	        System.out.println("True- ALl the content in both hashmaps are same");
	        return true;
	    }
	public static void main(String[] args) {
		
		Map<String,Integer> companyOne = new HashMap<>();
		companyOne.put("John", 44);
		companyOne.put("Joe", 24);
		companyOne.put("Lisa", 34);
		companyOne.put("Lauren", 25);
		companyOne.put("Steven", null);
		System.out.println("Original: \n"+companyOne.toString());
	
		Map<String,Integer> employees = new HashMap<>();
		employees.put("John", 44);
		employees.put("Joe", 24);
		employees.put("Lisa", 34);
		employees.put("Steven", 47);
		employees.put("Lauren", 25);
		
		//compareMaps(companyOne, employees);
		
		System.out.println(companyOne.containsKey("Joe"));
		
		companyOne.putIfAbsent("Rebecca", 38);
		System.out.println(companyOne.entrySet());
		companyOne.putIfAbsent("Jane", 24);
		Integer g = companyOne.putIfAbsent("Steven", 34);
		System.out.println(g);
	
	System.out.println(companyOne.toString());
	
}
}
