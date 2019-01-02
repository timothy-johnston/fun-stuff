package codingChallenges.freeCodeCamp;

public class FindLongestWord {

	public void findLongestWord() {
		
		String sentence = "What if we try a super-long word such as otorhinolaryngology";
		
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
