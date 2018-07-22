
public class RemoveDuplicates4 {

	public static void main(String[] args) {
		
// Step 1 create a-c: a) test-Array of char; b) a boolean array and variables; c) printArray method.
//Step 1a
		char[] a = new char[] {'b','l','a','w','h','g','b','w','a','l'};
		
		printArray(a);
		
		
	}
	//Summary: Remove duplicates from an array by using three arrays: original array, boolean flag array, and destination array.  
		// Step 1 create a-c: a) test-Array of char; b) a boolean array and variables; c) printArray method.
		// step 2 create NESTED LOOP THAT FINDS REPEATS and sets all duplicate char to true
		// step 3 create new array if was false (meaning no dup/repeat, b/c true flag means dup/repeat)
		
// step 2 create NESTED LOOP THAT FINDS REPEATS and sets all duplicate char to true

public static void printArray(char a[])
{
	for (int i = 0; i < 10; i++)
	System.out.println("Boolean FLAG array: a[" + i + "] = " + a[i]);
}
	
}
