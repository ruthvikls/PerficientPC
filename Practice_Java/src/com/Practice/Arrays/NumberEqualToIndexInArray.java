package com.Practice.Arrays;

public class NumberEqualToIndexInArray {
	
	
	
	public static int findEqual(int nums[]) {
		
		if(nums.length==0) {
			return 0;
		}
		
		for(int i=0;i<nums.length;i++) {
			
			if(nums[i]==i) {
				System.out.println(nums[i]);
				return nums[i];
			}
			
		}
		return 0;
	}

	public static void main(String[] args) {
		
		int arr [] = {-1,0,2,4,6,33,3343,3};
		
		findEqual(arr);

	}

}
