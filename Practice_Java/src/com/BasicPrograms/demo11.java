package com.BasicPrograms;

public class demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Thor Love and Thunder";
		
		String words[] = name.split("\\s");
		String rev = "";
		
		for(String word:words) {
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			rev = rev+ sb.toString()+" ";
		}
		//rev.trim();
System.out.println(rev);
	}

}
