package com.Strings;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String movieName = "Avengers: End Game";

		String[] eachWord = movieName.split("\\s");

		String rev = "";
		for (String name : eachWord) {

			StringBuilder sb = new StringBuilder(name);
			sb.reverse();
			rev = rev + sb.toString() + " ";

		}
		System.out.println(rev);
	}

}
