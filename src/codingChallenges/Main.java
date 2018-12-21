package codingChallenges;

import codingChallenges.hackerRank.CountingValleys;
import codingChallenges.hackerRank.JumpingOnTheClouds;
import codingChallenges.sandbox.Greeting;

public class Main {

	public static void main(String[] args) {
		
		Greeting greeting = new Greeting();
		String name = "tj";
		greeting.sayHello(name);
		
		//----------------------------------------------------------
		//Challenges
		//----------------------------------------------------------
		
		//HackerRank Challenges-------------------------------------
		new CountingValleys().countingValleys();
		new JumpingOnTheClouds().jumpingOnTheClouds();
		
	}
	
	

}
