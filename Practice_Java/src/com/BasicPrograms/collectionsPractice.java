package com.BasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class collectionsPractice {
	public static void main(String[] args) {
		
		//list
		List<Integer> list = new ArrayList<>(Arrays.asList(23,32,44,55,66,77,88));
		System.out.println(list);
		for(Integer l:list) {
			System.out.println(l);
		}
		
		System.out.println("*************************************");
	//set
		Set<String> set = new HashSet<>();
		set.add("hello");
		set.add("world");
		set.add("ok!");
		set.add("hello");
		for(String s:set) {
			System.out.println(s);
		}
		System.out.println("*************************************");
		//HashMap
		Map<Integer,String> hm = new HashMap<>();
		hm.put(33, "John");
		hm.put(27, "Eric");
		hm.put(33, "Holland");
		hm.put(23, "Lisa");
		
		for(Entry<Integer,String> e:hm.entrySet()) {
			System.out.println(e.getKey()+"   "+
			e.getValue());
			
			
			
		}
		
		
		
	}

}
