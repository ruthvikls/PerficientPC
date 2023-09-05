
package com.MostAskedIQ;

import java.util.HashMap;

public class demo {
public static void main(String[] args) {
	
	String name = "Laptop";
	
	char[] each = name.toCharArray();
	HashMap<Character,Integer> hm =  new HashMap<>();

	for(char c:each) {
		
		if(hm.containsKey(c)) {
			hm.put(c,hm.get(c)+1 );
		}
		else {
			hm.put(c, 1);
		}
	}
	System.out.println(hm);
	
}
}
