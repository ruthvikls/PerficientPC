package pratice_java;

public class removeDuplicatesFromArray {
	public static void main(String[] args) {
		int[] array = {10,20,10,30,40,40};
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					System.out.println("The duplicate element int the array is = "+array[i]);
				}
			}
		}
	}

}
