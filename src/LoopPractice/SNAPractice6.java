
public class SNAPractice6 {

		public static void main (String args[]) {
		//1) step 1-create random integer array
		//2) step 2-search the array for the smallest int and it's index (via for loop) and set to variables--this is the inner loop
		//3) step 3-swap the smallest int's index location/value with index[0]--outside the inner loop and part of outer loop once it is developed.
		//4) step 4-add an outer loop and hook/integrate the indexes, so the inner and outer loops dynamically work with each other
		
	//step 1-create random integer array

			int [] numbers = new int [10];
			
			for (int i = 0; i < numbers.length; i++)
			{
				numbers[i] = (int)(Math.random() * 100);
			}
			 for (int i = 0; i < numbers.length; i++)
			 {
				 System.out.println("numbers [" + i + "] = " + numbers[i]);
			 }
			
			 

//4) 	Step 4-add an outer loop and hook/integrate the indexes, so the inner 
 //		and the outer loops dynamically work with each other			 
			 
			 for (int oForIndexPCtrl = 0; oForIndexPCtrl < numbers.length; oForIndexPCtrl++)
			 {
				 			 
//2) 	Step 2-search the array for the smallest int and it's index (via for loop) 
//		and set to variables--this is the inner loop

//ERROR #2 WAS THE NEXT LOC				 
			 int currentArrayIndexStart = oForIndexPCtrl;// IS 0 WHEN SINGLE LOOP THEN CHANGES TO oForIndexPCtrl;  
				 
			 int currentSmallestIntInRange = numbers[currentArrayIndexStart];//changed from number[0] to numbers[iForIndexStartValue] 
//ERROR #1 WAS THE NEXT LOC
			 int currentSmallestIndex = currentArrayIndexStart;//THIS WAS MY ERROR!!!!! i HAD "numbers[currentArrayIndexStart];" ON RIGHT SIDE OF ASSIGNMENT AND BEFORE THAT: changed [0] to [iForIndexStartValue]
			 
			// int temp = 0;
//BEGIN INNER LOOP	 
			 for (int iForIndexRCtrl = currentArrayIndexStart+1; iForIndexRCtrl < numbers.length; iForIndexRCtrl++ )
			 //{
				 if(currentSmallestIntInRange > numbers[iForIndexRCtrl])
				 {
					 currentSmallestIntInRange = numbers[iForIndexRCtrl];
					 currentSmallestIndex = iForIndexRCtrl;

				 }
			 //}//END Inner
			 
		System.out.println("##########################################################################");
		System.out.println("step 2-search the array for the smallest int and it's index (via for loop)");
		System.out.println("and print swap summary (swap # " + (currentArrayIndexStart+1) + " of 10)");	
		System.out.println("##########################################################################");
		System.out.println("The smallest Int is: " + currentSmallestIntInRange + " at index [" + currentSmallestIndex + "].");
		System.out.println(currentSmallestIntInRange + " was at index[" + currentSmallestIndex + "], but swapped with " + numbers[currentArrayIndexStart] + " which was the number at the lowest index in current range: numbers[" + currentArrayIndexStart + "].");

			 
		
//3) 	Step 3-swap the smallest int's index location/value with index[0]--outside the inner loop 
//		and part of outer loop once it is developed.
			 
			 int temp = numbers[currentArrayIndexStart];
//ERROR #3 WAS THE NEXT LOC				 
			 numbers[currentArrayIndexStart] = numbers[currentSmallestIndex];//--KS Original error RIGHT SIDE OF ASSIGNMENT WAS"= currentSmallest; INSTEAD OF numbers[currentSmallestIndex]; 
			 numbers[currentSmallestIndex] = temp;

			 for (int i = 0; i < numbers.length; i++)
			 {
				 System.out.println("numbers [" + i + "] = " + numbers[i]);
			 }

			 
			 
		 } //END Outer
	}
}

