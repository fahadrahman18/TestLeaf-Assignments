package week1.assignments;

public class PrimeNumber {


public static void main(String[] args) {
	
	int Input = 28;
	boolean flag=false;
	for (int i = 2; i < Input; i++) {
		
		if(Input%i==0) {
			flag = true;
			break;
		}
		
	}
	if(flag) {
		System.out.println("Not Prime");
	}
	else {
		System.out.println("prime");
	}
}
}
