//these concepts will likely be on the FINAL EXAM

public class ShiftArrayPractice1 {

	// 1) create main method/Driver
	// 1a) Declare array as fixed content
	// 1b) Create a simple for loop to print array

	// 2) Create the shift/rotate For Loop code right in the main method, this is very simple logic..

	public static void main(String[] args) {

		int[] numbers = new int[] { 97, 67, 36, 73, 21 };// declaring array as a fixed content
		// Print original array
		for (int i = 0; i < numbers.length; i++)
			System.out.printf("%d ", numbers[i]);
		System.out.println();

		// 4 operations:(rotate to right rotate to the left, shift to the right and shift to the left)

		// SHIFT to RIGHT For Loop (note that the index starting point is one less than total # of indexes and downCounts to 0)
		for (int i = numbers.length - 2; i >= 0; i--)//the index starting point and downCount end up NOT INCLUDING the value farthest to the right
			numbers[i + 1] = numbers[i];//Shift is achieved by assigning the remaining numbers of the For Loop to the same array and shifting the index +1
		numbers[0] = 0;//assign a zero to the farthest index to the left so there is no dup of the value shifted from index 0 to 1.

		// rotate to the right: (also called "circular shift") shift to right and rotate
		// the very last one to the first position
		// int temp = numbers[numbers.length -1];
		// for (int i = numbers.length - 2; i >= 0; i--)
		// numbers[i+1] = numbers[i];
		// numbers[0] = temp;

		// Print array after shift
		for (int i = 0; i < numbers.length; i++)
			System.out.printf("%d ", numbers[i]);

	}

}
