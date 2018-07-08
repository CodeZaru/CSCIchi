import java.util.Scanner;

public class RatNumGCDDemo2 {

	public static void main(String[] args) {

		String response;

		RatNumGCD test1 = new RatNumGCD();
		test1.writeOutput(test1);

		System.out.println("##################################################");
		System.out.println("Would you like to try again? (type yes or no)");
		Scanner keyboard = new Scanner(System.in);
		response = keyboard.next();
		if (response.equalsIgnoreCase("yes")) {
			do {
				test1.readInput();
				test1.writeOutput(test1);
				System.out.println("##################################################");
				System.out.println("Would you like to try again? (type yes or n0)");
				response = keyboard.next();
			} while (response.equalsIgnoreCase("yes"));

		}

	}
}