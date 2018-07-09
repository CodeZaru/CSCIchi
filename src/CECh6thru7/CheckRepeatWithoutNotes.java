public class CheckRepeatWithoutNotes {

	public static void main(String[] args) {
		int [] numbers = new int[9];
		
		for (int i = 0; i < 9; i++)
			numbers[i] = (int)(Math.random() * 90 + 1);
		
		for (int i = 0; i < 9; i++)
			System.out.printf("%d ", numbers[i]);
		
		boolean repeated = false;
		
		for (int i = 0; i < 9; i++)
			for (int j = i + 1; j < 9; j++)
				if (numbers[i] == numbers[j]) {
					repeated = true;
					break;
				}
		
		System.out.println();
		if (repeated) 
			System.out.println("There is a repeat.");
		else
			System.out.println("There is no repeat.");
		
	}

}