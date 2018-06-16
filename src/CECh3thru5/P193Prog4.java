//This is to know how nested works
public class P193Prog4 {

	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		String sentence = new java.util.Scanner(System.in).nextLine();
		
		if (sentence.charAt(sentence.length() - 1) == '?')
//			if (sentence.length() % 2 == 0) // Even number of characters
			if ((sentence.length() -1) % 2 == 0) // Even number of characters excluding punctuation
				System.out.println("Yes");
			else
				System.out.println("No");
		else
			if(sentence.charAt(sentence.length() - 1) =='!')
			System.out.println("Wow");
			
			else
				System.out.printf("You always say \"%s\"",  sentence);//in all other cases, meaning not ? and no !
					
		
	}

}
