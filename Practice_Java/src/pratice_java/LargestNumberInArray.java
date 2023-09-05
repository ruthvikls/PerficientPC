package pratice_java;

import java.util.Scanner;

public class LargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements to find the largest!");
		n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the elements in an Array : ");
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		
		int max = array[0];
		
		for(int i=1;i<array.length;i++) {
			
				if(array[i]>max) {
					max=array[i];
				}
				
			
		}
		System.out.println("Largest Number in the Given array is = "+ max);

	}

}
