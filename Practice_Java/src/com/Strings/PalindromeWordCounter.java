package com.Strings;

public class PalindromeWordCounter {
	
	    public static boolean isPalindrome(String word) {
	        StringBuilder reversed = new StringBuilder(word).reverse();
	        return word.equals(reversed.toString());
	    }

	    public static int countPalindromeWords(String input) {
	        String[] words = input.split("\\s");
	        int palindromeCount = 0;
	        
	        for (String word : words) {
	            if (isPalindrome(word)) {
	                palindromeCount++;
	            }
	        }
	        
	        return palindromeCount;
	    }

	    public static void main(String[] args) {
	        String input = "mom dad child";
	        int palindromeCount = countPalindromeWords(input);
	        System.out.println("Number of palindrome words: " + palindromeCount); // Output: Number of palindrome words: 2
	        
	        String demo ="test";
	        StringBuilder db = new StringBuilder(demo).reverse();
	        System.out.println(db.toString());
	        
	      ;
	        
	    }
	}



