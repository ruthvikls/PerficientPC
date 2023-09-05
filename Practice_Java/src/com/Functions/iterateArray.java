package com.Functions;

import java.util.Arrays;

public class iterateArray {
	public static void iterate(int[] numbers) {
		for(int num:numbers) {
			Arrays.sort(numbers);
			System.out.println(" "+num);
		}
	
	}

	public static void main(String[] args) {
		int[] num = {1,2,2,43,43,2,34,2323,423};
		iterate(num);
	}

}
