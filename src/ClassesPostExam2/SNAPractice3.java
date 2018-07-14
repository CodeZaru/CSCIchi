
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
		//int origIntAtIndex0 = numbers[0];
		for (int i = 0; i < numbers.length; i++)
			System.out.println("Array index ["+ i +"] value = " + numbers[i]);

//4th step WRAPS steps 2 and 3, creating a nested loop construct that sorts the whole array
//Outer For Loop Block Begin		
//KSNOTE: the LineOfCode(LOC) below is change 1 or x to go from single swap to full array sort via iterative swap
		for (int oForIndex = 0; oForIndex < numbers.length; oForIndex++) {		
		
//2nd step find the smallest integer
//BEGIN Inner "For" Loop
//KSNOTE: next three LOCs are tweaked from original single swap version of code in order to HOOK the inner For Loop into the outer For Loop
		int smallestV2 = numbers[oForIndex];//Tweak1: hook into outer loop (numbers[HOOK]) by creating dynamic index change "numbers[0]" to "numbers[oforIndex]" 
		int origSmallestIndex = oForIndex;//Tweak2: hook into outer loop (= HOOK;) by creating dynamic index change "numbers[0]" to "numbers[oforIndex]"
		for (int iForIndex = oForIndex; iForIndex < numbers.length; iForIndex++)//Tweak3: hook into outer loop (int iForIndex = HOOK) by creating dynamic index change "int iForIndex = 0" to "int iForIndex = oforIndex"
			//think about what this is doing conceptually
		{
			if (smallestV2 > numbers [iForIndex])
			{
				smallestV2 = numbers [iForIndex];		
				origSmallestIndex = iForIndex;
			}//end "if" block
		}//END Inner "For" block
		
		System.out.println("###############################");
		System.out.println("Step 2 - print swap summary");
		System.out.println("###############################");
		System.out.printf("Smallest number in the searched section of array is %d\n", smallestV2);
		int lowestIndexOfSearchRange = oForIndex;
		int newSmallest = numbers[lowestIndexOfSearchRange];
		System.out.println(smallestV2 + " was at index [" + origSmallestIndex + "], but swapped with " + newSmallest + " the number that was at numbers[" + lowestIndexOfSearchRange + "].");

// 3rd step swap smallest to first index place
//KSNOTE: next two LOCs are tweaked from original single swap version of code in order to HOOK the inner For Loop into the outer For Loop		
			//Tweak1: hook into outer loop ( = numbers[HOOK];) dynamically so that the temp is always on the current outer loop index by creating dynamic index change "numbers[0]" to "numbers[oforIndex]"
			int temp = numbers[oForIndex];//keeps track of value that was initially at index [x, lowest of the range still being searched], so can be swapped to the index [origSmallestIndex]
			//Tweak2: hook into outer loop (numbers[HOOK]=) dynamically so that the temp is always on the current outer loop index by creating dynamic index change "numbers[0]" to "numbers[oforIndex]"
			numbers[oForIndex] = numbers[origSmallestIndex];//sets index[0] value to what was at index[origSmallestIndex]
			numbers[origSmallestIndex] = temp;//takes the temp variable that is holding the value of the first index[0] and puts it to the index where the new SmallestV came from.

			for (int i = 0; i < numbers.length; i++)
				System.out.println("Array index ["+ i +"] value = " + numbers[i]);
		}//END OUTER "FOR" LOOP BLOCK
	}

}
