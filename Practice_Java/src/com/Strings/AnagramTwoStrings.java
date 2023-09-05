package com.Strings;

import java.util.Arrays;

public class AnagramTwoStrings {
	
	public static boolean areAnagrams(String one, String two)
	{
		if(one.length()!=two.length()) {
			return false;
		}
		char[] onechar =one.toCharArray();
		char[]twochar = two.toCharArray();
		
		
		Arrays.sort(onechar);
		Arrays.sort(twochar);
		
		return Arrays.equals(onechar, twochar);
		
		
		
	}
	public static void main(String[] args) {
		
		String one = "listen";
		String two = "silent";
		if(areAnagrams(one, two)) {
			System.out.println("Perfect Anagrams");
		}
		else {
		System.out.println("Definitely not Anagrams");
		}
		}
		
	}


