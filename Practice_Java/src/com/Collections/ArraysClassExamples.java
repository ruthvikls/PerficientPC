package com.Collections;

import java.util.Arrays;

public class ArraysClassExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {1,4,5,7,6,3,2};
		
		//1. Sorting in Ascending Order
		Arrays.sort(num);
		for(int n:num) {
			System.out.println(n);
		}
		System.out.println("Binary Search");
		//2. Binary Search
		
	int position =	Arrays.binarySearch(num, 6);
	System.out.println(position);
		
	}

}
