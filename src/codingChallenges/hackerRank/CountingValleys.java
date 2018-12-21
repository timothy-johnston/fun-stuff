package codingChallenges.hackerRank;

public class CountingValleys {

	public void countingValleys() {
		
		int numberOfSteps = 8;
		String stepDirections = "UDDDUDUU";
		
		int valleys = countingValleysImpl(numberOfSteps, stepDirections);
		System.out.println("Number of valleys: " + valleys);
		
	}
	
	
	private int countingValleysImpl(int numberOfSteps, String stepDirections) {
		
		int altitude = 0;		//0 for sea level, +/- values for above/below sea level
		int valleys = 0;
		boolean inValley = false;
		
		
		for (int i = 0; i < stepDirections.length(); i++) {
			
			if (String.valueOf(stepDirections.charAt(i)).equals("U")) {
				altitude++;
			} else {
				altitude--;
			}
			
			//Check if we were in a valley prior to this loop iteration
			//If we weren't and we now are (altitude < 0), increment the count of valleys
			if (!inValley && altitude < 0) {
				inValley = true;
			} else if (inValley && altitude == 0) {
				valleys++;
				inValley = false;
			}
			
		}
		
		return valleys;
		
	}
	
}
