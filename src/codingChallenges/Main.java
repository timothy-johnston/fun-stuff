package codingChallenges;

import codingChallenges.problems.HackerRankProblems;
import codingChallenges.sandbox.Greeting;

public class Main {

	public static void main(String[] args) {
		
		Greeting greeting = new Greeting();
		String name = "tj";
		greeting.sayHello(name);
		
		//Challenges
		HackerRankProblems hr = new HackerRankProblems();
		
		hr.countingValleys();

	}
	
	

}
