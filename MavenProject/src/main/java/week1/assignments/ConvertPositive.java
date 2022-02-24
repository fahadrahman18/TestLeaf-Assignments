package week1.assignments;

public class ConvertPositive {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = -80;
		
		if (number < 0) {
			
			int PositiveNum = -(number);
			
			System.out.println("The number " + number + " is converted  to " + PositiveNum);
		}
		
		else {
			System.out.println("Number is positive");
		}

	}

}
