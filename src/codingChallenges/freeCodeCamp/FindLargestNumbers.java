package codingChallenges.freeCodeCamp;

public class FindLargestNumbers {

	public void findLargestNumbers() {
		
		int[][] numbers = {{17, 23, 25, 12}, {25, 7, 34, 48}, {4, -10, 18, 21}, {-72, -3, -17, -10}};
		
		findLargestNumbersImpl(numbers);
		
	}

	private void findLargestNumbersImpl(int[][] numbers) {
		
		System.out.println("Largest numbers: ");
		
		int[] largestNumbers = new int[numbers.length];
		
		//O(n^2) solution - find a better way?
		for (int i = 0; i < numbers.length; i++) {
			int tempLargest = Integer.MIN_VALUE;
			for (int j = 0; j < numbers[0].length; j++) {
				if (numbers[i][j] > tempLargest) {
					tempLargest = numbers[i][j];
				}
			}
//			largestNumbers[i] = tempLargest;
			System.out.print(tempLargest + " ");
		}
		System.out.println("\n");
	}
	
	
}
