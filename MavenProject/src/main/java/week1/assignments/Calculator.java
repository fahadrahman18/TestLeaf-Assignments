package week1.assignments;

public class Calculator {
	
	public int add(int num1,int num2, int num3) {
		
		int addRes =  num1 + num2 + num3;
		return addRes;

	}
	
	public int sub(int num1, int num2) {
		
		int subRes = num1 - num2;
		return subRes;
	}
	
	public double mul(double num1, double num2) {
		
		double mulRes = num1 * num2;
		return mulRes;
	}
	
	public float divide(float num1, float num2) {
		
		float divRes = num1 / num2;
		return divRes;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator res = new Calculator();
		System.out.println(res.add(4, 5, 6));
		System.out.println(res.sub(6, 4));
		System.out.println(res.mul(55,25));
		System.out.println(res.divide(12.0f, 6.0f));

	}

}
