package com.Practice.Arrays;

public class FindTargetOFAddingTwoNumbers {

	public static void main(String[] args) {
		
		int[] arr = {3,5,6,7};  //Find which two numbers in this array adds 11
		
		for(int i =0; i<arr.length;i++) {
			
			for(int k = i+1 ;k<arr.length;k++) {
				
				if(arr[i]+arr[k]==11) {
					System.out.println(arr[i]+" & "+arr[k]);
				}
			}
			
		}

	}

}
