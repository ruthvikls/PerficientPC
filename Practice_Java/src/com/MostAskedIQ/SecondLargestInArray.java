package com.MostAskedIQ;

import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {11,22,33,44,111,222,333,444,9986,883,9988,334,2,3,2,312};
		
		int size = numbers.length;
		
		Arrays.sort(numbers);
		
		int secondLargestNumberInTheArray = numbers[size-2];
		System.out.println(secondLargestNumberInTheArray);
		
	}

}
