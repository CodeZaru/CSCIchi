	//create candidate class/objects
	//create Voters
	//create inner loop and outer loop that iterates thru the 4 or so candidates and 100 voters cannidate selection is random
	//part of loop code block creates voter with an id corresponding to index + 1.
	//static/class level variables model after the bank account example..
	//voter objects that are each only allowed to vote once (boolean votedP/VP true/false)
	//
import java.util.Scanner;

public class VoteRecorder {

//Note: I plan to make class variables private (esp instance variables), as for static,
//private unless a constant or otherwise specified.	Esp. given that this is a voteRecorder 
//for presidential election (we don't want external meddling no do we..)	
	
//define candidate variables
	private static String nameCandidatePresident1;
	private static String nameCandidatePresident2;
	private static String nameCandidateVicePresident1;
	private static String nameCandidateVicePresident2;
	
//define voteCount record variables
	private static int votesCandidatePresident1 = 0;
	private static int votesCandidatePresident2 = 0;
	private static int votesCandidateVicePresident1 = 0;
	private static int votesCandidateVicePresident2 = 0;

//define individual voter record variables
	private int myVoteForPresident;
	private int myVoteForVicePresident;
		
//other variables
	private static int numberOfVoters = 0;
	
//Constructors
	VoteRecorder()
	{
		myVoteForPresident = 0;
		myVoteForVicePresident = 0;
		numberOfVoters++;
	}
	VoteRecorder(int voteP, int voteVP)
	{
		myVoteForPresident = voteP;
		myVoteForVicePresident = voteVP;
	}
//Note: methods are normally public unless: helper method, 
//implementation hiding, or otherwise specified.
	public static void setCandidatesPresident(String name1, String name2) 
	{
		nameCandidatePresident1 = name1;
		nameCandidatePresident2 = name2;
	}
	public static void setCandidatesVicePresident(String name1, String name2)
	{
		nameCandidateVicePresident1 = name1;
		nameCandidateVicePresident2 = name2;
	}
	public static void resetVotes()
	{
		votesCandidatePresident1 = 0;
		votesCandidatePresident2 = 0;
		votesCandidateVicePresident1 = 0;
		votesCandidateVicePresident2 = 0;
	}
	public static String getCurrentVotePresident()
	{
		return nameCandidatePresident1 + ": " + votesCandidatePresident1 + 
				"vs" + nameCandidatePresident2  + ": " + votesCandidatePresident2;
	}
	public static String getCurrentVoteVicePresident()
	{
		return nameCandidateVicePresident1 + ": " + votesCandidateVicePresident1 + 
				"vs" + nameCandidateVicePresident2  + ": " + votesCandidateVicePresident2;
	}
	public void getAndConfirmVotes()
	{
		//this seems like a readInput() type method
		//need keyboard Scanner..
		//1) gets an individuals votes--maybe getVotes()?
		//2) confirms the individuals votes--maybe confirmVotes()?
		//3) records them---maybe recordVotes()?
	}
	private int getAVote(String name1, String Name2)
	{		
		return myVoteForPresident;
	}
	private int getVotes()
	{
		return myVoteForPresident + myVoteForVicePresident;
	}
	private boolean confirmVotes()
	{		
		return true;
	}
	private void recordVotes ()
	{
		if(myVoteForPresident == 1) votesCandidatePresident1++; 
		if(myVoteForPresident == 2) votesCandidatePresident2++; 
		if(myVoteForVicePresident == 1) votesCandidateVicePresident1++; 
		if(myVoteForVicePresident == 2) votesCandidateVicePresident2++; 
	}
	
//this main is just a test driver, not the demo	
public static void main(String[] args)
{
	
}
	
	
}
