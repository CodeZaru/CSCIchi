
public class RemoveDuplicatesPostedVer {

	public static void main(String[] args) {
		char[] a = new char[] 
				{'b', 'd', 'a', 'b', 'f', 
				 'a', 'g', 'a', 'a', 'f'};
		printArray(a);
		a = removeDuplicate(a);
		System.out.println(a.length);
		printArray(a);
	}

	public static char[] removeDuplicate(char[] a) {
		boolean [] b = new boolean[a.length];
		int size = 0;	// For tracking number of non-duplicate letters
		
		for (int i = 0; i < a.length - 1; i++)
			for (int j = i + 1; j < a.length; j++)
				if (a[i] == a[j]) 	// Set the repeated character to false
					b[j] = true;
			
		for (int i = 0; i < a.length; i++)
			if (!b[i])
				size++;

		char[] result = new char[size];
		int count = 0;
		for (int i = 0; i < a.length; i++)
			if (!b[i]) 
				result[count++] = a[i];

		return result;
	}
		
	public static void printArray(char a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.printf("%c ", a[i]);
		System.out.println();
	}
}


