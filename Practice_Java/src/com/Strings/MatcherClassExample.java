package com.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClassExample {
	
	public static void matchNum(String toBeFound, String tobeSearched) {
		Matcher matcher = Pattern.compile(toBeFound).matcher(tobeSearched);
		System.out.println(matcher.results().count());
	}

	public static void main(String[] args) {
		
		matchNum("4","9986443382"); // means i want to seach 4 and count it in the String
		matchNum("o", "iamagoodperson");
		System.out.println("******************************************");
		// TODO Auto-generated method stub
		// output ---> programming->2 [because it is repeated 2 times]
		String sentence = "Javaprogrammingiseaneasyprogrammingtobefrank";
		
		//Method 1
		Matcher matcher = Pattern.compile("programming").matcher(sentence);
		int count = 0;
		while (matcher.find()) {
			count++;
		}
		System.out.println("programming->" + count);

		//Method 2
		matcher = Pattern.compile("programming").matcher(sentence);
		long numberOfTimes = matcher.results().count();
		System.out.println(numberOfTimes);
		
		System.out.println("************************");
		matcher = Pattern.compile("o").matcher("pneumonoultramicroscopicsilicovolcanoconiosis");
		
		System.out.println(matcher.results().count());
		

	}

}
