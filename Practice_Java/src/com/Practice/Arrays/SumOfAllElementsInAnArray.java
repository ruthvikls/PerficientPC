package com.Practice.Arrays;

public class SumOfAllElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {10,20,30,40,50}; //150
		int sum = 0;
		
		for(int number:numbers) {
			sum = sum+number;
		}
	System.out.println(sum);
	}

}
