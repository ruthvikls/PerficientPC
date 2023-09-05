package com.BasicPrograms;


interface Parent{
	int value = 10;
	
}

public class demo implements Parent {

	public static void main(String[] args) {
		
		System.out.println(Parent.value);
		// TODO Auto-generated method stub
		int acsii[]= {65,66,67,68};
		String s= new String(acsii,1,2);
		System.out.println(s);

	}

}
