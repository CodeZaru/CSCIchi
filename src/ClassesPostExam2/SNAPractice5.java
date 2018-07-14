//Interchange sorting algorithm: any sorting algorithm that swaps or interchanges values
public class SNAPractice5 {
	public static void main (String args[]) {
	//1) step 1-create random integer array
	//2) step 2-search the array for the smallest int and it's index (via for loop)
	//3) step 3-swap the smallest int's index location/value with index[0]
	//4) step 4-add an outer loop and hook/integrate the indexes 
	//so the inner and outer loops dynamically work with 
	
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
	
	
	
}
}
