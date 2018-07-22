
public class SNAPractice6 {

	//Interchange sorting algorithm: any sorting algorithm that swaps or interchanges values

	//KSNOTE: GIVEN THE NEW NAMING CONVENTIONS, THE OUTER LOOP ENDED UP ONLY BEING ONE LINE, 
	//AND A CHANGE TO THE VALUE ASSIGNED TO ONE "HOOK" VARIABLE THAT CONNECTED TO THE INNER LOOP.  
	//PLEASE TEST THIS APPROACH WITH THE SUDOKU AND OTHER NESTED LOOP CHALLENGES
	
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
			
			 
			 
			 
//2) 	Step 2-search the array for the smallest int and it's index (via for loop) 
//		and set to variables--this is the inner loop
			
			 
			 int currentSmallest = numbers[0];
			 int currentSmallestIndex = numbers[0];
			 int iForIndexStartValue = 0;
			 int temp = 0;
			 
			 for (int iForIndexRCtrl = iForIndexStartValue; iForIndexRCtrl < numbers.length; iForIndexRCtrl++ )
			 {
				 if(currentSmallest > numbers[iForIndexRCtrl])
				 {
					 currentSmallest = numbers[iForIndexRCtrl];
					 currentSmallestIndex = iForIndexRCtrl;
				 }
			 }
			 
			 System.out.println("currentSmallest = " + currentSmallest);
			 System.out.println("currentSmallestIndex = " + currentSmallestIndex);
			 
		
//3) 	Step 3-swap the smallest int's index location/value with index[0]--outside the inner loop 
//		and part of outer loop once it is developed.
			 
			 temp = numbers[iForIndexStartValue];
			 numbers[iForIndexStartValue] = currentSmallest;
			 numbers[currentSmallestIndex] = temp;

			 for (int i = 0; i < numbers.length; i++)
			 {
				 System.out.println("numbers [" + i + "] = " + numbers[i]);
			 }
			 
			 
		}
	}

