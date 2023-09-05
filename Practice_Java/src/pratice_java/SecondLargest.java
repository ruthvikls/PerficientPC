package pratice_java;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {66,77,88,44,33,22,99};
		
		Arrays.sort(num);
		
		int size = num.length;

		int secondLar = num[size-2];
		System.out.println(secondLar);
	}

}
