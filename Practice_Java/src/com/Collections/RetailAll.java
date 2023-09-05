package com.Collections;

import java.util.Arrays;
import java.util.List;

public class RetailAll {
	public static void main(String[] args) {
		
	/*	int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {4,5,6,7,8,9};
		
		List<int[]> list1 = Arrays.asList(arr1);
		List<int[]> list2 = Arrays.asList(arr2);
		

System.out.println(list1.retainAll(list2));
		*/
	      int[] arr = {1,2,3,4,5,6};
	      int sum = 9;
	      
	      for(int i =0;i<arr.length;i++){
	          for(int j=i+1;j<arr.length;j++){
	              
	              if(arr[i]+arr[j]==sum){
	                  System.out.println(arr[i]+" "+arr[j]);
	              }
	          }
	      }
		
	}

}
