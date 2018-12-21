package codingChallenges.hackerRank;

public class JumpingOnTheClouds {

	public void jumpingOnTheClouds() {
		
		int[] clouds = {0, 0, 0, 1, 0, 0};
		
		int jumps = jumpingOnTheCloudsImpl(clouds);
		System.out.println("Number of jumps: " + jumps);
		
	}
	
	private int jumpingOnTheCloudsImpl(int[] clouds) {
		
		int jumps = 0;
        int currentCloud = 0;
        
        //clouds.length helps avoid indexoutofbounds, and we know
        //if we're at index clouds.length - 2 the number of jumps
        //to win will be +1
        while (currentCloud < clouds.length - 1) {
            
            if (currentCloud < clouds.length -2 && clouds[currentCloud + 2] != 1) {
                currentCloud += 2;
            } else {
                currentCloud++; 
            }
            
            jumps++;
            
        }
        
        return jumps;

	}
	
}
