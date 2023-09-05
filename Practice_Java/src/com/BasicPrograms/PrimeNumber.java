package com.BasicPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find prime or not :");
		int num = sc.nextInt();
		boolean flag = true;
		
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag = false;
				
			}
		}
		if(flag==true) {
			System.out.println(num+": Number is Prime");
		}
		else {
			System.out.println(num+": Number is Not Prime");
		}

	}

}
