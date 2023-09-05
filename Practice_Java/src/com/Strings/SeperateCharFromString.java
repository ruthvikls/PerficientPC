package com.Strings;

public class SeperateCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String response = "aA99fea8afd6asB44asaCf33af82";
		String onlyLowerCase= response.replaceAll("[^a-z]","");
		System.out.println(onlyLowerCase);
		String onlyUpperCase = response.replaceAll("[^A-Z]", "");
		System.out.println(onlyUpperCase);
		String onlyNumbers = response.replaceAll("[^0-9]", "");
		System.out.println(onlyNumbers);
		String aeiou = "potential";
		String consonants = aeiou.replaceAll("[^aeiouAEIOU]", "");
		System.out.println(consonants);
		
	}

}
