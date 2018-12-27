package codingChallenges.freeCodeCamp;

public class FactorializeANumber {

	public void factorializeANumber() {
		
		int number = -3;
		
		System.out.println("Factorial: " + factorializeANumberImpl(number));
		
	}

	private int factorializeANumberImpl(int number) {
		
		//int sum = factorializeANumberImpl(number) * factorializeANumber(number - 1);
		
		if (number > 1) {
			return number * factorializeANumberImpl(number - 1);
		}
		
		return 1;
		
	}
	
}
