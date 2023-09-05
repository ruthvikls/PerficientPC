package com.MostAskedIQ;

public class MaxNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 22, 33, 442, 23, 23, 3, 43, 5222, 23, 343, 23, 5654, 32, 5432, 22 };

		int maximum = numbers[0];

		for (int num : numbers) {

			if (maximum < num) {
				maximum = num;
				
			}
		}
		System.out.println(maximum);
		int[] nums = {1,22,33,44,55,66,222,232,123,554,223,2241,124,123,213};
		maxInArray(nums);

	}
	
	public static void maxInArray(int[] nums) {
		int max = nums[0];
		
		for(int i = 0;i<nums.length;i++) {
			if(max <= nums[i]) {
				max=nums[i];
			}
		}
		System.out.println(max);
	}

}
