package com.MostAskedIQ;

public class TwoSum {
	
	public static void main(String[] args) {
		
		int[] array = {2,3,4};
		
		int sum =6;
		// find the two digits whose sum equals 6
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]+array[j]==sum) {
					System.out.println(array[i]+" + "+array[j]);
				}
			}
		}

	}
}
