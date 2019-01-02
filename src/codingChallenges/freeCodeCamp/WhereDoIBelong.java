package codingChallenges.freeCodeCamp;

public class WhereDoIBelong {

	public void whereDoIBelong() {
		
		int[] numbers = {5, 3, 20, 3};
		double numberToInsert = 5;
		
		System.out.println("Insert number at index: " + whereDoIBelongImpl(numbers, numberToInsert));
		
	}
	
	public int whereDoIBelongImpl(int[] numbers, double numberToInsert) {
		
		int indexToInsert = 0;
		
		for (int i = 0; i < numbers.length; i ++) {
			
			if (numberToInsert > numbers[i]) {
				indexToInsert++;
			}
			
		}
		
		return indexToInsert;
		
	}
	
}
