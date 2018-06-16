import java.util.Scanner;

public class CSCClass3Notes {

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		String input = "";		
		String stop = "DONE";
		
		while (!input.equalsIgnoreCase("done")) {
			System.out.print("Enter a word: ");
			input = keyboard.next();
			
		if (input.charAt(0) == input.charAt(input.length()-1)) 
			System.out.println("first and last charaters match"); //break;
			
			
			
		//	else
				
		//	System.out.println("first and last charaters DON'T match");// break;
							   
		
	}

}
}


