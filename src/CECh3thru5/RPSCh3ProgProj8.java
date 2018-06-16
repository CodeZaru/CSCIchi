/*
 * Write a program to play the rock-paper-scissor game. Each of two users types in either P, R, or S.
 * The program then announces the winner as well as the basis for determining the winner: paper
 * covers rock, rock breaks scissors, scissors cuts paper, or nobody wins. Your program should allow
 * the users to use lowercase as well as uppercase letters.
 */
import javax.swing.JOptionPane;
import java.util.Scanner;

public class RPSCh3ProgProj8 {

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
	//  game play should continue until stopped via sentinal value (JOption click in this case)...
	//  need a method that generates computer's hand 
	//  need a method game that conducts the game play and determines winning hand

		}

	public double generateComputerHand() {
		double computerHand = (Math.random()*3);
		return computerHand;
	}
	
	public void testGenerateComputerHand() {
		double computerHand = generateComputerHand();
		System.out.print("computerHand: " + computerHand);
	}
	
	
}
