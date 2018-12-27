package codingChallenges.freeCodeCamp;

public class TitleCaseASentence {

	public void titleCaseASentence() {
		
		String sentence = "HERE IS my hAnDlE HERE IS MY SPOUT";
		
		System.out.println("Title cased: " + titleCaseASentenceImpl(sentence));
			
	}

	private String titleCaseASentenceImpl(String sentence) {
		
		//String[] individualWords = sentence.split("\\s+");
		String titleCasedSentence = "";
		boolean firstLetterOfAWord = true;
		
		for (int i = 0; i < sentence.length(); i++) {
			
			if (firstLetterOfAWord) {
				titleCasedSentence = titleCasedSentence.concat(String.valueOf(sentence.charAt(i)).toUpperCase());
				firstLetterOfAWord = false;
			} else {
				titleCasedSentence = titleCasedSentence.concat(String.valueOf(sentence.charAt(i)).toLowerCase());
				
				//Check if we're currently at a space, meaning we want to capitalize next word
				if (String.valueOf(sentence.charAt(i)).equals(" ")) {
					firstLetterOfAWord = true;
				}
			}
			
		}
		
		return titleCasedSentence;
	}
	
}
