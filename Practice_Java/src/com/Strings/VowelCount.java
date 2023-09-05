package com.Strings;

public class VowelCount {

	public static void main(String[] args) {
		
		String name ="My name is ruthvik";
		
		int count = 0;
		System.out.println(name.length());
		
		for(int i = 0; i<name.length();i++) {
			
			char ch = name.charAt(i);
			if(ch == 'a' ||ch == 'e' || ch =='i' ||ch == 'o' || ch =='u') {
				count ++;
			}
			
				
			
		}
System.out.println("Number if Vowels in the given String is ="+count);
	}

}
