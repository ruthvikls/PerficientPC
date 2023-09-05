package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class fibonacciUsingArrayList {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
			
		int firstNumber = 0;
		int secondNumber = 1;
		int series;
		numbers.add(firstNumber);
		numbers.add(secondNumber);
		
		for(int i=2;i<15;i++){
			numbers.add(numbers.get(i-1)+numbers.get(i-2)); //
			}
		System.out.println(numbers);
		System.out.println("**********************************");
		for(int a: numbers) {
			System.out.println(a);
		}
	}

}
