
public class ShiftArrayPractice2 {

	public static void main (String[] args) {
	//Create/declare an array with fixed content
	
	int[] numbers = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
	
	for (int j = 0; j < numbers.length; j++)
	System.out.printf("%d ", numbers[j]);
	System.out.println();
	
	//shift right by one
	for (int i = numbers.length -2; i >= 0; i--)	
		numbers[i+1] = numbers[i];
	numbers[0] = 0;

	for (int j = 0; j < numbers.length; j++)
	System.out.printf("%d ", numbers[j]);
	
}

}