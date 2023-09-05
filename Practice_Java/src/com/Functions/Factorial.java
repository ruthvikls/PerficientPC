package com.Functions;

public class Factorial {
	
	public static int findFactorial(int number) {
		
		int fact =1;
		for(int i =1;i<=number;i++) {
			fact = fact *i;
		}
		System.out.println(fact);
		return fact;
	}

	public static void main(String[] args) {
		
		findFactorial(40);

	}

}
