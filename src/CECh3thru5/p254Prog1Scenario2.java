import java.util.Scanner;

public class p254Prog1Scenario2 {

public static void main(String[] args) {
	
	
Scanner keyboard = new Scanner(System.in);
	
	String input = "";

while (!input.equalsIgnoreCase("done")){
		System.out.print("enter a Word: ");
		input = keyboard.next();

if (input.charAt(0) == input.charAt(input.length()-1))
	System.out.println("First letter is same as last letter");
}
		
	}

}
