package com.Practice.Arrays;

import java.util.Scanner;

public class UserInputforArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the element :");
			numbers [i]= sc.nextInt();
		}
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println("Content : "+numbers[i]);
		}
		System.out.println(numbers.length);
	}

}
