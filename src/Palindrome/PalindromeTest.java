
public class PalindromeTest {
	
	public static int MAX_SIZE = 8;
	
	private int countOfEntries; //can be less than MAX_SIZE
	
//	declare array
//	private String[] pTArray;
	private char[] pTArray;
	
	PalindromeTest ()
	{
//		pTArray = new String[MAX_SIZE];
		pTArray = new char[MAX_SIZE];
		countOfEntries = 0;//keeps track of index for add entry method
	}
	
//	public void addItem(String arrayEntry)
	public void addItem(char arrayEntry)
	{
		pTArray[countOfEntries] = arrayEntry;
		countOfEntries++;
	}
	
	public static void main(String[] args) {

		System.out.println("Enter phrase to be tested.");
		String input = new java.util.Scanner(System.in).nextLine().toUpperCase();
		char inputChar =' ';//try to put each character into cell
		
			System.out.println(input);

			//create PalindromeTest array which has array and counter
			PalindromeTest test1 = new PalindromeTest();
			int indexPositionTest1 = test1.countOfEntries;

			//add Item to array
			//test1.addItem(input);

			
			System.out.println("###");
			for (int i=0; i < input.length(); i++)
			{
				inputChar = input.charAt(i);//input.length() -1);
				test1.addItem(inputChar);
				System.out.println(inputChar);
			}	
			System.out.println("###");

			//test that counter increments after adding item
			int indexPositionTest2 = test1.countOfEntries;
			
			//print array contents at input index
			System.out.println(indexPositionTest1);
			System.out.println(indexPositionTest2);

			System.out.println("char at last position is:");
//			System.out.println(test1.pTArray[6]);
			System.out.println(test1.pTArray[indexPositionTest2-1]);

	
	}

}
