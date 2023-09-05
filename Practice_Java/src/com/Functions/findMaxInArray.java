package com.Functions;

import java.util.Arrays;
import java.util.Scanner;

public class findMaxInArray {

	public static int maxInArray(int[] numbers) {
		int size = numbers.length;
		Arrays.sort(numbers);
		int max = numbers[size - 1];
		System.out.println(max);
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int sizeofArray = sc.nextInt();

		int[] numbers = new int[sizeofArray];
		System.out.println("Enter the elements in an array");

		for (int i = 0; i < sizeofArray; i++) {
			numbers[i] = sc.nextInt();
		}

		maxInArray(numbers);
	}

}
