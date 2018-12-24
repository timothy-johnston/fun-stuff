package codingChallenges.hackerRank;

public class HourglassSum {

	public void hourglassSum() {
		
		int[][] arr = {{1, 1, 1, 0, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{0, 0, 2, 4, 4, 0},
				{0, 0, 0, 2, 0, 0},
				{0, 0, 1, 2, 4, 0}};
		
		System.out.println("Sum: " + hourglassSum(arr));
		
	}

	private int hourglassSum(int[][] arr) {
		
		int maxSum = Integer.MIN_VALUE;
		
		//loop over columns
		for (int i = 1; i < arr.length - 1; i++) {
			
			//loop over rows
			for (int j = 1; j < arr[0].length - 1; j++) {
				
				if (i == 1 && j == 1) {
					maxSum = calculateHourglassSum(arr, i, j);
				} else {
				
					//Calculate sum of current hourglass, replace maxSum if it is larger
					int currentSum = calculateHourglassSum(arr, i, j);
					maxSum = (currentSum > maxSum) ? currentSum : maxSum;
					
				}
				
//				System.out.println("i: " + i + " j: " + j + " Sum: " + (maxSum));
				
			}
			
		}
		
		return maxSum;
	}

	private int calculateHourglassSum(int[][] arr, int i, int j) {
		
		int sum = arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1] 
				+ arr[i][j] 
				+ arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1];

		return sum;
	}
	
}
