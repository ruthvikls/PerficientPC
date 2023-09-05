package pratice_java;

public class Linear_Search_int {
public static void main(String args[]) {
	int arr[] ={10,20,50,40,50};
	
	int num = 50;
	
	int temp=0; 
	
	for(int i = 0 ; i<arr.length;i++) {
		if(num==arr[i]) {
			System.out.println("The Number is found at the index position = "+i);
			temp = temp+1;
		}
		
	}
	if(temp==0) {
		System.out.println("Number is not there in the list");
	}
	
	
}
}
