
import java.util.Scanner;
public class P254Prog1 {

	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
		
		String input;
		
		
		do {
			System.out.print("Enter word: ");
			input = keyboard.next();//.trim);
			
			if(!input.equalsIgnoreCase("done"));
			
			if (input.charAt(0) == input.charAt(input.length() -1))
				System.out.println("First letter is the same as last");
				
		} while (!input.equalsIgnoreCase("done"));
	 
		keyboard.close();
		}
		
	}



		
