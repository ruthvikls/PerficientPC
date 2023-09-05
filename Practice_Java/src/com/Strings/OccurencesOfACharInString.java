package com.Strings;

public class OccurencesOfACharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "avengers age of ultron";
		
		int lengthOfAString = name.length();
		int afterString = name.replaceAll("a", "").length();
		int original = lengthOfAString - afterString;
		System.out.println(original);

	}

}
