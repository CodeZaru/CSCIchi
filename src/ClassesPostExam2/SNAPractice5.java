//Interchange sorting algorithm: any sorting algorithm that swaps or interchanges values

//KSNOTE: GIVEN THE NEW NAMING CONVENTIONS, THE OUTER LOOP ENDED UP ONLY BEING ONE LINE, 
//AND A CHANGE TO THE VALUE ASSIGNED TO ONE "HOOK" VARIABLE THAT CONNECTED TO THE INNER LOOP.  
//PLEASE TEST THIS APPROACH WITH THE SUDOKU AND OTHER NESTED LOOP CHALLENGES
public class SNAPractice5 {
	public static void main (String args[]) {
	//1) step 1-create random integer array
	//2) step 2-search the array for the smallest int and it's index (via for loop) and set to variables--this is the inner loop
	//3) step 3-swap the smallest int's index location/value with index[0]--outside the inner loop and part of outer loop once it is developed.
	//4) step 4-add an outer loop and hook/integrate the indexes, so the inner and outer loops dynamically work with each other
	
//step 1-create random integer array
	int [] numbers = new int [10];
	
	for (int i = 0; i < numbers.length; i++)
//	{
		numbers[i] = (int) (Math.random() * 100);
//		System.out.println(numbers[i]);
//	}

	System.out.println("##################################################");
	System.out.println("Step 1 - create and print array of random integers");
	System.out.println("##################################################");
	
	for (int i = 0; i < numbers.length; i++)
		System.out.println("Array index [" + i + "] value = " + numbers[i]);
	
	

//step 4-(WRAP STEPS 2 AND 3) add an outer loop and hook/integrate the indexes, so the inner and outer loops dynamically work with each other	
//BEGIN OUTER FOR LOOP	
for (int oForIndex = 0; oForIndex < numbers.length; oForIndex++)
	{
	
//step 2-search the array for the smallest int and it's index (via for loop) and set to vairables--this is the inner loop
	
	int currentArrayIndexStart = oForIndex;//When add outer loop, change from " = 0" to " = oForIndex"...maybe could make this +1 on the index value... and note that obviously redundant, but for the sake of communicating concepts...
	int currentSmallestIntInRange = numbers[currentArrayIndexStart];
	int currentSmallestIntIndex = currentArrayIndexStart;
//BEGIN INNER FOR LOOP
	for (int iForIndex = currentArrayIndexStart+1; iForIndex < numbers.length; iForIndex++)
		if(currentSmallestIntInRange > numbers[iForIndex])
		{
		currentSmallestIntInRange = numbers[iForIndex];
		currentSmallestIntIndex = iForIndex;
		}
//END INNER FOR LOOP

	System.out.println("##########################################################################");
	System.out.println("step 2-search the array for the smallest int and it's index (via for loop)");
	System.out.println("and print swap summary (swap # " + (currentArrayIndexStart+1) + " of 10)");	
	System.out.println("##########################################################################");
	System.out.println("The smallest Int is: " + currentSmallestIntInRange + " at index [" + currentSmallestIntIndex + "].");
	System.out.println(currentSmallestIntInRange + " was at index[" + currentSmallestIntIndex + "], but swapped with " + numbers[currentArrayIndexStart] + " which was the number at the lowest index in current range: numbers[" + currentArrayIndexStart + "].");
	
	//3) step 3-swap the smallest int's index location/value with index[0]
	int temp = numbers[currentArrayIndexStart];
	numbers[currentArrayIndexStart] = numbers[currentSmallestIntIndex];
	numbers[currentSmallestIntIndex] = temp;

	for(int i = 0; i < numbers.length; i++)
		System.out.println("Array index [" + i + "] value = " + numbers [i]);
	}//END OUTER FOR LOOP	
}
}
