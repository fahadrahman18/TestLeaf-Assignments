package week1.assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 875;
		int sum = 0, rem;
		
		while (input>0) {
			rem = input % 10;
			sum = sum + rem;
			input = input/10;
		}
	
		System.out.println(sum);
// for(int i =0
	}

}
