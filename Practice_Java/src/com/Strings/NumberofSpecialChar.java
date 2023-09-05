package com.Strings;

public class NumberofSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String name = "Java Language #@*!";
			
			int count = 0;
			String newName = "";
			for(int i=0;i<name.length();i++) {
				if(!Character.isDigit(name.charAt(i)) && !Character.isWhitespace(name.charAt(i)) && 
						!Character.isAlphabetic(name.charAt(i))) {
					count ++;
			}
				else {
					newName = newName +name.charAt(i);
					
				}
				
				}
			System.out.println(newName);
			if(count!=0) {
				System.out.println("The number os Special Characters are: " + count);
			}
			

}
	
}
