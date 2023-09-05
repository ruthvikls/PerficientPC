package pratice_java;

import java.util.HashMap;

public class maxOccurenceString {
	public static void main(String[] args) {
		
		String name = "i am legend";
		
		HashMap<Character,Integer> hm = new HashMap<>();
		
		char[] eachWord = name.toCharArray();
		
		for(char e:eachWord) {
			
			if(hm.containsKey(e)) {
				hm.put(e, hm.get(e)+1);
			}
			else {
				hm.put(e, 1);
			}
		}
		
		System.out.println(hm);
		
	}

}
