package com.MostAskedIQ;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a Number :");
		int number = sc.nextInt();
		for(int i = 1;i<=10;i++) {
			System.out.printf("%d * %d = %d \n", number, i, number * i);
			
			//System.out.println(number+ " X " + i+ " = "+ number*i );
			
		} 
		
	}

}
