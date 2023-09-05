package com.MostAskedIQ;

import java.util.HashMap;
import java.util.HashSet;

//Given an Array return true of repeated or else false if it is distinct
public class GivenAnArray {
	// 1. Using HashSet

	public static boolean containsValue(int nums[]) {

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {

			if (set.add(nums[i]) == false) {
				System.out.println("true");
				return true;
			}
		}

		return false;
	}
	
	
	//2. using HashMap
	
	public static boolean duplicatePresentTrue(int[] numbers) {
		
		int length = numbers.length;
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<length;i++) {
			if(map.containsKey(numbers[i])) {
				System.out.println("Correct-True");
				return true;
				
			}
			map.put(numbers[i], 1);
		}
		System.out.println("Not Correct-false");
		return false;
		
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 2, 3, 4, 5, 6 };
		int arrays[] = {1,2,3,4,5,6,7,8};

		containsValue(array);
		duplicatePresentTrue(arrays);
		
	}

}
