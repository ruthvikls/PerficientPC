package com.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class CharacterOccurence {
	public static void main(String[] args) {
		String name = "Welcome to Wipro";
		
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(char character : name.toCharArray()) {
			
			if(character != ' ') {
				if(hm.containsKey(character)) {
					hm.put(character, hm.get(character)+1);
				}
				else {
					hm.put(character, 1);
				}
				
			}
		}
		List<Integer> list = new ArrayList<>();
		for(Entry<Character, Integer> e:hm.entrySet()) {
			
			System.out.println(e.getKey() +" contains "+ e.getValue());
			
			list.add(e.getValue());
		}
		
		Collections.sort(list);
		int size = list.size();
		list.get(size-1);
		System.out.println(list.get(size-1));
		
	}

}
