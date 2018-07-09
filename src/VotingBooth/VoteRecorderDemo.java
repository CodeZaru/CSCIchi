
public class VoteRecorderDemo {

	public static void main(String[] args) {

		VoteRecorder.resetVotes();

		String PresCandidate1 = "Annie";
		String PresCandidate2 = "Bob";
		String VicePresCandidate1 = "John";
		String VicePresCandidate2 = "Susan";
		VoteRecorder.setCandidatesPresident(PresCandidate1, PresCandidate2); 
		VoteRecorder.setCandidatesVicePresident(VicePresCandidate1, VicePresCandidate2); 
		
		for(int i = 0; i < 10; i++)
		{
			VoteRecorder voterName = new VoteRecorder((int)((Math.random()*2)+1),(int)((Math.random()*2)+1));	
		
		}	
		
		System.out.println();
		
		System.out.println("President: " + VoteRecorder.getCurrentVotePresident());
		System.out.println("Vice President: " + VoteRecorder.getCurrentVoteVicePresident());

		
		
	}

}
