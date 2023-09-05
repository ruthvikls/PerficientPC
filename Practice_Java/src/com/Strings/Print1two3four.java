package com.Strings;

public class Print1two3four {
	public static void main(String[] args) {
		
		String name = "1234";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			
			switch(ch) {
			case '1':
				sb.append(1);
			break;
			case '2':
				sb.append("two");
			break;
			case '3':
				sb.append(3);
			break;
			case '4':
				sb.append("four");
			break;
			
				
			}
		}
	
	System.out.println(sb.toString());
	}

}
