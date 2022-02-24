package week1.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count;
		int lenarr = arr.length;
		
		for (int i = 0; i < lenarr; i++) {
			count = 0;
			for (int j = i+1; j < lenarr-1; j++) {
				if(arr[i]== arr[j]) {
					count += 1;
				}
			}
	
				if(count > 0) {
					System.out.println(arr[i]);
				}
			
		
		
	}
		

}
}	

