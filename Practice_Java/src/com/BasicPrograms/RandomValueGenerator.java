package com.BasicPrograms;

public class RandomValueGenerator {

	public static void main(String[] args) {
			
		int max = 500;
		int min = 100;
		double num = Math.random();
		System.out.println(num);
		int number = (int)(num*(max-min+1)+min);
		System.out.println(number);

	}

}
