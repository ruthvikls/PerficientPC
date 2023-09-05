package com.Practice.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DescendingOrder {
	public static void main(String[] args) {
		int[] arr = {2,3,4,7,4534,346,36,346};
		ArrayList<Integer> al = new ArrayList<>();

for(int n:arr) {
	al.add(n);
}

Collections.sort(al,Comparator.reverseOrder());
System.out.println(al);
		}

}
