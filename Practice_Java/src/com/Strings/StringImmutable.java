package com.Strings;

public class StringImmutable {

	public static void main(String[] args) {

		//String literal
		String name = "John";
		String myName = "John";
		//== talks about reference same idhya
		// .equals talks about content same idhya
		
		System.out.println(name==myName);
		System.out.println(name.equals(myName));
		System.out.println("*************************************");
		
		System.out.println("*************************************");
		
		String s1 = new String("ruthvik");
		String s2 = new String("ruthvik");
		System.out.println(s1==s2); // tow objects present and not referencing to the same value hence false
		System.out.println(s1.equals(s2)); // content is same that's why true
	}

}
