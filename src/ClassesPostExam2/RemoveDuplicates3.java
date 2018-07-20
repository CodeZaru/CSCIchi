
public class RemoveDuplicates3 {
	// b,d,a,f,g
	// need to create a boolean array to keep track of which one you need
	// Important usage of FLAGS again...

	public static void main(String[] args) {

		char[] a = new char[] { 'b', 'd', 'a', 'b', 'f', 'a', 'g', 'a', 'a', 'f' };

		printArray(a);
		System.out.println("initial array printed ABOVE");
		a = removeDuplicate(a);
		System.out.println("");
		System.out.println("The length of the new array is calculated into the \"size\" variable"
				+ "and based on the false values in b[], derived by !b[] condition and new length is:" + a.length);
		System.out.println("");
		printArray(a);

	}
//Summary: Remove duplicates from an array by using three arrays: original array, boolean flag array, and destination array.  
	// step 1 create boolean array and variables,
	// step 2 create NESTED LOOP THAT FINDS REPEATS and sets all duplicate char to true
	// step 3 create new array if was false (meaning no dup/repeat, b/c true flag means dup/repeat)
		
	public static char[] removeDuplicate(char[] a) 
	{

// Step 1 create boolean array and variables		
		boolean[] b = new boolean[a.length];//define boolean array same size as initial array.
		
		int size = 0; // initialize variable for for tracking number of non-duplicate letters
		
// Step 2 create NESTED LOOP THAT FINDS REPEATS and sets
		for (int i = 0; i < a.length - 1; i++)
			for (int j = i + 1; j < a.length; j++) 
			{
				if (a[i] == a[j]) 
				{
					b[j] = true;//IMPORTATN SIMPLE ONE LOC-true means dup/repeat
				}
					// The above LOC sets the repeated character to true 
					// This is how we start to build the the array (boolean flags)
					// IMPORTANT: move i w/o moving j----know this relationship...				
				System.out.println("Check for Repeat and write to boolean array :  a[" + i + "] = " + a[i] + " vs a[" + j + "] = " + a[j] );//+ ". RESULTS in b[] FLAG = b[" + j + "] = " + b[j]);
			}

		System.out.println("***** KSNOTE BEGIN: PRINTOUT TO VISUALIZE THE BOOLEAN ARRAY *****");
		for (int i = 0; i < a.length -1; i++)
		{
		System.out.println("Boolean FLAG RESULTS for a[" + i + "] = "+ a[i]+" in b[" + i + "] = " + b[i]);
		}
		System.out.println("***** KSNOTE END *************************************************");
		
// step 3 PART A: create new array if was false (meaning no dup/repeat, b/c true flag means dup/repeat)
		for (int i = 0; i < a.length; i++) 
		{
			if (!b[i])	//IMPORTANT: THIS LOC means if boolean FLAG is set to false, which means no dup/repeat,
			{			//then increment size variable, which is the new array length.
				size++;
				System.out.println("!b["+i+"] = "+b[i]);
			}
		}
// step 3 PART B: VERY IMPORTANT TECHNIQUES IN USE HERE--DECLARE and BUILD NEW ARRAY: uses boolean flag condition,
		//AND GENERATES A SEQUENTIAL INDEX SEPARATE from the For loop's index
		char[] result = new char[size];
		int count = 0;
		for (int i = 0; i < a.length; i++)
			if (!b[i])
				result[count++] = a[i];//by incrementing the index you don't overwrite values, and don't have unused array idexes
		return result;

	}

	public static void printArray(char a[]) 
	{
		for (int i = 0; i < a.length; i++) 
		{
			// System.out.printf("%c ", a[i]);
			// System.out.println();

			System.out.println("boolean array: a[" + i + "] = " + a[i]);
		}
	}
	
}
