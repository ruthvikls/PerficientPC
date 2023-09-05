package com.MostAskedIQ;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Word to Reverse it : ");

		String word = sc.next();
		String reverse = "";

		for (int i = word.length() - 1; i >=0; i--) {
			
			reverse = reverse + word.charAt(i);

		}

		System.out.println(reverse);
	}

}
