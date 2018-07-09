
public class PalindromeTest {

	public static int MAX_SIZE = 80;//I implemented a dynamic version, so this doesn't apply

	private int countOfEntries; // can be less than MAX_SIZE

	// declare array
	// private String[] pTArray;
	private char[] pTArray;

	PalindromeTest() {
		// pTArray = new String[MAX_SIZE];
		pTArray = new char[MAX_SIZE];
		countOfEntries = 0;// keeps track of index for add entry method
	}

	PalindromeTest(int arrayLength) {
		pTArray = new char[arrayLength];
		countOfEntries = 0;// keeps track of index for add entry method
	}

	// public void addItem(String arrayEntry)
	public void addItem(char arrayEntry) {
		pTArray[countOfEntries] = arrayEntry;
		countOfEntries++;
	}

	public static void main(String[] args) {

		System.out.println("Enter phrase to be tested.");
		String input = new java.util.Scanner(System.in).nextLine().toUpperCase();
		char inputChar = ' ';// try to put each character into cell

		System.out.println(input);
		System.out.println(input.length());
		// create PalindromeTest array which has array and counter
		PalindromeTest test1 = new PalindromeTest(input.length());

		int indexPositionTest1 = test1.countOfEntries;

		// add Item to array
		// test1.addItem(input);

		System.out.println("###");
		for (int i = 0; i < input.length(); i++) {
			inputChar = input.charAt(i);// input.length() -1);
			test1.addItem(inputChar);
			System.out.println(inputChar);
		}
		System.out.println("###");

		// test that counter increments after adding item
		int indexPositionTest2 = test1.countOfEntries;

		// print array contents at input index
		System.out.println(indexPositionTest1);
		System.out.println(indexPositionTest2);

		System.out.println("char at last position is:");
		System.out.println("dynamic array length: " + test1.pTArray[input.length() - 1]);
		System.out.println(test1.pTArray[indexPositionTest2 - 1]);

		boolean palindrome = false;

		int j = input.length() - 1;
		for (int i = 0; i < input.length() - 1; i++) 
			if (test1.pTArray[i] == test1.pTArray[j]) {
				System.out.println("Char from front " + test1.pTArray[i] + " vs char from reverse " + test1.pTArray[j]);
				palindrome = true;// if there is a match don't raise the flag
				j--;
			} else {
				System.out.println("Char from front " + test1.pTArray[i] + " vs char from reverse " + test1.pTArray[j]);
				palindrome = false;
				break;
			}
		if (palindrome)
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome.");

	}

}
