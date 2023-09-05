package com.Strings;

public class NumberOfPalindromesInAString {
		public static void main(String[] args) {
			
			String sentence = "mom dad kid";
			int count = 0;
			
			String[] word = sentence.split(" ");
			for(String w:word) {
				String rev="";
				for(int i=w.length()-1;i>=0;i--) {
					rev = rev+ w.charAt(i);
					
				}
				if(w.equalsIgnoreCase(rev)) {
					System.out.println(rev);
					count++;
				}
			}
			System.out.println(count);
		}
}
