package com.MostAskedIQ;

public class LinearSearch {
	public static void main(String[] args) {

		int[] numbers = { 2, 3, 23, 24, 24, 24, 2, 242424, 242, 4225, 3224, 62, 235, 463, 4, 636, 52, 373, 67, 357, 4,
				25, 2 };
		int key = 463;
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == key) {
				System.out.println("Position is in: " + i);
				count++;

			}
		}
		if(count==0) {
			System.out.println("the key is not found in the list");
		}
	}

}
