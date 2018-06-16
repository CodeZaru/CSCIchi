/*
 * Write a program to play the rock-paper-scissor game. Each of two users types in either P, R, or S.
 * The program then announces the winner as well as the basis for determining the winner: paper
 * covers rock, rock breaks scissors, scissors cuts paper, or nobody wins. Your program should allow
 * the users to use lowercase as well as uppercase letters.
 */
import javax.swing.JOptionPane;
import java.util.Scanner;

public class RPSGame {

	enum HandChoice {R, P, S}
	
	public static void main(String[] args) {

		//1-player or 2-player options 
		char user1Hand;
		char user2Hand;
		char computerHand;
		
		int user1WinCount;
		int user1LossCount;
		int user1TieCount;
		
		int user2WinCount;
		int user2LossCount;
		int user2TieCount;

		int computerWinCount;
		int computerLossCount;
		int computerTieCount;

			
	//	jOption prompt user for game play options: 1-player or 2-players
	//  either calls the computers hand method and assigns to opponent or the 2nd player and assigns to opponent
	//  note: can't have a game w/o player-1, so all other players are opponent.
	//  game play should continue until stopped via sentinel value (JOption click in this case)...
	//  need a method that generates computer's hand 
	//  need a method game that conducts the game play and determines winning hand

		}

	public HandChoice generateComputerHand() {
		HandChoice computerHand = null;
		
		int computerHandNumber = (int)((Math.random()*3)+1);
		if (computerHandNumber == 1) {computerHand = HandChoice.R;}
		if (computerHandNumber == 2) {computerHand = HandChoice.P;}
		if (computerHandNumber == 3) {computerHand = HandChoice.S;}
		return computerHand;
	}
	
	public String gamePlay() {
		
		//on prompt, we need to convert their input to UpperCase.
		
		HandChoice player1Hand;
//		player1Hand = HandChoice.R;//passed in
		player1Hand = generateComputerHand();
	
		HandChoice opponentHand;
//		opponentHand = HandChoice.R;//passed in
		opponentHand = generateComputerHand();

		String gameResult = "test";
		
		switch (player1Hand)
		{
		case R: System.out.println("Player-1 plays a \"Rock\"");
			if (opponentHand == HandChoice.P)
				gameResult = "Opponent wins with a graceful sheet of \"Paper\" to cover \"Rock\"!";
				//System.out.println("Opponent win!");
			if (opponentHand == HandChoice.S)
				gameResult = "Player-1 wins by crushing his opponents \"Scissors\" with his \"Rock\"!";				
				//System.out.println("Player1 win!");
			if (opponentHand == HandChoice.R)
				gameResult = "The Opponent whips out a \"Rock\" and the match is a Tie!";				
				//System.out.println("Player1 win!");
			break;
		case P: System.out.println("Player-1 plays a sheet of \"Paper\"");
			if (opponentHand == HandChoice.P)
				gameResult = "And it is a \"Paper\" for \"Paper\" Tie!";
				//System.out.println("Opponent win!");
			if (opponentHand == HandChoice.S)
				gameResult = "The Opponent cuts up Player-1's Paper with a Giant \"Scissors!\". Opponent's Win!";				
				//System.out.println("Player1 win!");
			if (opponentHand == HandChoice.R)
				gameResult = "Player-1 wins by \"Papering\" his Opponent's \"Rock\"!";				
				//System.out.println("Player1 win!");
			break;
		case S: System.out.println("Player-1 plays a \"Scissors\"");
			if (opponentHand == HandChoice.P)
				gameResult = "Player-1 wins by taking a sharp \"Scissors\" to the Opponent's pretty \"Paper\"!";
				//System.out.println("Opponent win!");
			if (opponentHand == HandChoice.S)
				gameResult = "Tie with dueling \"Scissors\"!";				
				//System.out.println("Player1 win!");
			if (opponentHand == HandChoice.R)
				gameResult = "The Opponent crushes Player-1's \"Scissors\" with a huge \"Rock\"";				
				//System.out.println("Player1 win!");
			break;
		default: System.out.println("Something is wrong!");	
		}

		return gameResult;
	}
	
}
