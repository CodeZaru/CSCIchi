/*
 * import java.util.Scanner;
 

public class ScratchWork {

	
	// Reads from keyboard the numerator and denominator input
	 
	public void readInput()
	{
		numerator = -1;
		denominator = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter numerator (positive integer)");
		while(numerator < 0)
			{//try again
			System.out.println("numerator must be a positive integer");
			numerator = keyboard.nextInt();
			}
		System.out.println("You entered: " + numerator);
		System.out.println("Enter a positive integer for the denominator (can't be zero)");
		while(denominator <= 0)
			{//try again
			System.out.println("denominator must be an integer > 0");
			denominator = keyboard.nextInt();
			}		
		System.out.println("You entered: " + denominator);
		
		simplify(numerator, denominator);
	}

	
	
}
*/