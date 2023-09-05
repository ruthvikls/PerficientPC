package com.Practice.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int sum1 = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			sum1 = sum1+arr[i];
		}
		System.out.println(sum1);
		int sum2 = 0;
		for(int k = 1;k<=10;k++) {
			sum2 = sum2+k;
		}
		System.out.println(sum2);
		System.out.println("The Missing Number is: "+(sum2-sum1));
	

}

}
