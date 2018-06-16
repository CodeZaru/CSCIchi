

import java.util.Scanner;

public class P254Problem4v3 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = keyboard.nextInt();

		System.out.println(sum(n));
		keyboard.close();

	}

	public static int sum(int n) {

		int sum = 0;

		for (int i = 0; i < (n * 2); i++) {
			int remainder = (i % 2);
			if (remainder != 0) {
				sum +=i;
			}
		}
		return sum;
	}
}
