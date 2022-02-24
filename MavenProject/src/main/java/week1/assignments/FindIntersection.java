package week1.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] firstArr = {3,2,11,4,6,7};
		int[] secArr = {1,2,8,4,9,7};
		for (int i = 0; i < secArr.length; i++) {
			
			for (int j = 0; j < secArr.length; j++) {
				
				if(firstArr[i] == secArr[j]) {
					System.out.println(firstArr[i]);
				}
			}
			
		}

	}

}
