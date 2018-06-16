import java.util.Scanner;

public class p193prog1 {

	public static void main(String[] args) {
		
		System.out.print("Enter two numbers (separated by space): ");
		//print as opposed to println, stays on the same line
		
		Scanner input = new Scanner (System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		
		if (x % y == 0)
			System.out.printf("%d is divisible by %d.\n", x, y);
		else
			System.out.printf("%d is not divisible by %d.\n", x, y);

	}

}
