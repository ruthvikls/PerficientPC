package com.BasicPrograms;

import java.util.HashSet;

public class demo44 {
	public static void main(String[] args) {
		String sent = "there you go";
		String[] each = sent.split("\\s");
		String rev = "";
		for(String w:each) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			rev = rev + sb.toString()+" ";
			
		}
		System.out.println(rev);
	System.out.println("remove duplicates from string");
	
	char[] e = sent.trim().toCharArray();
	
	HashSet<Character> hs =  new HashSet<>();
	StringBuilder sb = new StringBuilder();
	
	
	for(char d:e) {
		if(hs.add(d)) {
			sb.append(d);
		}
	}
	System.out.println(sb.toString());
	
	
	
	
	
	}
	

}
