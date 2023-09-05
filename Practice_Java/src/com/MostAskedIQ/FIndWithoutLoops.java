package com.MostAskedIQ;

import java.util.Arrays;

public class FIndWithoutLoops {
public static void main(String[] args) {
	
	
	
	String[] arr = {"a","b","c","d","e","f","g"};
	
	int positionOfC = Arrays.asList(arr).indexOf("c");
	int positionOfG = Arrays.asList(arr).indexOf("g");
	System.out.println(positionOfC);
	System.out.println(positionOfG);
}
}
