import java.util.Scanner;

public class LetterCountAlphabeticalArray {
	public static void main(String[] args) {
		int[] frequency = new int[26];
		int index = 0;
				
		System.out.println("type a sentence ending in a period");
		String input = new java.util.Scanner(System.in).nextLine().toUpperCase();
				
		//while (input.charAt(index) != '.') { //sentinel value, looks at one letter at a time and loops through
		while (input.charAt(index++) != '.') { //sentinel value, looks at one letter at a time and loops through and moved index to gaurd	
			if (Character.isLetter(input.charAt(index)))//this is the validation guard that ensures the data entered is a letter..might also be able to use isaphabetic
				frequency[input.charAt(index) - 'A']++;//provides me the corresponding to the index ASCII math 
			//the frequency[input.charAt(index)//note that this first part extracts the letter and the
			//- 'A']// part gets the ASCII value converted into our array index of 0thru 25
			//++; on the line outside the bracket line note that the ++ makes increments the frequency count..not the index 25 be 26...I think 
			//index++;
		}
		
		for(int i = 0; i< 26; i++)
			if (frequency[i] !=0)//program runs w/o this line line, but this gets rid of zeros which is part of the problems challenge
			System.out.printf("%c %d\n", 'A' + i, frequency[i]);//ASCII A + i gives the alphabet associated to our index
			
		
	
		}	
		
	
}
