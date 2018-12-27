package codingChallenges;

import codingChallenges.freeCodeCamp.ConfirmEnding;
import codingChallenges.freeCodeCamp.FactorializeANumber;
import codingChallenges.freeCodeCamp.FindLargestNumbers;
import codingChallenges.freeCodeCamp.FindLongestWord;
import codingChallenges.freeCodeCamp.RepeatAString;
import codingChallenges.freeCodeCamp.ReverseAString;
import codingChallenges.freeCodeCamp.TitleCaseASentence;
import codingChallenges.freeCodeCamp.TruncateString;
import codingChallenges.hackerRank.CompareTheTriplets;
import codingChallenges.hackerRank.CountingValleys;
import codingChallenges.hackerRank.HourglassSum;
import codingChallenges.hackerRank.JumpingOnTheClouds;
import codingChallenges.hackerRank.RansomNote;
import codingChallenges.hackerRank.RepeatedString;
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
		new RepeatedString().repeatedString();
		new RansomNote().ransomNote();
		new CompareTheTriplets().compareTheTriplets();
		new HourglassSum().hourglassSum();
		
		//FreeCodeCamp Challenges
		new ReverseAString().reverseAString();
		new FactorializeANumber().factorializeANumber();
		new FindLongestWord().findLongestWord();
		new FindLargestNumbers().findLargestNumbers();
		new ConfirmEnding().confirmEnding();
		new RepeatAString().repeatAString();
		new TruncateString().truncateString();
		new TitleCaseASentence().titleCaseASentence();
		
	}
	
	

}
