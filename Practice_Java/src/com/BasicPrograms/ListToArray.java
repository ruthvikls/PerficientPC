package com.BasicPrograms;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {

		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("Russia");
		countries.add("Italy");
		countries.add("Brazil");
		countries.add("Spain");
		System.out.println(countries.size());

		// Create a new array of String type

		String[] country = new String[countries.size()];
		// convert arraylist to the string type

		countries.toArray(country);

		for (String c : country) {
			System.out.println(c);
		}

	}

}
