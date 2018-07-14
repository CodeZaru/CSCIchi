
public class SNAPractice3 {
//Interchange Sorting Algorithm:  any sorting algorithm that swaps, or interchanges, values.
	public static void main(String[] args) {
		// 1st step: define and print an array of random integers
		// 2nd step find the smallest integer
		// 3rd step swap smallest to first index place
		// 4th step create a nested loop construct that sorts the whole array
		// 5th step print results
		
// 1st step: define and print an array of random integers
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++)
			numbers[i] = (int) (Math.random() * 100);

		System.out.println("###############################");
		System.out.println("Step 1 - print array of random");
		System.out.println("###############################");
		int origIntAtIndex0 = numbers[0];
		for (int i = 0; i < numbers.length; i++)
			System.out.println("Array index ["+ i +"] value = " + numbers[i]);

// 2nd step find the smallest integer

		int smallestV2 = numbers[0];
		int origSmallestIndex = 0;
		for (int index = 0; index < numbers.length; index++)
		{
			if (smallestV2 > numbers [index])
			{
				smallestV2 = numbers [index];		
				origSmallestIndex = index;
			}//end "if" block
		}//end "for" block
		System.out.println("###############################");
		System.out.println("Step 2 - print 1st swap only (before nested loop)");
		System.out.println("###############################");
		System.out.printf("Smallest number in the array is %d\n", smallestV2);
		System.out.println(smallestV2 + " was at index [" + origSmallestIndex + "], but swapped with " + origIntAtIndex0 + " the number that was at numbers[0].");

// 3rd step swap smallest to first index place
			int temp = numbers[0];//keeps track of value that was initially at index [0], so can be swapped to the index [origSmallestIndex]
			numbers[0] = numbers[origSmallestIndex];//sets index[0] value to what was at index[origSmallestIndex]
			numbers[origSmallestIndex] = temp;//takes the temp variable that is holding the value of the first index[0] and puts it to the index where the new SmallestV came from.

	}

}
