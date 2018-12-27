package codingChallenges.freeCodeCamp;

public class FindLongestWord {

	public void findLongestWord() {
		
		String sentence = "What is the average airspeed velocity of an unladen swallow";
		
		System.out.println("Length of longest word: " + findLongestWordImpl(sentence));
		
	}

	private int findLongestWordImpl(String sentence) {
	
		int longestWord = 0;
		
		//Loop over each char in the string
		int i = 0;
		while (i < sentence.length()) {
			
			int currentWord = 0;
			
			//Increment word length count until a space is found
			while (i < sentence.length() && !String.valueOf(sentence.charAt(i)).equals(" ")) {
				currentWord++;
				i++;
			}
			
			longestWord = (currentWord > longestWord) ? currentWord : longestWord;
			
			i++;
			
		}
		
		return longestWord;
	}
	
}
