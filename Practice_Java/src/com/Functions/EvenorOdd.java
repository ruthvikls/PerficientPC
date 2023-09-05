package com.Functions;

public class EvenorOdd {

	public static void FindEvenorOdd(int number) {
		
		if(number%2==0) {
			System.out.println(number+" : is a Even Number");
		}
		else {
			System.out.println(number+" : is a Odd Number");
		}
		
	}
	public static void main(String[] args) {
			
		FindEvenorOdd(44);

	}

}
