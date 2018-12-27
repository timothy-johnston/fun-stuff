package codingChallenges.freeCodeCamp;

public class ReverseAString {

	public void reverseAString() {
		String string = "Greetings from Earth";
	
		System.out.println("Reversed string: " + reverseAStringImpl(string));
	}

	private String reverseAStringImpl(String string) {
		
		String newString = "";
		
		for (int i = string.length() - 1; i >= 0; i--) {
			newString = newString.concat(String.valueOf(string.charAt(i)));
		}

		return newString;
	
	}
}
