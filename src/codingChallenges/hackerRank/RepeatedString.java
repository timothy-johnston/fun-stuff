package codingChallenges.hackerRank;

public class RepeatedString {

	public void repeatedString() {
		
		long numberOfChars = 10;
		String string = "a";
		
		System.out.println("Number of 'A's: " + repeatedStringImpl(string, numberOfChars));
		
	}
	
	private long repeatedStringImpl(String string, long numberOfChars) {
		
		if (string.length() == 0) {
			return 0L;
		}
		
		long numberOfFullWords = (long) Math.floor(numberOfChars / string.length());
		long numberOfCarriedLetters = numberOfChars % (long) string.length();
		
		//count a's in part of word before dropped
		int aInFirstPart = 0;
		for (int i = 0; i < numberOfCarriedLetters; i++) {
			
			if (String.valueOf(string.charAt(i)).equalsIgnoreCase("a")) {
				aInFirstPart++;
			}
			
		}
		
		//count a's in part of word dropped
		int aInSecondPart = 0;
		for (int i = (int) numberOfCarriedLetters; i <string.length(); i++) {
			
			if (String.valueOf(string.charAt(i)).equalsIgnoreCase("a")) {
				aInSecondPart++;
			}
			
		}
		
		long totalA = aInFirstPart * (numberOfFullWords + 1) + aInSecondPart * (numberOfFullWords);
		
		return totalA;
	}
}
