
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

	// step 1 create boolean array,
	// step 2 set all duplicate char to true
	// step 3 create new array if was false (meaning no dup, b/c true flag means dup
	

	
	public static char[] removeDuplicate(char[] a) {
		boolean[] b = new boolean[a.length];
		int size = 0; // for tracking number of non-duplicate letters
		System.out.println("");
		System.out.println("Size variable initialized as: " + size);
		System.out.println("");
		
		
		// start to build the the array (boolean flags)
		// IMPORTANT: move i w/o moving j----know this relationship...
		for (int i = 0; i < a.length - 1; i++)
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {// set the repeated character to true
					b[j] = true;// true means dup
				}
				System.out.println("Check for Repeat and write to boolean array :  a[" + i + "] = " + a[i] + " vs a[" + j + "] = " + a[j] );//+ ". RESULTS in b[] FLAG = b[" + j + "] = " + b[j]);
			}
		
		System.out.println("***************************************");
		for (int i = 0; i < a.length -1; i++)
		{
		System.out.println("Boolean FLAG RESULTS for a[" + i + "] = "+ a[i]+" in b[" + i + "] = " + b[i]);
		}
		System.out.println("***************************************");
		
		for (int i = 0; i < a.length; i++) 
		{
			if (!b[i])
			{
				size++;// this determines the new array size
				System.out.println("!b["+i+"] = "+b[i]);
			}
		}
		
		System.out.println("size variable = " + size);

		char[] result = new char[size];
		int count = 0;
		for (int i = 0; i < a.length; i++)
			if (!b[i])
				result[count++] = a[i];
		return result;

	}

	public static void printArray(char a[]) {

		for (int i = 0; i < a.length; i++) {
			// System.out.printf("%c ", a[i]);
			// System.out.println();

			System.out.println("boolean array: a[" + i + "] = " + a[i]);
		}
	}
}
