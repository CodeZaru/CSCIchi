//b,d,a,f,g
//need to create a boolean array to keep track of which one you need
//Important usage of FLAGS again...

public class RemoveDuplicates2 {

	public static void main(String[] args) {

		char[] a = new char[] { 'b', 'd', 'a', 'b', 'f', 'a', 'g', 'a', 'a', 'f' };

		printArray(a);
		//removeDuplicate(a);
		a = removeDuplicate(a);
		System.out.println(a.length);
		printArray(a);

	}

	//step one create boolean array, 
	//step 2 set all duplicate char to true 
	//step 3 create new array if was false (meaning no dup, b/c true flag means dup)

	public static char[] removeDuplicate(char[] a) {
		boolean [] b = new boolean[a.length];
				int size = 0; //for tracking number of non-duplicate letters
		
		//start to build the the array (boolean flags)		
		//move i w/o moving j----know this relationship...
		for (int i = 0; i < a.length - 1; i++)
			for (int j = i + 1; j < a.length; j++) {
				if(a[i] == a[j]) {//set the repeated charater to false
					b[j]=true;
				}
			for (int i1 = 0; i1 < a.length; i1++)
				if(!b[i1]) size++;//this determines the new array size
			//		b[j] = true;//are you the same as me then mark with true
					//Might need to adjust this b/c if there are no repeats then the new array length will be zero
					}
		
		char [] result = new char[size];
		int count = 0;
		for (int i = 0; i < a.length; i++)
			if(!b[i])
				result[count++] = a[i];
		return result;

	}

	public static void printArray(char a[]) {

		for (int i = 0; i < a.length; i++)
			System.out.printf("%c ", a[i]);
		System.out.println();

	}
}
	