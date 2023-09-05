package com.BasicPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Integer> nums = 	Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	//Stream<Integer> data = nums.stream();
	//Stream <Integer> newData = data.map(n->n*2);
	
	//newData.forEach(n->System.out.println(n));
	
	  //OR
	// Doulbing the values
	nums.stream().map(n->n*2).forEach(n->System.out.println(n));
	System.out.println("****************************************");
	//extract even Numbers 
	//nums.stream().map(n-> n%2==0).forEach(n->System.out.println(n));
	nums.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	System.out.println("****************************************");
	nums.stream().filter(n->n%2!=0).forEach(n->System.out.println(n));

	}

}
