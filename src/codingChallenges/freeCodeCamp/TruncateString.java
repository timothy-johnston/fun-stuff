package codingChallenges.freeCodeCamp;

public class TruncateString {

	public void truncateString() {
		
		String string = "A-tisket a-tasket A green and yellow basket";
		int chars = 8;
		
		System.out.println("Truncated string: " + truncateStringImpl(string, chars));
		
	}

	private String truncateStringImpl(String string, int chars) {
		
		if (string.length() > chars && chars >= 0) {
			return string.substring(0, chars) + " . . . ";
		}
		
		return string;
		
	}
	
}
