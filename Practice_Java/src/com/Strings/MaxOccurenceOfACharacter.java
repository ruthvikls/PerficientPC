package com.Strings;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurenceOfACharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Iamagoodperson";
		HashMap<Character,Integer> hm = new HashMap<>();
		
		char[] c = s.toCharArray();
		
		for(char ch:c) {
			
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
		
		int maxCount=0;
		char maxChar =' ';
		for(Map.Entry<Character, Integer> gh:hm.entrySet()) {
			if(maxCount<gh.getValue()) {
				maxCount=gh.getValue();
				maxChar = gh.getKey();
			} 
			
		}
		System.out.println("Max occurence is = "+maxChar + " Occuring= "+maxCount +"times");

	}

}
