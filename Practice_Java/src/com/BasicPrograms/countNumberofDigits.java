package com.BasicPrograms;

import java.util.Scanner;

public class countNumberofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a NUMBER");
		long number = sc.nextLong();
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		System.out.println("Count of the numbers :" + count);
	}

}
