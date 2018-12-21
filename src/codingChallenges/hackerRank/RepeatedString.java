package codingChallenges.hackerRank;

public class RepeatedString {

	public void repeatedString() {
		
		long repetitions = 1000000000L;
		String string = "a";
		
		long countA = repeatedStringImpl(string, repetitions);
		System.out.println("Number of 'A's: " + countA);
		
	}
	
	private long repeatedStringImpl(String string, long repetitions) {
		
		long countA = 0L;
		long stringLength = string.length();
		long fullStringOccurrences = repetitions / stringLength;
		long countOfDroppedLettersOnFinalStringRep = repetitions % stringLength;
		String droppedLettersOnFinalStringRep = string.substring(string.length() -1);
		
		
		//Count occurrences of A in all full occurrences of the string
		//Also check if the letter will be dropped on the final occurrences
		//If so, increment count by one less
		for (int i = 0; i < stringLength; i++) {
			
			if (String.valueOf(string.charAt(i)).equalsIgnoreCase("a")) {
				
				if (i < stringLength - countOfDroppedLettersOnFinalStringRep -1) {
					countA += (fullStringOccurrences + 1);
				} else {
					countA += (fullStringOccurrences);
				}
				
			}
			
		}
		
		
		System.out.println(fullStringOccurrences);
		System.out.println(droppedLettersOnFinalStringRep);
		
		return countA;
	}
	
}
