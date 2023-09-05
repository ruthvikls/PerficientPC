package com.BasicPrograms;

import java.util.Scanner;

public class reverseANumberUsingStringBuffer {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number to find reverse of it");
//		int num = sc.nextInt();
//		
//		StringBuffer sb =  new StringBuffer(String.valueOf(num));
//		System.out.println(sb.reverse());
				
		int num = sc.nextInt();
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		System.out.println(sb.reverse());
		
		
		}

}
