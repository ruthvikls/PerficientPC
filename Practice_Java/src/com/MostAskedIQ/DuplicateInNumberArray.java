package com.MostAskedIQ;

import java.util.HashSet;

public class DuplicateInNumberArray {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 22, 22, 3, 33, 33, 4, 5, 6, 7, 77, 77, 8, 9, 10 };
		
		//using Iteration Method
		System.out.println("**********using Iteration Method**********");

		for (int i = 0; i < numbers.length; i++) {

			for (int j = i + 1; j < numbers.length; j++) {

				if (numbers[i] == numbers[j]) {
					System.out.println("The Duplicates are :" + numbers[i]);

				}
			}
		}
		
		//using HashSet
		System.out.println("**********using HashSet**********");
		
		HashSet hs = new HashSet<>();
		HashSet<Integer> hash =  new HashSet();
		
		for(int num:numbers) {
			if(hs.add(num)) {
				System.out.println(num);
				hash.add(num);
			}
			
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		for(Integer h:hash) {
			System.out.println(h);
		}
		
	}

}
