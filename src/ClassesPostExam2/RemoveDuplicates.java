//b,d,a,f,g
//need to create a boolean array to keep track of which one you need
public class RemoveDuplicates {

	public static void main(String[] args) {

		char[] a = new char[] { 'b', 'd', 'a', 'b', 'f', 'a', 'g', 'a', 'a', 'f' };

		printArray(a);
		removeDuplicate(a);
		printArray(a);

	}

	// using primitive form of charater but book uses upper case which is Character
	public static char[] removeDuplicate(char[] a) {

		// My strategy is to sort by ascii value and then do a conditional if equal then
		// remove and place in new array

		// Wrapper For Loop for the swap like deletion and insertion into new array
		for (int oForIndex = 0; oForIndex < a.length; oForIndex++) {
			int currentArrayIndexStart = oForIndex;
			char Char;
			int currentSmallestIntInRange = a[currentArrayIndexStart];
			int charASCIIValue;
			int currentSmallestIntIndex = currentArrayIndexStart;
			// for(int oForIndexPCtrl = 0; oForIndexPCtrl < a.length; oForIndexPCtrl++)
			for (int iForIndexRCtrl = 0; iForIndexRCtrl < a.length + 1; iForIndexRCtrl++) {
				charASCIIValue = (int) a[iForIndexRCtrl];// convert char to ASCII code
				System.out.println("test ascii value: " + charASCIIValue);
				if (currentSmallestIntInRange > charASCIIValue) {
					currentSmallestIntInRange = charASCIIValue;
					currentSmallestIntIndex = iForIndexRCtrl;
				}
				System.out.println(a[iForIndexRCtrl]);
			}

			char temp = a[currentArrayIndexStart];
			a[currentArrayIndexStart] = a[currentSmallestIntIndex];
			a[currentSmallestIntIndex] = temp;

			for (int i = 0; i < a.length; i++)
				System.out.println("Array index [" + i + "] value = " + a[i]);
			return a;

		} // END OUTER FOR LOOP

		return a;

	}

	public static void printArray(char a[]) {

		for (int i = 0; i < a.length; i++)
			System.out.printf("%c ", a[i]);
		System.out.println();

	}
}
