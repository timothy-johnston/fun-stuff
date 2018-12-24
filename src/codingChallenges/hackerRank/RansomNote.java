package codingChallenges.hackerRank;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public void ransomNote() {
	
		String[] magazine = {"two", "times", "three", "is", "not", "four"};
		String[] note = {"two", "times", "two", "is", "four"};
		
		ransomNoteImpl(magazine, note);
	
	}

	private void ransomNoteImpl(String[] magazine, String[] note) {
		
		boolean success = true;
		Map<String, Integer> noteMap = new HashMap<String, Integer>();
		Map<String, Integer> magazineMap = new HashMap<String, Integer>();
		
		//Make note map
		for (int i = 0; i < note.length; i++) {
			
			if (noteMap.containsKey(note[i])) {
				int previousCount = noteMap.get(note[i]);
				noteMap.put(note[i], previousCount + 1);
			} else {
				noteMap.put(note[i], 1);
			}
			
		}
		
		//Make magazine map
		for (int i = 0; i < magazine.length; i++) {
			if (magazineMap.containsKey(magazine[i])) {
				magazineMap.put(magazine[i], magazineMap.get(magazine[i] + 1));
			} else {
				magazineMap.put(magazine[i], 1);
			}
		}
		
		//Check for occurrence of note words in magazine map
		for (String word : noteMap.keySet()) {
			
			if (!(magazineMap.containsKey(word) && magazineMap.get(word) >= noteMap.get(word))) {
				success = false;
				break;
			}
			
		}
		
		
		System.out.println(success ? "Yes" : "No");
		
	}
	
	
	
	
	
}


