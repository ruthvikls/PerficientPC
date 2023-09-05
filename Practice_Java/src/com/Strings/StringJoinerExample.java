package com.Strings;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {

		
		StringJoiner sj = new StringJoiner(",","{","}");
		
		sj.add("A").add("B").add("C");
		
		System.out.println(sj);
		
		StringJoiner sj1=new StringJoiner(":");
		
		sj1.add("P").add("Q");
		System.out.println(sj1);
		
		sj.merge(sj1);
		System.out.println(sj);

	}

}
