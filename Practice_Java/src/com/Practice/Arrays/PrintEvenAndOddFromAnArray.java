package com.Practice.Arrays;

public class PrintEvenAndOddFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[] = {2,3,4,5,6,4,3,3,2,1,1,12,3,3,44,53};
		
		for(int i =0; i<number.length;i++) {
			if(number[i]%2==0) {
				System.out.println(number[i]+"= EvenNumbers");
			}
			else {
				System.out.println(number[i]+"= OddNumbers");
			}
		}

	}

}
