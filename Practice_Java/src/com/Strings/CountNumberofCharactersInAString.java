package com.Strings;

public class CountNumberofCharactersInAString {
	
	public static void main(String[] args) {
		
		String name = "Software Testing";
		int count = 0;
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}

//