package com.BasicPrograms;

import java.util.Scanner;

public class PalindromeOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to reverse: ");
		
		
		String name = sc.nextLine();
		String rev = "";
		
		for(int i=name.length()-1;i>=0;i--) {
			rev = rev+ name.charAt(i);
		}

		System.out.println(rev);
		
		if(rev.equalsIgnoreCase(name)) {
			System.out.println("It's a Palindrome! \n Great Work!");
		}
		else
		{
			System.out.println("Not a Palindrome!");
		}
	}
	
	

}
