package prob1;

public class Prob1 {

	public static void main(String[] args) {
	int[] arr = {4,7,2,9,1};
	
	System.out.println(findMaxDifference(arr));

	}
	
	public static int findMaxDifference(int[] numbers) {
		
		int currentMax = 0;
		if(numbers.length < 2) {
			return 0;
		} else {
		for(int i = 0; i < numbers.length - 1; i++) {
			int findMax = Math.abs(numbers[i] - numbers[i + 1]);
			
			if(findMax > currentMax) {
				currentMax = findMax;
			}
		}
		return currentMax;
	}
		
}

}
