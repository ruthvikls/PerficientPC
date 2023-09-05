package com.Practice.Arrays;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		String[] names = new String[size];
		System.out.println("Enter the contents of the array: ");
		
		for(int i=0;i<size;i++) {
			
			names[i]=sc.nextLine();
		}
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println("***************************************");
		for(String name:names) {
			System.out.println(name);
		}

	}

}
