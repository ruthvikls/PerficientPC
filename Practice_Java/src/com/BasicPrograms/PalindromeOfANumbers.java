package com.BasicPrograms;

import java.util.Scanner;

public class PalindromeOfANumbers {
public static void main(String[] args) {
	int rem,sum=0,temp;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number:");
	int number = sc.nextInt();
	temp=number;
	
	while(number>0) {
		rem = number%10;
		sum = (sum*10)+ rem;
		number = number/10;
		}
	if(temp==sum) {
		System.out.println("Palindrome!");
	}
	else {
		System.out.println("Not a Palindrome!");
	}
}
}
