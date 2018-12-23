package codingChallenges.hackerRank;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public void ransomeNote() {
	
		String[] magazine = {"give", "me", "one", "grand", "tonight"};
		String[] note = {"give", "one", "grand", "tonight"};
		
		ransomeNoteImpl(magazine, note);
	
	}

	private void ransomeNoteImpl(String[] magazine, String[] note) {
		
		Map<Integer, String> noteMap = new HashMap<Integer, String>();
		Map<Integer, String> magazineMap = new HashMap<Integer, String>();
		
		for (int i = 0; i < note.length; i++) {
			noteMap.put(i, note[i]);
		}
		
		for (int i = 0; i < magazine.length; i++) {
			magazineMap.put(i, note[i]);
		}
		
		
	}
	
	
	
	
	
}


