package com.BasicPrograms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		
		String[] programs = {"Java","Ruby","C Sharp","Python",".Net","C"};
		
		List<String> newPrograms = Arrays.asList(programs);
		
		Iterator<String> it = newPrograms.iterator();
		
		while(it.hasNext()) {
			
			String Code = it.next();
			System.out.println(Code);
		}
		
		System.out.println("**********************************");
		String Program = "Python";
		int count = 0;
		for(String p:newPrograms) {
			if(p.equalsIgnoreCase(Program)) {
				System.out.println("Contains Element");
				count++;
			}
		}
		if(count==0) {
			System.out.println("Element is not Present");
		}
		
		}
		
	}


