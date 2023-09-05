package pratice_java;

public class numberOfCharactersInAString {

	public static void main(String[] args) {
			
		String name = "are you  sure";
			int count = 0;
		for(int i = 0;i<name.length();i++) {
			if(name.charAt(i)!=' ') 
				
				count++;
		}
		
	System.out.println(count);
	}

}
