package com.MostAskedIQ;

import java.util.HashMap;

public class MaxOccurenceOfACharacterInString {
	
	
	public static void main(String[] args) {


			String name = "testing for testers";
			
			HashMap<Character,Integer> hashMap = new HashMap<>();
			
			char[] splitName = name.toCharArray();
			
			for(char eachLetter:splitName) {
				
				if(hashMap.containsKey(eachLetter)) {
					hashMap.put(eachLetter, hashMap.get(eachLetter)+1);
				}
				else
				{
					hashMap.put(eachLetter, 1);
				}
				
			}
			
			System.out.println(name + " : "+ hashMap);
			
			
	}

}
