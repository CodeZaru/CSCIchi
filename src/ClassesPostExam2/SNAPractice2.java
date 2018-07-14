//KSNOTE:  create an original array so that I can line the first and last up
//side by side and then also see what is going on in the in between step.
public class SNAPractice2 {
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
			numbers[i] = (int) (Math.random() * 100);

		System.out.println("###############################");
		System.out.println("Step 1 - print array of random");
		System.out.println("###############################");
		int origIntAtIndex0 = numbers[0];
		for (int i = 0; i < numbers.length; i++)
			System.out.println("Array index ["+ i +"] has value of: " + numbers[i]);
		
//step two:

//KS		for (int index = 0; index < numbers.length; index++) {
			// 1st step find the smallest
			// int smallest = 100;
			int smallest = numbers[0];//index];// change index [o] to dynamic variable[index]
			int smallestIndex = 0;//index;// identify index
			for (int i = 0; i < numbers.length; i++) {
				if (smallest > numbers[i]) {
					smallest = numbers[i];
					smallestIndex = i;// important: this tells us where the
				}
//				System.out.printf("Smallest number in the array is %d\n", smallest);
			}
			System.out.println("###############################");
			System.out.println("Step 2 - print first swap (inner loop)");
			System.out.println("###############################");
			System.out.printf("Smallest number in the array is %d\n", smallest);
			System.out.println(numbers[0] + " was at index [0], but swapped with " + smallest + " the number that was at [" + smallestIndex + "].");			
			
			// Swap the smallest number to the beginning of the array.
			int temp = numbers[0];//index];// changed index from hard coded [0] to [j]
			numbers[0] = numbers[smallestIndex];// changed index from hard coded [0] to [j]
			numbers[smallestIndex] = temp;

			// print the new array
			for (int i = 0; i < numbers.length; i++)
//			System.out.println("swap smallest with what was index[0]:" + numbers[i]);
			System.out.println("Array index ["+ i +"] value = " + numbers[i]);
//	KS	}
	}
}
