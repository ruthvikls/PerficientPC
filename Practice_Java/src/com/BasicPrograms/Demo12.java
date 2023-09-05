package com.BasicPrograms;

public class Demo12 {

	public static void main(String[] args) {
		
		String sentence = "Java is the Best Programming language";
		String[] sent = sentence.split("\s");
		
		for(String s:sent) {
			System.out.println(s);
		}

	}

}
