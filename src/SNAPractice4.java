//COMPARE WITH SNAP2, WHICH DOESN'T INCLUDE THE OUTERLOOP..
public class SNAPractice4 {
//Interchange Sorting Algorithm:  any sorting algorithm that swaps, or interchanges, values.
	public static void main(String[] args) {
		// 1st step: define and print an array of random integers
		// 2nd step find the smallest integer and its index (inner loop function)
		// 3rd step swap smallest to first index place (outer loop function)
		// 4th step create a nested loop construct that sorts the whole array
		// 5th step print results
		
// 1st step: define and print an array of random integers
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++)
			numbers[i] = (int) (Math.random() * 100);

		System.out.println("###############################");
		System.out.println("Step 1 - print array of random");
		System.out.println("###############################");

		for (int i = 0; i < numbers.length; i++)
			System.out.println("Array index ["+ i +"] value = " + numbers[i]);

//4th step WRAPS steps 2 and 3, creating a nested loop construct that sorts the whole array
//Outer For Loop Block Begin		
		for (int oForIndex = 0; oForIndex < numbers.length; oForIndex++) {		
		
//2nd step find the smallest integer
//BEGIN Inner "For" Loop
		int smallestV2 = numbers[oForIndex]; 
		int indexOfNewCurrentSmallest = oForIndex;//current iteration is always smallest index for this kind of search/sort/swap technique
		for (int iForIndex = oForIndex; iForIndex < numbers.length; iForIndex++)
		{
			if (smallestV2 > numbers [iForIndex])
			{
				smallestV2 = numbers [iForIndex];		
				indexOfNewCurrentSmallest = iForIndex;
			}//end "if" block
		}//END Inner "For" block

		int lowestIndexOfSearchRange = oForIndex;
		int newSmallest = numbers[lowestIndexOfSearchRange];
		System.out.println("#############################################");
		System.out.println("Step 2 - print swap summary (swap # " + (lowestIndexOfSearchRange+1) + " of 10)");
		System.out.println("#############################################");
		System.out.printf("Smallest number in the searched section of array is %d\n", smallestV2);
		System.out.println(smallestV2 + " was at index [" + indexOfNewCurrentSmallest + "], but swapped with " + newSmallest + " which was the number that was at new lowest index numbers[" + lowestIndexOfSearchRange + "].");

// 3rd step swap smallest to first index place

			int temp = numbers[oForIndex];
			numbers[oForIndex] = numbers[indexOfNewCurrentSmallest];
			numbers[indexOfNewCurrentSmallest] = temp;

			for (int i = 0; i < numbers.length; i++)
				System.out.println("Array index ["+ i +"] value = " + numbers[i]);
		}//END OUTER "FOR" LOOP BLOCK

	}

}
