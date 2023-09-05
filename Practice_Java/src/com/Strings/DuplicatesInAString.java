package com.Strings;

import java.util.HashSet;

public class DuplicatesInAString {
	public static void main(String[] args) {
		
		String name = "welcome to moolya";
		char ch[] = name.trim()
				.toCharArray();
		
		HashSet<Character> hs = new HashSet<>();
		HashSet<Character> duplicates = new HashSet<>(); 
		
		for(char c:ch) {
	
			if(hs.add(c)==false) {
				duplicates.add(c);
		
			}
		}
		for(char dp:duplicates) {
			System.out.println(dp);
		}
	
		
		
	}

}
