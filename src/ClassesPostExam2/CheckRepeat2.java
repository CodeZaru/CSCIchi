
public class CheckRepeat2 {

	public static void main(String[] args) {
		int[] numbers = new int [9];
		//create array via random
		for (int i=0; i< 9; i++)
			numbers[i] = (int)(Math.random() * 9 + 1);
		
		//print to see what you have
		for (int i= 0; i< 9; i++)
			System.out.printf("%d ", numbers[i]);
		
		boolean repeated = false;
		
		//Complete your code here...
//I want to create a count method that counts the instances cell 
//one equals cell 2 and cell 3 and cell 4 and cell 5 and so on
//if one equals then flag it		
			for (int i = 0; i < 9; i++) //fist iteration go to inner loop
				//then go through the inner loop, then bounce out to the outer loop
				for (int j = i + 1; j < 9; j++) {
					if (numbers[i] == numbers[j]) {
						repeated = true;//if there is a repeat you raise the flag--DON'T do the else repeat is false just set the flag once
						break;
					}										
				}
		if (repeated)
			System.out.println("There is a repeat");
			else
			System.out.println("There is no repeat.");
				
	}
}
