package com.Practice.Arrays;

import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {22,44,43,23,54,231,54,542,55,64};
		int size = array.length;
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int LargestNumber = array[size-1];
		System.out.println(LargestNumber);
		int SecondLargestNumber = array[size-2];
		System.out.println(SecondLargestNumber);
	}

}
