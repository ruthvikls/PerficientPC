package com.MostAskedIQ;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number to find Factorial: ");
		int number = sc.nextInt();
		int factorial= 1;
		for(int i=1;i<=number;i++) {
			
			factorial = factorial*i;
		}
		
		System.out.println(factorial);
		

	}

}
