package pratice_java;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OccurenceWORDInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Java is a beautiful language and it is the best language to learn";
		 
	    List<String> list = Arrays.asList(text.split(" "));
	 
	    Set<String> uniqueWords = new HashSet<String>(list);
	    for (String word : uniqueWords) {
	      System.out.println(word + ": " + Collections.frequency(list, word));
	    }
	  }
	}


