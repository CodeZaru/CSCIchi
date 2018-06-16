//Exercise 4 on p 254
import java.util.Scanner;

public class P254Prog2Scenario2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String input = "";		
		String secret = "53840";
		String guess = "";
//		int correctCount = 0;
//		int correctSum = 0;
		
	//	for (int tries = 0; tries < 5; tries++) {
	do {				
		//coded this first, then added the for loop construct around it.	
		System.out.print("Enter a five digit number: ");
		guess = keyboard.next();
		
		int correctCount = 0;
		int correctSum = 0;
		
		for (int i=0; i < secret.length(); i++) {
					
			if ( secret.charAt(i) == guess.charAt(i)) {
				correctCount++;
				correctSum += Integer.parseInt(secret.substring(i,  i+1));
				//correctSum += Integer.parseInt(secret.charAt(i) + "");
				//correctSum += secret.charAt(i) - 48;
				//guess and secret are interchangeable in the above two lines b/c they are equal.
			}
		
		}
				
		System.out.printf("%d %d\n",  correctCount, correctSum);
	}while (!secret.equalsIgnoreCase(guess));
		//if (secret.equalsIgnoreCase(guess))
			//break;
		}
		}

