/*
Write a program that will record the votes for one of two candidates 
by using the class VoteRecorder, which you will design and create. 
Vote Recorder will have static variables to keep track of the total votes 
for candidates and instance variables to keep track of the votes made 
by a single person. It will have the following attributes: 
	1) 	nameCandidatePresident1—a static string that holds the name of 
		the first candidate for president 

	2)	nameCandidatePresident2—a static string that holds the name of 
		the second candidate for president 

	3)	nameCandidateVicePresident1—a static string that holds the name of
		the first candidate for vice president 

	4)	nameCandidateVicePresident2—a static string that holds the name of 
		the second candidate for vice president 

	5)	votesCandidatePresident1—a static integer that holds the number of 
		votes for the first candidate for president 

	6)	votesCandidatePresident2—a static integer that holds the number of 
		votes for the second candidate for president 

	7)	votesCandidateVicePresident1—a static integer that holds the 
		number of votes for the first candidate for vice president 

	8)	votesCandidateVicePresident2—a static integer that holds the 
		 number of votes for the second candidate for vice president 

	9)	myVoteForPresident—an integer that holds the vote of a single 
		individual for president (0 for no choice, 1 for the first  
		candidate, and 2 for the second candidate) 

	10)	myVoteForVicePresident—an integer that holds the vote of a single 
		individual for vice president (0 for no choice, 1 for the first 
		candidate, and 2 for the second candidate) 
	
	In addition to appropriate constructors, VoteRecorder has the 
	following methods: 
	1)	setCandidatesPresident(String name1, String name2)—a static method 
		that sets the names of the two candidates for president 

	2)	setCandidatesVicePresident(String name1, String name2)—a static 
		method that sets the names of the two candidates for vice president 

	3)	resetVotes—a static method that resets the vote counts to zero 

	4)	getCurrentVotePresident—a static method that returns a string with 
		the current total number of votes for both presidential candidates 

	5)	getCurrentVoteVicePresident—a static method that returns a string 
		with the current total number of votes for both vice presidential 
		candidates 

	6)	getAndConfirmVotes—a non-static method that gets an individual’s 
		votes, confirms them, and then records them 

	7)	getAVote(String name1, String name2)—a private method that returns 
		a vote choice for a single race from an individual (0 for no choice, 
		1 for the first candidate, and 2 for the second candidate) 

	8)	getVotes—a private method that returns a vote choice for president 
		and vice president from an individual 

	9)	confirmVotes—a private method that displays a person’s vote for 
		president and vice president, asks whether the voter is happy 
		with these choices, and returns true or false according to 
		a yes-or-no response 

	10)	recordVotes—a private method that will add an individual’s votes 
		to the appropriate static variables 
		
Create a program that will conduct an election. The candidates 
for president are Annie and Bob. The candidates 
for vice president are John and Susan. Use a loop to record the 
votes of many voters. Create a new Vote Recorder object for each 
voter. After all the voters are done, present the results.
		
		*/