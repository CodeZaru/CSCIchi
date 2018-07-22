
public class RemoveDuplicates4 {

	public static void main(String[] args) {

		// Step 1 create a-c: a) test-Array of char; b) a boolean array and variables;
		// c) printArray method.
		// Step 1a
		char[] a = new char[] { 'b', 'l', 'a', 'w', 'h', 'g', 'b', 'w', 'a', 'l' };

		printArray(a);
		System.out.println("initial array printed ABOVE");
		a = removeDuplicate(a);
		System.out.println();
		printArray(a);		

	}
	// Summary: Remove duplicates from an array by using three arrays: original
	// array, boolean flag array, and destination array.
	// Step 1 create a-c: a) test-Array of char; b) a boolean array and variables;
	// c) printArray method.
	// step 2 create NESTED LOOP THAT FINDS REPEATS and sets all duplicate char to
	// true
	// step 3 create new array if was false (meaning no dup/repeat, b/c true flag
	// means dup/repeat)

	// Step 1 create a-c: a) test-Array of char; b) a boolean array and variables;
	// c) printArray method.

	public static char[] removeDuplicate(char[] a) {
		// Step 1b:
		boolean[] b = new boolean[a.length];

		int size = 0;
		
// step 2 create NESTED LOOP THAT FINDS REPEATS and sets all duplicate char to true.
		for (int i = 0; i < a.length; i++)
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
					b[j] = true;
			
				System.out.println("Check for Repeat and write to boolean array: a[" + i + "] = " + a[i] + " vs a[" + j + "] = " +a[j] );
			}	
		
		System.out.println("***** KSNOTE BEGIN: PRINTOUT TO VISUALIZE THE BOOLEAN ARRAY *****");
		for (int i = 0; i < a.length -1; i++)
		{
		System.out.println("Boolean FLAG RESULTS for a[" + i + "] = "+ a[i]+" in b[" + i + "] = " + b[i]);
		}
		System.out.println("***** KSNOTE END *************************************************");

// step 3 create new array if was false (meaning no dup/repeat, b/c true flag means dup/repeat)

		// step 3 PART A: create new array length assign to size variable--if was false (meaning no dup/repeat, b/c true flag means dup/repeat)
		
		for (int j = 0; j < a.length; j++)
		{
			if (!b[j])
			{
				size++;
				System.out.println("!b["+j+"] = "+b[j]);
			}
		}
		
		// step 3 PART B: VERY IMPORTANT TECHNIQUES IN USE HERE--DECLARE and BUILD NEW ARRAY: uses boolean flag condition,
				//AND GENERATES A SEQUENTIAL INDEX SEPARATE from the For loop's index
		char[] result = new char[size];
		int count = 0;
		for ( int j = 0; j < a.length; j++)
			if (!b[j])
				result[count++] = a[j];		

		return result;
	}


	public static void printArray(char a[]) 
	{
		for (int i = 0; i < a.length; i++)//NOTE: THIS WAS ERROR, B/C HAS TO BE A.LENGTH--FIXED, NOT IT WORKS 
		{
			System.out.println("Boolean FLAG array: a[" + i + "] = " + a[i]);
		}
	}
	
	
}
