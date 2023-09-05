package com.BasicPrograms;

import java.util.HashSet;


public class neww {
	public static void main(String[] args) {
		//int array[] = {9,9,8,6,4,4,3,3,8,2};
		int array[] = {1,2,3,4,5};
		HashSet<Integer> hs = new HashSet<>();
		boolean flag = false;
		for(Integer h:array) {
			if(hs.add(h)==false) {
				System.out.println(h);
				flag=true;
			}
		}
		
		if(flag==false) {
			System.out.println("No Duplicates Present");
		}
		
	}

}
