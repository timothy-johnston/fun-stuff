package codingChallenges.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

	public void compareTheTriplets() {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(6);
		a.add(7);
		
		List<Integer> b = new ArrayList<Integer>();
		b.add(3);
		b.add(6);
		b.add(10);
		
		
		List<Integer> comparisonPoints = compareTheTripletsImpl(a,b);
		System.out.println("Comparison points: " + comparisonPoints.get(0) + " " + comparisonPoints.get(1));
		
	}
	
	public List<Integer> compareTheTripletsImpl(List<Integer> a, List<Integer> b) {
		
		List<Integer> comparisonPoints = new ArrayList<Integer>();
		int aPoints = 0;
		int bPoints = 0;
		
		for (int i = 0; i < a.size(); i ++) {
			
			if (a.get(i) > b.get(i)) {
				aPoints++;
			} else if (a.get(i) < b.get(i)) {
				bPoints++;
			}
			
		}
		
		comparisonPoints.add(aPoints);
		comparisonPoints.add(bPoints);
		
		return comparisonPoints;
		
	}
	
}
