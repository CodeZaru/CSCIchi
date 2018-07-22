
public class ShiftArrayPractice4 {
	
	public static void main (String [] args) {
		
		int [] numbers = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
		
		for (int i = 0; i < numbers.length -1; i++)
		System.out.printf("%d, ", numbers[i]);
		System.out.println();
		
		int temp1 = numbers[0];
		int temp2 = numbers[1];
		int temp3 = numbers[2];
		
		for ( int i = 4; i < numbers.length; i++)   
			numbers[i-4] = numbers[i];
		
		numbers[9] = temp1;
		numbers[8] = temp2;
		numbers[7] = temp3;
		
		for (int i = 0; i < numbers.length -1; i++)
		System.out.printf("%d, ", numbers[i]);
		
		
		
		
		
		
		
		
		
		
	}

}
