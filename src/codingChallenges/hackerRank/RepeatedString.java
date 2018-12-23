package codingChallenges.hackerRank;

public class RepeatedString {

	public void repeatedString() {
		
		long numberOfChars = 10;
		String string = "aba";
		
		System.out.println("Number of 'A's: " + repeatedStringImpl(string, numberOfChars));
		
	}

	private Long repeatedStringImpl(String string, long numberOfChars) {
		
		long numberOfFullWords = (long) Math.floor(numberOfChars / string.length());
		
		
		
		
		return 0L;
	}
	
}
