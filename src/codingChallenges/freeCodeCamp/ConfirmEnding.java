package codingChallenges.freeCodeCamp;

public class ConfirmEnding {

	public void confirmEnding() {
		
		String string = "Abstraction";
		String target = "adction";
		
		System.out.println("String ends in target: " + confirmEndingImpl(string, target));
		
	}

	private boolean confirmEndingImpl(String string, String target) {
		return string.length() >= target.length() &&
				string.substring(string.length() - target.length()).equals(target);
	}
	
}
