package Com.Codegnan.Codethantra;

import java.util.Scanner;

interface VoteCounter {
	public abstract int[] countVotes(String[] candidates, int[] votes);
	public abstract int determineWinner(int[] voteCounts);
}
class ElectionSystem implements VoteCounter {
	public int[] countVotes(String[] candidates, int[] votes) {
		return votes;
	}
	public int determineWinner(int[] voteCounts) {
		int maxVotes = -1;
    	int winnerIndex = -1;
    	boolean isTie = false;
    	for (int i = 0; i < voteCounts.length; i++) {
        	if (voteCounts[i] > maxVotes) {
            	maxVotes = voteCounts[i];
            	winnerIndex = i;
            	isTie = false;
        	} else if (voteCounts[i] == maxVotes) {
            	isTie = true;
        	}
    	}
    	if (isTie) {
        	return -1;
    	}
    	return winnerIndex;
	}

}
public class Main {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	ElectionSystem electionSystem = new ElectionSystem();
 
    	System.out.print("no of candidates: ");
    	int numCandidates = scanner.nextInt();
    	scanner.nextLine();
 
    	String[] candidates = new String[numCandidates];
    	int[] votes = new int[numCandidates];
    	for (int i = 0; i < numCandidates; i++) {
        	System.out.print("name of candidate " + (i + 1) + ": ");
        	candidates[i] = scanner.nextLine();
    	}
 
    	for (int i = 0; i < numCandidates; i++) {
        	System.out.print("votes for candidate " + candidates[i] + ": ");
        	votes[i] = scanner.nextInt();
    	}
 
    	// Count votes
    	int[] voteCounts = electionSystem.countVotes(candidates, votes);
    	System.out.println("Vote Counts:");
    	for (int i = 0; i < candidates.length; i++) {
        	System.out.println(candidates[i] + ": " + voteCounts[i]);
    	}
 
    	// Determine the winner
    	int winningCandidateIndex = electionSystem.determineWinner(voteCounts);
    	if (winningCandidateIndex == -1) {
        	System.out.println("It's a tie!");
    	} else {
        	System.out.println("Winner: " + candidates[winningCandidateIndex]);
    	}
    	scanner.close();
	}
}
