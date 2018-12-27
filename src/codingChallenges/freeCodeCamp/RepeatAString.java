package codingChallenges.freeCodeCamp;

public class RepeatAString {

	public void repeatAString() {
		
		String string = "abc";
		int times = 3;
		
		System.out.println("Repeated string: " + repeateAStringImpl(string, times));
		
	}

	private String repeateAStringImpl(String string, int times) {

		//Using recursion
		if (times > 1) {
			return string.concat(repeateAStringImpl(string, times - 1));
		} else if (times == 1) {
			return string;
		} else {
			return "";
		}
		
	}
	
}
