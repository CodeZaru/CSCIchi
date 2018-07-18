//these concepts will likely be on the FINAL EXAM
public class ShiftArray {

	public static void main(String[] args) {

		int [] numbers = new int [] {97, 67, 36, 73, 21};//declaring array as a fixed content
//Print original array
		for (int i = 0; i < numbers.length; i++)
			System.out.printf("%d ", numbers[i]);
		System.out.println();
		
//My first attemp...
//		for (int i = 3; i > 0; i--)
//		{
//			numbers[i+1] = numbers[i];
//			System.out.printf("%d ", numbers[i]);
//		}	
			
	//		4 operations:(rotate to right rotate to the left, shift to the right and shift to the left)
		
		// shift to right 
			for (int i = numbers.length - 2; i >= 0; i--)
				numbers[i+1] = numbers[i];
			numbers[0] = 0;
			
			//	rotate to the right: (also called "circular shift") shift to right and rotate the very last one to the first position
//			int temp = numbers[numbers.length -1];
//			for (int i = numbers.length - 2; i >= 0; i--)
//				numbers[i+1] = numbers[i];
//			numbers[0] = temp;

			
			
			
			//Print array after shift
			for (int i = 0; i < numbers.length; i++)
				System.out.printf("%d ", numbers[i]);

			
		}

	}


