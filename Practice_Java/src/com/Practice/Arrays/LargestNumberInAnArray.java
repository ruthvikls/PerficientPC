package com.Practice.Arrays;

import java.util.Arrays;

public class LargestNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,242,234,223,2,232,23,1234,2143123,12341,12431,1234,1};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int size = arr.length;
		
		int largestNumber = arr[size-1];
		
		System.out.println("The Largest Number in the Arrya is = " + largestNumber);

	}

}
