//If the number is greater than 100 OR between 50 and 75 (inclusive), print Yes
public class P193Prog6 {

	public static void main(String[] args) {
		
		System.out.print("Enter a number: ");
		int number = new java.util.Scanner(System.in).nextInt();

if ((number > 100) || ((number >= 50) && (number <= 75)))
	System.out.println("Yes");
	else
		System.out.println("No");
		

	}

}
