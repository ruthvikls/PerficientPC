package com.MostAskedIQ;

public class lastThreeCaractersInAString {

	public static void main(String[] args) {

		String name = "testing";

		// char[] eachName = name.toCharArray();
		// using split method
		String split = name.split("est")[1];
		split.toUpperCase();
		System.out.println(split.toUpperCase());

		// using substring method
		String subStirng = name.substring(name.length() - 3);
		System.out.println(subStirng.toUpperCase());

		System.out.println(name.length());

		String sentence = "The quick brown fox jumps over the lazy dog";
		String[] words = sentence.split("\\s");
		for (String w : words) {
			if (w.contains("brown")) {
				System.out.println("The test is passed");
				break;
				

			}
			else {
				System.out.println("The test is failed");
				continue;
			}

		}
	}
}
