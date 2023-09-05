package com.Functions;

import java.util.HashSet;
import java.util.Scanner;

public class findDuplicatesInArray {

	public static void duplicates(int[] numbers) {

		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < numbers.length; i++) {
			if (hs.add(numbers[i]) == false) {
				System.out.println("Duplicate Numbers are : " + numbers[i]);
			}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("ENter the size of an Array: ");
		int[] numbers = new int[size];
		System.out.println("ENter the elements of an Array: ");
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}

		// int[] numbers = {2,3,4,5,6,2,3,7,8,9};
		duplicates(numbers);

	}

}
