package com.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class iterateOverHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> countries = new HashMap<>();

		countries.put("USA", "Washington");
		countries.put("India", "New Delhi");
		countries.put("Russia", "Moscow");
		System.out.println("Before Sorting :");
		for (Entry<String, String> element : countries.entrySet()) {
			String key = element.getKey();
			String value = element.getValue();
			
			System.out.println(key + "  -->  " + value);
		}

			Map<String,String> treeMap = new TreeMap<>(countries);
			System.out.println("After Sorting :");
			for(Entry<String, String> t: treeMap.entrySet()) {
				String key = t.getKey();
			String value = 	t.getValue();
			System.out.println(key+" --> "+value);
			}
	}

}
