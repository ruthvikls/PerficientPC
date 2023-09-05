package pratice_java;

import java.util.HashSet;

public class DuplicatesUsingSet {
	public static void main(String[] args) {
		int[] a ={1,2,3,4,4,4,5,5,5};
		boolean flag = false;
		HashSet<Integer> s = new HashSet<Integer>();
		for (int num:a) {
			if(s.add(num)==false) {
				System.out.println("Duplicate numbers are = "+ num);
				flag =true;
			}
			
			for(int sHash:s) {
				System.out.println(sHash);
			}
		}
		if(flag==false) {
			System.out.println("No Duplicates Present");
		}
	}

}
