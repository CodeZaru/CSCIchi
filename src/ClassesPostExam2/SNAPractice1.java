//KSNOTE:  create an original array so that I can line the first and last up
//side by side and then also see what is going on in the in between step.
public class SNAPractice1 {
//Interchange Sorting Algorithm:  any sorting algorithm  
//that swaps, or interchanges, values.
	public static void main(String[] args) {
		// 1st step: define and print an array of random integers
		// 2nd step find the smallest integer
		// 3rd step swap smallest to first index place
		// 4th step create a nested loop construct that sorts the whole array
		// 5th step print results
		
//step one:
		//Declare an array of random numbers and print them out
		int[] numbers = new int[10];

		//understand the for loop in prof Tseng's for loop stub disection lesson example
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = (int) (Math.random() * 100);//why the type cast..
		//numbers is data type int, what is Math.random() by default?
		System.out.println("###############################");
		System.out.println("Step 1 - print array of random");
		System.out.println("###############################");
		int origIntAtIndex0 = numbers[0];
		for (int i = 0; i < numbers.length; i++)
			System.out.println("Array index ["+ i +"] value = " + numbers[i]);
		
//step two:
		//find the smallest by declaring a smallest variable and looping through
//		int smallest = numbers[0];
//		for (int i = 0; i < numbers.length; i++)
//			if (smallest > numbers [i])
//				smallest = numbers [i];
//
//		System.out.println("###############################");
//		System.out.println("Step 2 - print smallest int");
//		System.out.println("Smallest interger: " + smallest);
//		System.out.println("###############################");
//step three:
		System.out.println("Some of the code is repeated for iterrative practice purposes.");
		// Swap the smallest number to the beginning of the array.
		int smallestV2 = numbers[0];
		int origSmallestIndex = 0;
		for (int index = 0; index < numbers.length; index++)//for loop index variable provides access to the Array index value
		{
			if (smallestV2 > numbers [index])
			{
				smallestV2 = numbers [index];//if true, sets the smallest number equal to the value at the current index iteration		
				origSmallestIndex = index;//keeps track of origIndex of where the smallest was
//				int temp = numbers[0];//keeps track of value that was initially at index [0], so can be swapped to the index [origSmallestIndex]
//				numbers[0] = numbers[origSmallestIndex];//sets index[0] value to what was at index[origSmallestIndex]
//				numbers[origSmallestIndex] = temp;//takes the temp variable that is holding the value of the first index[0] and puts it to the index where the new SmallestV came from.
			}//end "if" block
		}//end "for" block
//The original problem was that I closed the "for" block @ location below called "WRONG FOR BLOCK CLOSURE PLACE" 
//which caused inconsistent behavior for the swap values/action
//learn/think/practice more about clean code block techniques...
		System.out.println("###############################");
		System.out.println("Step 2 - print 1st swap only (before nested loop)");
		System.out.println("###############################");
		System.out.printf("Smallest number in the array is %d\n", smallestV2);
		System.out.println(smallestV2 + " was at index [" + origSmallestIndex + "], but swapped with " + origIntAtIndex0 + " the number that was at numbers[0].");
			// Swap the smallest number to the beginning of the array.
			int temp = numbers[0];//keeps track of value that was initially at index [0], so can be swapped to the index [origSmallestIndex]
			numbers[0] = numbers[origSmallestIndex];//sets index[0] value to what was at index[origSmallestIndex]
			numbers[origSmallestIndex] = temp;//takes the temp variable that is holding the value of the first index[0] and puts it to the index where the new SmallestV came from.
//"WRONG FOR BLOCK CLOSURE PLACE"
			
		//	System.out.println("numbers with first swap of smallest integer" + numbers[index]);
		
	}

}
