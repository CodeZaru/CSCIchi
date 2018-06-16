import java.util.Scanner;
public class P258Prog8 {

	public static void main(String[] args) {

		
		System.out.println("Think of a question in your mind to ask the 8-Ball");
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Ready to ask? Enter \"Y\" to ask or \"Q\" to quit");
	
		String input = "";		
		//String stop = "Q";
		input = keyboard.next();		
		if(input.equalsIgnoreCase("Y")) {
				
		while (!input.equalsIgnoreCase("Q")) {
//		do {
//			System.out.print("Enter a game command again: ");
//			input = keyboard.next();					
		switch ((int)(Math.random() * 8) + 1) {
		case 1: System.out.println("It is cerain"); break;
		case 2: System.out.println("It is decidedly so"); break;
		case 3: System.out.println("Most likely"); break;
		case 4: System.out.println("Signs point to yes"); break;
		case 5: System.out.println("Reply hazy, try agian"); break;
		case 6: System.out.println("Ask again later"); break;
		case 7: System.out.println("Don't count on it"); break;
		case 8: System.out.println("My sources say no"); break;
		}
		System.out.print("Enter a game command: ");
		input = keyboard.next();

			
		}
//		while (!input.equalsIgnoreCase("Q")); 		
		}
	}
}


