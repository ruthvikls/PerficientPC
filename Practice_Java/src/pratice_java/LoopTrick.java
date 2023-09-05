package pratice_java;

public class LoopTrick {
public static void main(String[] args) {
	
	int i=1;
	int j=1;
	
	while(i<3) {
		do {
			System.out.println(j+",");
			j++;
		}while(j<4);
	i++;
	}
	System.out.println("************************");
			make(1);
}

public static void make(int num) {
	
	do {
		System.out.println(num+" , ");
		num++;
	}while(num<4);
}
}
