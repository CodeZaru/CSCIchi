import java.util.Scanner;

public class LetterCountAlphabeticalArray {
	public static void main(String[] args) {
		int[] frequency = new int[26];
		int index = 0;
				
		System.out.println("type a sentence ending in a period");
		String input = new java.util.Scanner(System.in).nextLine().toUpperCase();
				
		while (input.charAt(index) != '.') {
			if (Character.isLetter(input.charAt(index)))
				frequency[input.charAt(index) - 'A']++;
			index++;
		}
		
		for(int i = 0; i< 26; i++)
			if (frequency[i] !=0)//program runs w/o this line line, but this gets rid of zeros which is part of the problems challenge
			System.out.printf("%c %d\n", 'A' + i, frequency[i]);//ASCII A + i gives the alphabet associated to our index
			
		
	
		}	
		
	
}
